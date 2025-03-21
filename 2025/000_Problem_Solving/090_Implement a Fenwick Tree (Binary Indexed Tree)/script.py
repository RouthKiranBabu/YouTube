# Fenwick Tree (Binary Indexed Tree) Implementation in Python
# -----------------------------------------------------------
# Problem:
# We need a data structure that efficiently supports:
# 1. Point Updates: Add a value to an index.
# 2. Prefix Sum Queries: Get the sum of elements from index 1 to i.

# Theory:
# A Fenwick Tree (or BIT) is an efficient structure for handling 
# cumulative frequency tables with O(log N) time complexity for updates 
# and queries. It stores cumulative frequency in a tree-like structure.

class FenwickTree:
    def __init__(self, size):
        """Initialize a Fenwick Tree with given size."""
        self.size = size
        self.tree = [0] * (size + 1)  # Tree starts from index 1

    def update(self, index, delta):
        """Increase value at index by delta."""
        while index <= self.size:
            self.tree[index] += delta
            index += index & -index  # Move to next index

    def prefix_sum(self, index):
        """Get the sum from index 1 to index."""
        result = 0
        while index > 0:
            result += self.tree[index]
            index -= index & -index  # Move to parent index
        return result

    def range_sum(self, left, right):
        """Get sum in range [left, right]."""
        return self.prefix_sum(right) - self.prefix_sum(left - 1)

# Example usage:
ft = FenwickTree(10)  # Initialize Fenwick Tree for 10 elements

# Perform updates
ft.update(3, 5)   # Add 5 to index 3
ft.update(5, 2)   # Add 2 to index 5
ft.update(7, 7)   # Add 7 to index 7

# Queries
print(ft.prefix_sum(5))   # Output: 7  (sum from 1 to 5)
print(ft.range_sum(3, 7)) # Output: 14 (sum from index 3 to 7)

# -----------------------------------------------------------
# Expected Output:
# 7
# 14
# -----------------------------------------------------------
# Explanation:
# - We update indices 3, 5, and 7 with values.
# - Querying prefix_sum(5) gives sum of indices 1 to 5.
# - Querying range_sum(3, 7) gets the sum between index 3 and 7.
