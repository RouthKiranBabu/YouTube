// Problem: Implement a graph using an adjacency list.
// Theory: An adjacency list is implemented using an object, where each key represents a node 
// and its value is an array of adjacent nodes.

class Graph {
    constructor() {
        this.adjacencyList = {};
    }

    addVertex(vertex) {
        // Adds a vertex if it does not exist
        if (!this.adjacencyList[vertex]) {
            this.adjacencyList[vertex] = [];
        }
    }

    addEdge(vertex1, vertex2) {
        // Adds an edge between two vertices (undirected graph)
        if (this.adjacencyList[vertex1] && this.adjacencyList[vertex2]) {
            this.adjacencyList[vertex1].push(vertex2);
            this.adjacencyList[vertex2].push(vertex1); // Since it's undirected
        }
    }

    printGraph() {
        // Prints the adjacency list
        for (let vertex in this.adjacencyList) {
            console.log(`${vertex} -> ${this.adjacencyList[vertex].join(", ")}`);
        }
    }
}

// Example usage
const graph = new Graph();
graph.addVertex("A");
graph.addVertex("B");
graph.addVertex("C");
graph.addEdge("A", "B");
graph.addEdge("A", "C");
graph.addEdge("B", "C");

graph.printGraph();

/* Output:
A -> B, C
B -> A, C
C -> A, B

Explanation:
1. The graph is stored using an object.
2. `addVertex` ensures unique nodes are stored.
3. `addEdge` creates bidirectional connections.
4. `printGraph` prints the adjacency list representation.
*/
