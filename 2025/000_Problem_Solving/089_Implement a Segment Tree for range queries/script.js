// Problem Statement:
// Implement a Segment Tree to perform efficient range sum queries and updates.

class SegmentTree {
    constructor(arr) {
        this.n = arr.length;
        this.tree = new Array(4 * this.n).fill(0);
        this.build(arr, 0, 0, this.n - 1);
    }

    build(arr, node, start, end) {
        if (start === end) {
            this.tree[node] = arr[start];
        } else {
            let mid = Math.floor((start + end) / 2);
            this.build(arr, 2 * node + 1, start, mid);
            this.build(arr, 2 * node + 2, mid + 1, end);
            this.tree[node] = this.tree[2 * node + 1] + this.tree[2 * node + 2];
        }
    }

    query(node, start, end, L, R) {
        if (R < start || L > end) return 0; // No overlap
        if (L <= start && end <= R) return this.tree[node]; // Complete overlap
        let mid = Math.floor((start + end) / 2);
        let leftSum = this.query(2 * node + 1, start, mid, L, R);
        let rightSum = this.query(2 * node + 2, mid + 1, end, L, R);
        return leftSum + rightSum;
    }

    update(node, start, end, index, value) {
        if (start === end) {
            this.tree[node] = value;
        } else {
            let mid = Math.floor((start + end) / 2);
            if (index <= mid) {
                this.update(2 * node + 1, start, mid, index, value);
            } else {
                this.update(2 * node + 2, mid + 1, end, index, value);
            }
            this.tree[node] = this.tree[2 * node + 1] + this.tree[2 * node + 2];
        }
    }
}

// Example usage:
const arr = [1, 3, 5, 7, 9, 11];
const segTree = new SegmentTree(arr);

console.log(segTree.query(0, 0, arr.length - 1, 1, 3)); // Output: 15
segTree.update(0, 0, arr.length - 1, 1, 10);
console.log(segTree.query(0, 0, arr.length - 1, 1, 3)); // Output: 22
