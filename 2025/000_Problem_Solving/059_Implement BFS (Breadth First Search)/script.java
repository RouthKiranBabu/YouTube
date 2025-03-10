/*
 * Breadth-First Search (BFS) Implementation in Java
 * BFS is an algorithm used to traverse or search tree/graph data structures.
 * It explores all the vertices of a graph layer by layer using a queue.
 * 
 * The graph is represented using an adjacency list.
 */

 import java.util.*;

 class script {
     private Map<Integer, List<Integer>> adjList;
 
     // Constructor
     public script() {
         adjList = new HashMap<>();
     }
 
     // Method to add an edge to the graph
     public void addEdge(int src, int dest) {
         adjList.putIfAbsent(src, new ArrayList<>());
         adjList.putIfAbsent(dest, new ArrayList<>()); // Ensure all nodes are in the list
         adjList.get(src).add(dest);
     }
 
     // BFS Implementation
     public void bfs(int startNode) {
         Queue<Integer> queue = new LinkedList<>();
         Set<Integer> visited = new HashSet<>();
 
         queue.add(startNode);
         visited.add(startNode);
 
         System.out.print("BFS Traversal: ");
         while (!queue.isEmpty()) {
             int current = queue.poll();
             System.out.print(current + " ");
 
             for (int neighbor : adjList.getOrDefault(current, new ArrayList<>())) {
                 if (!visited.contains(neighbor)) {
                     queue.add(neighbor);
                     visited.add(neighbor);
                 }
             }
         }
         System.out.println();
     }
 
     // Main Method
     public static void main(String[] args) {
         script graph = new script();
         graph.addEdge(0, 1);
         graph.addEdge(0, 2);
         graph.addEdge(1, 3);
         graph.addEdge(1, 4);
         graph.addEdge(2, 5);
         graph.addEdge(2, 6);
 
         // Perform BFS starting from node 0
         graph.bfs(0);
     }
 }
 
 /*
  * Output:
  * BFS Traversal: 0 1 2 3 4 5 6 
  * 
  * Explanation:
  * The BFS starts at node 0, then explores its neighbors (1,2), then their neighbors (3,4,5,6).
  */
 