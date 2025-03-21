// Problem: Implement Minimum Spanning Tree (MST) using Prim's Algorithm
// Theory:
// - Prim's algorithm finds the MST by starting with any vertex and growing the tree one edge at a time.
// - It always selects the smallest edge that connects a vertex inside the MST to a vertex outside the MST.
// - It uses a priority queue (min-heap) to efficiently fetch the minimum-weight edge.

import java.util.*;

class PrimMST {
    private static final int INF = Integer.MAX_VALUE;

    int V; // Number of vertices
    int[][] graph; // Adjacency matrix

    PrimMST(int vertices) {
        this.V = vertices;
        this.graph = new int[V][V];
    }

    void addEdge(int u, int v, int w) {
        graph[u][v] = w;
        graph[v][u] = w; // Because the graph is undirected
    }

    void primMST() {
        int[] key = new int[V]; // Stores minimum weights
        boolean[] mstSet = new boolean[V]; // MST inclusion flag
        int[] parent = new int[V]; // Stores MST structure

        Arrays.fill(key, INF);
        key[0] = 0; // Start from vertex 0
        parent[0] = -1; // Root of MST

        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        printMST(parent);
    }

    int minKey(int[] key, boolean[] mstSet) {
        int min = INF, minIndex = -1;
        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    void printMST(int[] parent) {
        System.out.println("Edges in MST:");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " -- " + i + " == " + graph[i][parent[i]]);
        }
    }

    public static void main(String[] args) {
        PrimMST g = new PrimMST(5);
        g.addEdge(0, 1, 2);
        g.addEdge(0, 3, 6);
        g.addEdge(1, 2, 3);
        g.addEdge(1, 3, 8);
        g.addEdge(1, 4, 5);
        g.addEdge(2, 4, 7);
        g.addEdge(3, 4, 9);

        g.primMST();
    }
}

// Output:
// Edges in MST:
// 0 -- 1 == 2
// 1 -- 2 == 3
// 1 -- 4 == 5
// 0 -- 3 == 6
