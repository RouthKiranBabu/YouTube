// Problem: Implement a graph using an adjacency matrix in JavaScript

// Theory:
// - A graph is represented using a 2D array (adjacency matrix).
// - The addEdge() method connects two vertices by setting the corresponding matrix values to 1.
// - The display() method prints the adjacency matrix.

class Graph {
    constructor(numVertices) {
        this.numVertices = numVertices;
        this.adjMatrix = Array.from({ length: numVertices }, () => Array(numVertices).fill(0));
    }

    addEdge(u, v) {
        this.adjMatrix[u][v] = 1;
        this.adjMatrix[v][u] = 1; // Since it's an undirected graph
    }

    display() {
        this.adjMatrix.forEach(row => console.log(row.join(" ")));
    }
}

// Example usage:
const graph = new Graph(4);
graph.addEdge(0, 1);
graph.addEdge(1, 2);
graph.addEdge(2, 3);
graph.addEdge(3, 0);

console.log("Adjacency Matrix:");
graph.display();

/*
Output:
Adjacency Matrix:
0 1 0 1
1 0 1 0
0 1 0 1
1 0 1 0
*/

// Explanation:
// - The graph has 4 vertices (0, 1, 2, 3).
// - An edge exists between:
//   - 0 and 1
//   - 1 and 2
//   - 2 and 3
//   - 3 and 0
