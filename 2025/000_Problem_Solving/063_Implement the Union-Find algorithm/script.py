"""
Union-Find Algorithm (Disjoint Set Union - DSU)

- `find(x)`: Finds the root representative of `x` (with path compression).
- `union(x, y)`: Unites two sets containing `x` and `y` (by rank).
"""

class script:
    def __init__(self, n):
        self.parent = list(range(n))
        self.rank = [1] * n

    # Find function with path compression
    def find(self, x):
        if self.parent[x] != x:
            self.parent[x] = self.find(self.parent[x])  # Path compression
        return self.parent[x]

    # Union function by rank
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

# Example Usage
uf = script(5)
uf.union(0, 1)
uf.union(1, 2)
uf.union(3, 4)

print("Find(0):", uf.find(0))  # Should return the same root as find(1) and find(2)
print("Find(1):", uf.find(1))
print("Find(2):", uf.find(2))
print("Find(3):", uf.find(3))  # Should return the same root as find(4)
print("Find(4):", uf.find(4))

"""
Output:
Find(0): 0
Find(1): 0
Find(2): 0
Find(3): 3
Find(4): 3

Explanation:
- Elements {0,1,2} are connected in one set with root 0.
- Elements {3,4} are connected in another set with root 3.
- The `find` function confirms the root of each element.
"""
