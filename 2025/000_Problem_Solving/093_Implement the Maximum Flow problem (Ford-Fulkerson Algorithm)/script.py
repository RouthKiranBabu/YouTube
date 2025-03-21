# Problem: Implement Maximum Flow problem using Ford-Fulkerson Algorithm.
# Theory:
# The Ford-Fulkerson method is used to compute the maximum flow in a flow network.
# It uses Depth-First Search (DFS) to find augmenting paths and updates the residual capacities.
# The flow increases until no more augmenting paths exist.

from collections import deque

class Graph:
    def __init__(self, vertices):
        self.V = vertices  # Number of vertices
        self.graph = [[0] * vertices for _ in range(vertices)]  # Adjacency matrix representation

    def add_edge(self, u, v, capacity):
        self.graph[u][v] = capacity  # Set capacity from u to v

    def bfs(self, source, sink, parent):
        """Perform BFS to find an augmenting path. Returns True if there is a path."""
        visited = [False] * self.V
        queue = deque([source])
        visited[source] = True

        while queue:
            u = queue.popleft()
            for v, capacity in enumerate(self.graph[u]):
                if not visited[v] and capacity > 0:  # If vertex is not visited and has available capacity
                    queue.append(v)
                    visited[v] = True
                    parent[v] = u
                    if v == sink:
                        return True  # Path found
        return False  # No augmenting path exists

    def ford_fulkerson(self, source, sink):
        """Returns the maximum flow from source to sink."""
        parent = [-1] * self.V
        max_flow = 0  # Initially, no flow

        while self.bfs(source, sink, parent):
            path_flow = float('Inf')
            v = sink

            # Find the minimum residual capacity in the path
            while v != source:
                u = parent[v]
                path_flow = min(path_flow, self.graph[u][v])
                v = u

            # Update residual capacities
            v = sink
            while v != source:
                u = parent[v]
                self.graph[u][v] -= path_flow
                self.graph[v][u] += path_flow  # Reverse edge for residual graph
                v = u

            max_flow += path_flow  # Add path flow to overall flow

        return max_flow


# Example Usage
g = Graph(6)
g.add_edge(0, 1, 16)
g.add_edge(0, 2, 13)
g.add_edge(1, 2, 10)
g.add_edge(1, 3, 12)
g.add_edge(2, 1, 4)
g.add_edge(2, 4, 14)
g.add_edge(3, 2, 9)
g.add_edge(3, 5, 20)
g.add_edge(4, 3, 7)
g.add_edge(4, 5, 4)

source, sink = 0, 5
print("The maximum possible flow is:", g.ford_fulkerson(source, sink))

# Expected Output:
# The maximum possible flow is: 23
