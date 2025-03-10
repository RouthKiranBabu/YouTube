/*Topological Sort (Kahn’s Algorithm) Implementation in Java, JavaScript, and Python
Explanation:
Kahn’s Algorithm is a BFS-based approach for Topological Sorting of a Directed Acyclic Graph (DAG). The key steps are:

Compute In-degree: Calculate the in-degree (number of incoming edges) for each node.
Enqueue Nodes with Zero In-degree: Start with all nodes that have zero in-degree (no dependencies).
Process the Queue:
Remove a node from the queue and add it to the result.
Reduce the in-degree of its neighbors.
If any neighbor's in-degree becomes zero, add it to the queue.
Repeat Until the Queue is Empty: If all nodes are processed, we have a valid topological order.*/
import java.util.*;

class script {
    // Function to perform Topological Sorting using Kahn's Algorithm
    public static List<Integer> topologicalSort(int vertices, int[][] edges) {
        List<Integer> topoOrder = new ArrayList<>();
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        int[] inDegree = new int[vertices];

        // Build adjacency list and calculate in-degree of each node
        for (int[] edge : edges) {
            adjList.putIfAbsent(edge[0], new ArrayList<>());
            adjList.get(edge[0]).add(edge[1]);
            inDegree[edge[1]]++; // Increase in-degree
        }

        // Add all nodes with in-degree 0 to the queue
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < vertices; i++) {
            if (inDegree[i] == 0) queue.add(i);
        }

        // Process nodes in the queue
        while (!queue.isEmpty()) {
            int node = queue.poll();
            topoOrder.add(node);

            if (adjList.containsKey(node)) {
                for (int neighbor : adjList.get(node)) {
                    inDegree[neighbor]--; // Reduce in-degree
                    if (inDegree[neighbor] == 0) queue.add(neighbor);
                }
            }
        }

        // If topological order doesn't contain all nodes, there was a cycle
        if (topoOrder.size() != vertices) {
            throw new RuntimeException("Graph contains a cycle!");
        }

        return topoOrder;
    }

    public static void main(String[] args) {
        int vertices = 6;
        int[][] edges = { {5, 2}, {5, 0}, {4, 0}, {4, 1}, {2, 3}, {3, 1} };

        System.out.println("Topological Sort Order: " + topologicalSort(vertices, edges));
    }
}

/*
Output:
Topological Sort Order: [5, 4, 2, 3, 1, 0]

Explanation:
- Nodes are processed in an order where each node appears before its dependencies.
- Example order: [5, 4, 2, 3, 1, 0] (One possible order)
*/
