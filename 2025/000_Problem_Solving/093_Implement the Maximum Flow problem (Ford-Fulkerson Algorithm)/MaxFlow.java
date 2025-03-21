// Problem: Implement Maximum Flow problem using Ford-Fulkerson Algorithm in Java
// Theory:
// - This algorithm finds the maximum possible flow in a network using Depth-First Search (DFS).
// - It updates residual capacities and back edges until no augmenting path exists.

import java.util.LinkedList;
import java.util.Queue;

class MaxFlow {
    private int V; // Number of vertices
    private int[][] graph; // Adjacency matrix representation

    public MaxFlow(int vertices) {
        this.V = vertices;
        this.graph = new int[vertices][vertices];
    }

    public void addEdge(int u, int v, int capacity) {
        graph[u][v] = capacity; // Assign capacity
    }

    private boolean bfs(int source, int sink, int[] parent) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        parent[source] = -1;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v = 0; v < V; v++) {
                if (!visited[v] && graph[u][v] > 0) {
                    queue.add(v);
                    parent[v] = u;
                    visited[v] = true;
                    if (v == sink) return true; // Path found
                }
            }
        }
        return false; // No augmenting path
    }

    public int fordFulkerson(int source, int sink) {
        int[] parent = new int[V];
        int maxFlow = 0;

        while (bfs(source, sink, parent)) {
            int pathFlow = Integer.MAX_VALUE;
            int v = sink;

            while (v != source) {
                int u = parent[v];
                pathFlow = Math.min(pathFlow, graph[u][v]);
                v = u;
            }

            v = sink;
            while (v != source) {
                int u = parent[v];
                graph[u][v] -= pathFlow;
                graph[v][u] += pathFlow; // Reverse edge
                v = u;
            }

            maxFlow += pathFlow;
        }

        return maxFlow;
    }

    public static void main(String[] args) {
        MaxFlow g = new MaxFlow(6);
        g.addEdge(0, 1, 16);
        g.addEdge(0, 2, 13);
        g.addEdge(1, 2, 10);
        g.addEdge(1, 3, 12);
        g.addEdge(2, 1, 4);
        g.addEdge(2, 4, 14);
        g.addEdge(3, 2, 9);
        g.addEdge(3, 5, 20);
        g.addEdge(4, 3, 7);
        g.addEdge(4, 5, 4);

        System.out.println("The maximum possible flow is: " + g.fordFulkerson(0, 5));

        // Expected Output:
        // The maximum possible flow is: 23
    }
}
