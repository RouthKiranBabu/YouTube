# Problem: Implement Minimum Spanning Tree (MST) using Kruskal's Algorithm
# Theory:
# - Kruskal's Algorithm is a greedy algorithm that finds the Minimum Spanning Tree (MST) of a graph.
# - It sorts all edges in increasing order of weight.
# - Then, it picks the smallest edge and adds it to the MST if it does not form a cycle.
# - This is achieved using the Disjoint Set (Union-Find) data structure.

class Graph:
    def __init__(self, vertices):
        self.V = vertices
        self.graph = []  # To store graph edges

    def add_edge(self, u, v, w):
        self.graph.append([u, v, w])

    # Utility function to find the set of an element i (uses path compression)
    def find(self, parent, i):
        if parent[i] != i:
            parent[i] = self.find(parent, parent[i])
        return parent[i]

    # Utility function to perform union of two sets
    def union(self, parent, rank, x, y):
        root_x = self.find(parent, x)
        root_y = self.find(parent, y)
        
        if rank[root_x] < rank[root_y]:
            parent[root_x] = root_y
        elif rank[root_x] > rank[root_y]:
            parent[root_y] = root_x
        else:
            parent[root_y] = root_x
            rank[root_x] += 1

    def kruskal_mst(self):
        self.graph.sort(key=lambda item: item[2])  # Sort edges by weight
        parent = []
        rank = []
        mst = []  # Store MST edges

        for node in range(self.V):
            parent.append(node)
            rank.append(0)

        edge_count = 0  # Number of edges in MST
        index = 0  # Index variable for sorted edges

        while edge_count < self.V - 1:
            u, v, w = self.graph[index]
            index += 1
            x = self.find(parent, u)
            y = self.find(parent, v)

            if x != y:  # If cycle is not formed
                mst.append([u, v, w])
                self.union(parent, rank, x, y)
                edge_count += 1

        # Printing the MST
        print("Edges in MST:")
        for u, v, w in mst:
            print(f"{u} -- {v} == {w}")

# Example Usage
g = Graph(4)
g.add_edge(0, 1, 10)
g.add_edge(0, 2, 6)
g.add_edge(0, 3, 5)
g.add_edge(1, 3, 15)
g.add_edge(2, 3, 4)

g.kruskal_mst()

# Output:
# Edges in MST:
# 2 -- 3 == 4
# 0 -- 3 == 5
# 0 -- 1 == 10
