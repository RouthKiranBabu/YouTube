"""
Breadth-First Search (BFS) Implementation in Python
BFS is an algorithm used for searching or traversing graph/tree data structures.
It explores nodes level by level using a queue.
"""

from collections import deque

class script:
    def __init__(self):
        self.adj_list = {}

    # Method to add an edge to the graph
    def add_edge(self, src, dest):
        if src not in self.adj_list:
            self.adj_list[src] = []
        if dest not in self.adj_list:
            self.adj_list[dest] = []
        self.adj_list[src].append(dest)

    # BFS Implementation
    def bfs(self, start_node):
        queue = deque([start_node])
        visited = set([start_node])

        print("BFS Traversal:", end=" ")

        while queue:
            current = queue.popleft()
            print(current, end=" ")

            for neighbor in self.adj_list.get(current, []):
                if neighbor not in visited:
                    queue.append(neighbor)
                    visited.add(neighbor)

        print()

# Creating and testing the graph
graph = script()
graph.add_edge(0, 1)
graph.add_edge(0, 2)
graph.add_edge(1, 3)
graph.add_edge(1, 4)
graph.add_edge(2, 5)
graph.add_edge(2, 6)

# Perform BFS starting from node 0
graph.bfs(0)

"""
Output:
BFS Traversal: 0 1 2 3 4 5 6 

Explanation:
The BFS starts at node 0, then explores its neighbors (1,2), then their neighbors (3,4,5,6).
"""
