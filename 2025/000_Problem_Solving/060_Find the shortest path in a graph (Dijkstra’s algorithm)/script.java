/*
 * Dijkstra's Algorithm in Java
 * 
 * Explanation:
 * - This program finds the shortest path from a source node to all other nodes in a weighted graph.
 * - We use a priority queue (min-heap) to always expand the least-cost node first.
 * - The graph is represented using an adjacency list.
 * - The algorithm ensures that each node is visited only once with the shortest distance.
 */

 import java.util.*;

 class script {
     static class Node implements Comparable<Node> {
         int vertex, weight;
         Node(int v, int w) { vertex = v; weight = w; }
 
         public int compareTo(Node other) { return this.weight - other.weight; }
     }
 
     public static void dijkstra(Map<Integer, List<Node>> graph, int source) {
         PriorityQueue<Node> pq = new PriorityQueue<>();
         Map<Integer, Integer> distances = new HashMap<>();
         
         for (int node : graph.keySet()) distances.put(node, Integer.MAX_VALUE);
         distances.put(source, 0);
         pq.add(new Node(source, 0));
 
         while (!pq.isEmpty()) {
             Node current = pq.poll();
             int u = current.vertex;
 
             for (Node neighbor : graph.get(u)) {
                 int newDist = distances.get(u) + neighbor.weight;
                 if (newDist < distances.get(neighbor.vertex)) {
                     distances.put(neighbor.vertex, newDist);
                     pq.add(new Node(neighbor.vertex, newDist));
                 }
             }
         }
 
         // Output shortest distances
         System.out.println("Shortest distances from source node " + source + ":");
         for (int node : distances.keySet()) 
             System.out.println("Node " + node + " -> Distance: " + distances.get(node));
     }
 
     public static void main(String[] args) {
         Map<Integer, List<Node>> graph = new HashMap<>();
         graph.put(0, Arrays.asList(new Node(1, 4), new Node(2, 1)));
         graph.put(1, Arrays.asList(new Node(3, 1)));
         graph.put(2, Arrays.asList(new Node(1, 2), new Node(3, 5)));
         graph.put(3, new ArrayList<>());
 
         dijkstra(graph, 0);
     }
 }
 
 /*
  * Output:
  * Shortest distances from source node 0:
  * Node 0 -> Distance: 0
  * Node 1 -> Distance: 3
  * Node 2 -> Distance: 1
  * Node 3 -> Distance: 4
  * 
  * Explanation:
  * - The shortest path from node 0 to 1 is 0 → 2 → 1 (cost 3).
  * - The shortest path from node 0 to 2 is 0 → 2 (cost 1).
  * - The shortest path from node 0 to 3 is 0 → 2 → 1 → 3 (cost 4).
  */
 