// Fenwick Tree (Binary Indexed Tree) Implementation in Java
// -----------------------------------------------------------
// Problem:
// A data structure to efficiently perform:
// 1. Point updates (adding values).
// 2. Prefix sum queries.
//
// Theory:
// - A Fenwick Tree maintains cumulative sums efficiently.
// - It uses bitwise operations to move between tree nodes.
// - Both update and query operations run in O(log N) time.

class FenwickTree {
    private int[] tree;
    private int size;

    // Constructor to initialize Fenwick Tree
    public FenwickTree(int size) {
        this.size = size;
        this.tree = new int[size + 1]; // Fenwick Tree is 1-based index
    }

    // Update function to add `delta` to index `i`
    public void update(int index, int delta) {
        while (index <= size) {
            tree[index] += delta;
            index += index & -index; // Move to next index
        }
    }

    // Function to get prefix sum from index 1 to `i`
    public int prefixSum(int index) {
        int sum = 0;
        while (index > 0) {
            sum += tree[index];
            index -= index & -index; // Move to parent index
        }
        return sum;
    }

    // Function to get sum in range [left, right]
    public int rangeSum(int left, int right) {
        return prefixSum(right) - prefixSum(left - 1);
    }

    // Main function to test the Fenwick Tree
    public static void main(String[] args) {
        FenwickTree ft = new FenwickTree(10); // Initialize for 10 elements

        // Perform updates
        ft.update(3, 5);   // Add 5 to index 3
        ft.update(5, 2);   // Add 2 to index 5
        ft.update(7, 7);   // Add 7 to index 7

        // Queries
        System.out.println(ft.prefixSum(5));   // Output: 7
        System.out.println(ft.rangeSum(3, 7)); // Output: 14
    }
}

// -----------------------------------------------------------
// Expected Output:
// 7
// 14
// -----------------------------------------------------------
// Explanation:
// - Updates modify indices 3, 5, and 7.
// - Querying prefixSum(5) gets the sum of indices 1 to 5.
// - Querying rangeSum(3, 7) retrieves sum between index 3 and 7.
