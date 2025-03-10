"""
Disjoint Set Union (DSU) or Union-Find in Python

This data structure supports:
1. find(x) - Finds the representative of the set containing 'x' (with path compression).
2. union(x, y) - Merges the sets containing 'x' and 'y' (using union by rank).
"""

class script:
    def __init__(self, n):
        self.parent = list(range(n))
        self.rank = [1] * n

    # Find with path compression
    def find(self, x):
        if self.parent[x] != x:
            self.parent[x] = self.find(self.parent[x])  # Path compression
        return self.parent[x]

    # Union by rank
    def union(self, x, y):
        rootX = self.find(x)
        rootY = self.find(y)

        if rootX != rootY:
            if self.rank[rootX] > self.rank[rootY]:
                self.parent[rootY] = rootX
            elif self.rank[rootX] < self.rank[rootY]:
                self.parent[rootX] = rootY
            else:
                self.parent[rootY] = rootX
                self.rank[rootX] += 1

    # Print the representative of each element
    def print_sets(self):
        print([self.find(i) for i in range(len(self.parent))])


# Testing DSU
dsu = script(7)

dsu.union(1, 2)
dsu.union(2, 3)
dsu.union(4, 5)
dsu.union(5, 6)

print(dsu.find(2))  # Output: Root of set containing 2
print(dsu.find(5))  # Output: Root of set containing 5

dsu.print_sets()  # Prints representatives for each element

"""
Output:
1
4
[0, 1, 1, 1, 4, 4, 4]

Explanation:
- Elements 1, 2, and 3 belong to the same set with representative 1.
- Elements 4, 5, and 6 belong to the same set with representative 4.
"""
