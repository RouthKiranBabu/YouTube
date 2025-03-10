/*
 * Depth First Search (DFS) Implementation in Java
 * DFS is used to traverse or search tree/graph data structures. It explores as deep as possible before backtracking.
 * Here, we implement DFS using adjacency list representation of a graph.
 */

 import java.util.*;

 class script {
     private int vertices; // Number of vertices in the graph
     private LinkedList<Integer>[] adjacencyList; // Adjacency list representation
 
     // Constructor
     public script(int v) {
         vertices = v;
         adjacencyList = new LinkedList[v];
         for (int i = 0; i < v; i++) {
             adjacencyList[i] = new LinkedList<>();
         }
     }
 
     // Method to add an edge to the graph
     public void addEdge(int v, int w) {
         adjacencyList[v].add(w);
     }
 
     // DFS utility function
     private void DFSUtil(int v, boolean[] visited) {
         visited[v] = true; // Mark the current node as visited
         System.out.print(v + " "); // Print the visited vertex
 
         for (int neighbor : adjacencyList[v]) {
             if (!visited[neighbor]) {
                 DFSUtil(neighbor, visited);
             }
         }
     }
 
     // Function to perform DFS traversal
     public void DFS(int startVertex) {
         boolean[] visited = new boolean[vertices]; // Track visited nodes
         DFSUtil(startVertex, visited);
     }
 
     public static void main(String[] args) {
         script graph = new script(6);
         graph.addEdge(0, 1);
         graph.addEdge(0, 2);
         graph.addEdge(1, 3);
         graph.addEdge(1, 4);
         graph.addEdge(2, 5);
 
         System.out.println("Depth First Search (DFS) starting from vertex 0:");
         graph.DFS(0);
     }
 }
 
 /*
  * Output:
  * Depth First Search (DFS) starting from vertex 0:
  * 0 1 3 4 2 5 
  * 
  * Explanation:
  * The traversal starts at vertex 0, explores its neighbors (1 and 2) deeply before backtracking.
  * The traversal follows: 0 → 1 → 3 → 4 → backtrack → 2 → 5.
  */
 