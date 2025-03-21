"""
Tarjan's Algorithm for finding Strongly Connected Components (SCC) in a directed graph.
The algorithm uses Depth-First Search (DFS) and maintains discovery and low-link values.
A stack is used to track the current path in DFS.
If a node's discovery time matches its low-link value, it is the root of an SCC.
"""

from collections import defaultdict

class TarjanSCC:
    def __init__(self, vertices):
        self.V = vertices  # Number of vertices
        self.graph = defaultdict(list)  # Adjacency list
        self.time = 0  # Time counter
        self.disc = [-1] * vertices  # Discovery times
        self.low = [-1] * vertices  # Lowest discovery time reachable
        self.stack = []  # Stack to store SCC members
        self.stackMember = [False] * vertices  # To check if a node is in the stack
        self.result = []  # Stores all SCCs

    def add_edge(self, u, v):
        """Add a directed edge from u to v."""
        self.graph[u].append(v)

    def scc_util(self, u):
        """Recursive function for DFS and SCC detection."""
        self.disc[u] = self.low[u] = self.time
        self.time += 1
        self.stack.append(u)
        self.stackMember[u] = True

        # Traverse all adjacent vertices
        for v in self.graph[u]:
            if self.disc[v] == -1:  # If v is not visited
                self.scc_util(v)
                self.low[u] = min(self.low[u], self.low[v])
            elif self.stackMember[v]:  # If v is in stack, update low[u]
                self.low[u] = min(self.low[u], self.disc[v])

        # If u is the root of an SCC, pop all nodes to form an SCC
        if self.low[u] == self.disc[u]:
            scc = []
            while True:
                w = self.stack.pop()
                self.stackMember[w] = False
                scc.append(w)
                if w == u:
                    break
            self.result.append(scc)

    def tarjan_scc(self):
        """Finds all SCCs in the graph."""
        for i in range(self.V):
            if self.disc[i] == -1:
                self.scc_util(i)
        return self.result


# Example usage:
graph = TarjanSCC(5)
graph.add_edge(1, 0)
graph.add_edge(0, 2)
graph.add_edge(2, 1)
graph.add_edge(0, 3)
graph.add_edge(3, 4)

sccs = graph.tarjan_scc()
print("Strongly Connected Components:", sccs)

"""
Expected Output:
Strongly Connected Components: [[1, 2, 0], [3], [4]]
"""
