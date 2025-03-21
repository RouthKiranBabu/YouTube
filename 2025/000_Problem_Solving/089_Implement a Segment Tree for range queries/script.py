# Problem Statement:
# Implement a Segment Tree to perform range sum queries and point updates efficiently.
# A Segment Tree is a data structure that allows querying and updating a range in O(log n) time.

class SegmentTree:
    def __init__(self, arr):
        """
        Initializes the segment tree with the given array.
        """
        self.n = len(arr)
        self.tree = [0] * (4 * self.n)  # Allocating space for segment tree
        self.build(arr, 0, 0, self.n - 1)

    def build(self, arr, node, start, end):
        """
        Recursively builds the segment tree.
        """
        if start == end:
            self.tree[node] = arr[start]
        else:
            mid = (start + end) // 2
            left_child = 2 * node + 1
            right_child = 2 * node + 2
            self.build(arr, left_child, start, mid)
            self.build(arr, right_child, mid + 1, end)
            self.tree[node] = self.tree[left_child] + self.tree[right_child]

    def query(self, node, start, end, L, R):
        """
        Performs a range sum query from index L to R.
        """
        if R < start or L > end:
            return 0  # No overlap
        if L <= start and end <= R:
            return self.tree[node]  # Complete overlap
        mid = (start + end) // 2
        left_sum = self.query(2 * node + 1, start, mid, L, R)
        right_sum = self.query(2 * node + 2, mid + 1, end, L, R)
        return left_sum + right_sum

    def update(self, node, start, end, index, value):
        """
        Updates the value at a given index and updates the segment tree accordingly.
        """
        if start == end:
            self.tree[node] = value
        else:
            mid = (start + end) // 2
            if index <= mid:
                self.update(2 * node + 1, start, mid, index, value)
            else:
                self.update(2 * node + 2, mid + 1, end, index, value)
            self.tree[node] = self.tree[2 * node + 1] + self.tree[2 * node + 2]

# Example usage:
arr = [1, 3, 5, 7, 9, 11]
seg_tree = SegmentTree(arr)

# Query the sum of range [1, 3]
print(seg_tree.query(0, 0, len(arr) - 1, 1, 3))  # Output: 15

# Update index 1 to value 10
seg_tree.update(0, 0, len(arr) - 1, 1, 10)

# Query again after update
print(seg_tree.query(0, 0, len(arr) - 1, 1, 3))  # Output: 22
