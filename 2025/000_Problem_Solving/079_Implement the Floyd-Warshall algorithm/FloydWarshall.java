// Floyd-Warshall Algorithm in Java
// The Floyd-Warshall algorithm finds shortest paths between all pairs of nodes in a graph.
// It is a dynamic programming algorithm that iteratively updates the shortest distance matrix.

// Time Complexity: O(V^3), where V is the number of vertices.
// Space Complexity: O(V^2) for storing the distance matrix.

class FloydWarshall {
    final static int INF = 99999; // Large value representing infinity

    // Function to implement Floyd-Warshall algorithm
    static void floydWarshall(int graph[][]) {
        int V = graph.length;
        int dist[][] = new int[V][V];

        // Copy input graph into the distance matrix
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                dist[i][j] = graph[i][j];

        // Algorithm implementation
        for (int k = 0; k < V; k++) {  // Intermediate node
            for (int i = 0; i < V; i++) {  // Source node
                for (int j = 0; j < V; j++) {  // Destination node
                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // Print the shortest distance matrix
        printSolution(dist);
    }

    // Function to print the distance matrix
    static void printSolution(int dist[][]) {
        System.out.println("Shortest Distance Matrix:");
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist.length; j++) {
                if (dist[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        int graph[][] = {
            {0, 3, INF, 5},
            {2, 0, INF, 4},
            {INF, 1, 0, INF},
            {INF, INF, 2, 0}
        };

        // Run Floyd-Warshall algorithm
        floydWarshall(graph);
    }
}

// Expected Output:
// Shortest Distance Matrix:
// 0 3 7 5
// 2 0 6 4
// 3 1 0 5
// 5 3 2 0
