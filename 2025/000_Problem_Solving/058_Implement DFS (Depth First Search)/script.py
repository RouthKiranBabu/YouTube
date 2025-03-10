"""
Depth First Search (DFS) Implementation in Python
DFS explores nodes as deep as possible before backtracking.
The graph is represented using an adjacency list.
"""

class script:
    def __init__(self, vertices):
        self.vertices = vertices
        self.adjacency_list = {i: [] for i in range(vertices)}

    # Method to add an edge to the graph
    def add_edge(self, v, w):
        self.adjacency_list[v].append(w)

    # DFS utility function
    def dfs_util(self, v, visited):
        visited[v] = True
        print(v, end=" ")  # Print the visited node

        for neighbor in self.adjacency_list[v]:
            if not visited[neighbor]:
                self.dfs_util(neighbor, visited)

    # Function to perform DFS traversal
    def dfs(self, start_vertex):
        visited = [False] * self.vertices  # Track visited nodes
        self.dfs_util(start_vertex, visited)

# Example usage
graph = script(6)
graph.add_edge(0, 1)
graph.add_edge(0, 2)
graph.add_edge(1, 3)
graph.add_edge(1, 4)
graph.add_edge(2, 5)

print("Depth First Search (DFS) starting from vertex 0:")
graph.dfs(0)

"""
Output:
Depth First Search (DFS) starting from vertex 0:
0 1 3 4 2 5 

Explanation:
- The traversal starts at vertex 0.
- It explores node 1 first, moving deeper into 3 and 4 before backtracking.
- Then, it moves to node 2 and explores 5.
- The traversal follows: 0 → 1 → 3 → 4 → backtrack → 2 → 5.
"""
