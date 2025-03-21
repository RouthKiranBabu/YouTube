"""
Problem: Check if a given graph is bipartite.

Theory:
A graph is bipartite if we can color its vertices using two colors such that no two adjacent vertices have the same color.
We can check this using BFS or DFS. If we find a cycle of odd length, the graph is not bipartite.
Here, we use BFS.
"""

from collections import deque

def is_bipartite(graph):
    n = len(graph)
    color = [-1] * n  # -1 means uncolored, 0 and 1 are the two colors

    for start in range(n):  # Check for all components
        if color[start] == -1:  # If uncolored, start BFS
            queue = deque([start])
            color[start] = 0  # Start with color 0

            while queue:
                node = queue.popleft()
                for neighbor in graph[node]:
                    if color[neighbor] == -1:  # If not colored, color it oppositely
                        color[neighbor] = 1 - color[node]
                        queue.append(neighbor)
                    elif color[neighbor] == color[node]:  # If same color, not bipartite
                        return False

    return True

# Example usage
graph = [
    [1, 3],  # Node 0 is connected to 1 and 3
    [0, 2],  # Node 1 is connected to 0 and 2
    [1, 3],  # Node 2 is connected to 1 and 3
    [0, 2]   # Node 3 is connected to 0 and 2
]

print(is_bipartite(graph))  # Output: True

"""
Explanation:
- The given graph is a cycle of even length (4 nodes), which is bipartite.
- The BFS ensures nodes are colored with 2 colors such that no two adjacent nodes have the same color.
"""
