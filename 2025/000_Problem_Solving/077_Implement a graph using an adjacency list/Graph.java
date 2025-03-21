// Problem: Implement a graph using an adjacency list.
// Theory: An adjacency list is implemented using a HashMap, where each key represents a node 
// and the value is a list of adjacent nodes.

import java.util.*;

class Graph {
    private Map<String, List<String>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(String vertex) {
        // Adds a vertex if it does not already exist
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(String vertex1, String vertex2) {
        // Adds an edge between two vertices (undirected graph)
        if (adjacencyList.containsKey(vertex1) && adjacencyList.containsKey(vertex2)) {
            adjacencyList.get(vertex1).add(vertex2);
            adjacencyList.get(vertex2).add(vertex1); // Since it's undirected
        }
    }

    public void printGraph() {
        // Prints the adjacency list
        for (var entry : adjacencyList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");

        graph.printGraph();
    }
}

/* Output:
A -> [B, C]
B -> [A, C]
C -> [A, B]

Explanation:
1. The graph is stored using a HashMap.
2. `addVertex` ensures only unique nodes are added.
3. `addEdge` adds bidirectional edges.
4. `printGraph` displays the adjacency list representation.
*/
