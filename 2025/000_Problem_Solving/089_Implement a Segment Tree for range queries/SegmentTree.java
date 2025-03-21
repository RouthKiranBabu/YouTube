// Problem Statement:
// Implement a Segment Tree for efficient range sum queries and updates.

class SegmentTree {
    private int[] tree;
    private int n;

    public SegmentTree(int[] arr) {
        n = arr.length;
        tree = new int[4 * n];  // Allocating space for segment tree
        build(arr, 0, 0, n - 1);
    }

    private void build(int[] arr, int node, int start, int end) {
        if (start == end) {
            tree[node] = arr[start];
        } else {
            int mid = (start + end) / 2;
            int leftChild = 2 * node + 1;
            int rightChild = 2 * node + 2;
            build(arr, leftChild, start, mid);
            build(arr, rightChild, mid + 1, end);
            tree[node] = tree[leftChild] + tree[rightChild];
        }
    }

    public int query(int node, int start, int end, int L, int R) {
        if (R < start || L > end) return 0; // No overlap
        if (L <= start && end <= R) return tree[node]; // Complete overlap
        int mid = (start + end) / 2;
        int leftSum = query(2 * node + 1, start, mid, L, R);
        int rightSum = query(2 * node + 2, mid + 1, end, L, R);
        return leftSum + rightSum;
    }

    public void update(int node, int start, int end, int index, int value) {
        if (start == end) {
            tree[node] = value;
        } else {
            int mid = (start + end) / 2;
            if (index <= mid) {
                update(2 * node + 1, start, mid, index, value);
            } else {
                update(2 * node + 2, mid + 1, end, index, value);
            }
            tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        SegmentTree segTree = new SegmentTree(arr);

        System.out.println(segTree.query(0, 0, arr.length - 1, 1, 3)); // Output: 15

        segTree.update(0, 0, arr.length - 1, 1, 10);
        
        System.out.println(segTree.query(0, 0, arr.length - 1, 1, 3)); // Output: 22
    }
}
