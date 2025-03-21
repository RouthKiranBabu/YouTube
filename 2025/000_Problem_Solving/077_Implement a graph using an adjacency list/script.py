# Problem: Implement a graph using an adjacency list.
# Theory: An adjacency list represents a graph using a dictionary (or list of lists), 
# where each key (or index) corresponds to a node, and its value is a list of connected nodes.

class Graph:
    def __init__(self):
        # Dictionary to store adjacency list
        self.adjacency_list = {}

    def add_vertex(self, vertex):
        # Adds a vertex to the graph if it does not exist
        if vertex not in self.adjacency_list:
            self.adjacency_list[vertex] = []

    def add_edge(self, vertex1, vertex2):
        # Adds an edge between two vertices (undirected graph)
        if vertex1 in self.adjacency_list and vertex2 in self.adjacency_list:
            self.adjacency_list[vertex1].append(vertex2)
            self.adjacency_list[vertex2].append(vertex1)  # Since it's undirected

    def print_graph(self):
        # Prints the adjacency list
        for vertex, edges in self.adjacency_list.items():
            print(f"{vertex} -> {edges}")

# Example usage
graph = Graph()
graph.add_vertex("A")
graph.add_vertex("B")
graph.add_vertex("C")
graph.add_edge("A", "B")
graph.add_edge("A", "C")
graph.add_edge("B", "C")

graph.print_graph()

# Output:
# A -> ['B', 'C']
# B -> ['A', 'C']
# C -> ['A', 'B']

# Explanation:
# 1. The graph is represented using a dictionary.
# 2. `add_vertex` ensures unique vertices are stored.
# 3. `add_edge` adds a connection between two nodes.
# 4. The `print_graph` method displays the adjacency list.
