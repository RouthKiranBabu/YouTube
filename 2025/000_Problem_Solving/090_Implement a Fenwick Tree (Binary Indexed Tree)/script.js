// Fenwick Tree (Binary Indexed Tree) Implementation in JavaScript
// -----------------------------------------------------------
// Problem:
// We need an efficient data structure for:
// 1. Point Updates (incrementing values).
// 2. Prefix Sum Queries.
//
// Theory:
// - A Fenwick Tree helps maintain cumulative frequency tables.
// - It supports O(log N) updates and queries using bitwise operations.

class FenwickTree {
    constructor(size) {
        this.size = size;
        this.tree = new Array(size + 1).fill(0); // Tree initialized with 0s
    }

    // Update function to add `delta` to index `i`
    update(index, delta) {
        while (index <= this.size) {
            this.tree[index] += delta;
            index += index & -index; // Move to next index
        }
    }

    // Function to get prefix sum from index 1 to `i`
    prefixSum(index) {
        let sum = 0;
        while (index > 0) {
            sum += this.tree[index];
            index -= index & -index; // Move to parent index
        }
        return sum;
    }

    // Function to get sum in range [left, right]
    rangeSum(left, right) {
        return this.prefixSum(right) - this.prefixSum(left - 1);
    }
}

// Example usage:
const ft = new FenwickTree(10); // Initialize Fenwick Tree with size 10

// Perform updates
ft.update(3, 5);   // Add 5 to index 3
ft.update(5, 2);   // Add 2 to index 5
ft.update(7, 7);   // Add 7 to index 7

// Queries
console.log(ft.prefixSum(5));   // Output: 7
console.log(ft.rangeSum(3, 7)); // Output: 14

// -----------------------------------------------------------
// Expected Output:
// 7
// 14
// -----------------------------------------------------------
// Explanation:
// - Indices 3, 5, and 7 are updated with values.
// - prefixSum(5) returns sum from index 1 to 5.
// - rangeSum(3, 7) computes sum between index 3 and 7.
