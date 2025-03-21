# Problem: Implement a graph using an adjacency matrix in Python.

# Theory:
# An adjacency matrix is a 2D array where each cell (i, j) represents 
# whether there is an edge between vertex i and vertex j.
# If graph[i][j] == 1, there is an edge, otherwise, it's 0.

class Graph:
    def __init__(self, num_vertices):
        """Initialize the graph with the given number of vertices."""
        self.num_vertices = num_vertices
        self.adj_matrix = [[0] * num_vertices for _ in range(num_vertices)]

    def add_edge(self, u, v):
        """Add an edge between vertex u and vertex v (assuming an undirected graph)."""
        self.adj_matrix[u][v] = 1
        self.adj_matrix[v][u] = 1

    def display(self):
        """Display the adjacency matrix."""
        for row in self.adj_matrix:
            print(row)

# Example usage:
graph = Graph(4)  # Create a graph with 4 vertices
graph.add_edge(0, 1)
graph.add_edge(1, 2)
graph.add_edge(2, 3)
graph.add_edge(3, 0)

print("Adjacency Matrix:")
graph.display()

"""
Output:
Adjacency Matrix:
[0, 1, 0, 1]
[1, 0, 1, 0]
[0, 1, 0, 1]
[1, 0, 1, 0]
"""

# Explanation:
# The matrix represents a graph where:
# - Vertex 0 is connected to 1 and 3.
# - Vertex 1 is connected to 0 and 2.
# - Vertex 2 is connected to 1 and 3.
# - Vertex 3 is connected to 0 and 2.
