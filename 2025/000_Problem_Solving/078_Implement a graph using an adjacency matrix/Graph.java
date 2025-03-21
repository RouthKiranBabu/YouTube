// Problem: Implement a graph using an adjacency matrix in Java.

// Theory:
// - We use a 2D array `adjMatrix` where `adjMatrix[i][j] = 1` represents an edge between i and j.
// - The constructor initializes an empty matrix of size numVertices x numVertices.
// - The addEdge() method sets edges in the matrix.
// - The display() method prints the adjacency matrix.

class Graph {
    private int[][] adjMatrix;
    private int numVertices;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices]; // Initialize with 0s
    }

    public void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1; // For an undirected graph
    }

    public void display() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);  // Create a graph with 4 vertices
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);

        System.out.println("Adjacency Matrix:");
        graph.display();
    }
}

/*
Output:
Adjacency Matrix:
0 1 0 1
1 0 1 0
0 1 0 1
1 0 1 0
*/

// Explanation:
// - Vertex 0 is connected to 1 and 3.
// - Vertex 1 is connected to 0 and 2.
// - Vertex 2 is connected to 1 and 3.
// - Vertex 3 is connected to 0 and 2.
