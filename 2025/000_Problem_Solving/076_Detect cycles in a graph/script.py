# Problem: Detect cycles in a directed graph
# Theory: A cycle in a directed graph occurs if there is a back edge during DFS traversal.
# Approach: 
# - We use Depth First Search (DFS) with recursion.
# - We maintain a "visited" set and a "recStack" (recursion stack) set.
# - If a node is found in the recStack during traversal, a cycle is detected.

class Graph:
    def __init__(self, vertices):
        self.graph = {i: [] for i in range(vertices)}  # Adjacency list representation
        self.V = vertices  # Number of vertices

    def add_edge(self, u, v):
        self.graph[u].append(v)  # Add edge from u to v

    def is_cyclic_util(self, v, visited, recStack):
        visited[v] = True
        recStack[v] = True  # Mark node in recursion stack

        for neighbor in self.graph[v]:
            if not visited[neighbor]:  # If not visited, DFS on neighbor
                if self.is_cyclic_util(neighbor, visited, recStack):
                    return True
            elif recStack[neighbor]:  # If found in recStack, cycle detected
                return True

        recStack[v] = False  # Remove node from recursion stack before returning
        return False

    def is_cyclic(self):
        visited = [False] * self.V
        recStack = [False] * self.V

        for node in range(self.V):
            if not visited[node]:  # Perform DFS for unvisited nodes
                if self.is_cyclic_util(node, visited, recStack):
                    return True
        return False


# Example Usage
g = Graph(4)
g.add_edge(0, 1)
g.add_edge(1, 2)
g.add_edge(2, 0)  # This creates a cycle
g.add_edge(2, 3)

print("Cycle detected!" if g.is_cyclic() else "No cycle detected.")

# Output:
# Cycle detected!
