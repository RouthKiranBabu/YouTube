// Problem: Detect cycles in a directed graph
// Theory: A cycle in a directed graph occurs if a back edge is found during DFS traversal.
// Approach:
// - We use DFS with recursion.
// - Two boolean arrays track visited nodes and recursion stack.
// - If a node is found in recursion stack during traversal, a cycle is detected.

import java.util.*;

class Graph {
    private final int V;  // Number of vertices
    private final List<List<Integer>> adj;  // Adjacency list

    public Graph(int vertices) {
        V = vertices;
        adj = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
    }

    private boolean isCyclicUtil(int v, boolean[] visited, boolean[] recStack) {
        if (recStack[v]) return true;  // Cycle detected
        if (visited[v]) return false;  // Already processed

        visited[v] = true;
        recStack[v] = true;

        for (int neighbor : adj.get(v)) {
            if (isCyclicUtil(neighbor, visited, recStack)) {
                return true;
            }
        }

        recStack[v] = false;  // Remove from recursion stack
        return false;
    }

    public boolean isCyclic() {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i] && isCyclicUtil(i, visited, recStack)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0); // Creates a cycle
        g.addEdge(2, 3);

        System.out.println(g.isCyclic() ? "Cycle detected!" : "No cycle detected.");
    }
}

// Output:
// Cycle detected!
