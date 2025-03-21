// Problem: Detect cycles in a directed graph
// Theory: A cycle in a directed graph exists if a back edge is found during DFS traversal.
// Approach:
// - Use DFS with recursion.
// - Maintain a visited set and a recursion stack set.
// - If a node is found in the recursion stack during traversal, a cycle is detected.

class Graph {
    constructor(vertices) {
        this.V = vertices;
        this.adj = new Map();
        for (let i = 0; i < vertices; i++) {
            this.adj.set(i, []);
        }
    }

    addEdge(u, v) {
        this.adj.get(u).push(v);
    }

    isCyclicUtil(v, visited, recStack) {
        if (recStack.has(v)) return true; // Cycle detected
        if (visited.has(v)) return false; // Already processed

        visited.add(v);
        recStack.add(v);

        for (let neighbor of this.adj.get(v)) {
            if (this.isCyclicUtil(neighbor, visited, recStack)) {
                return true;
            }
        }

        recStack.delete(v); // Remove from recursion stack
        return false;
    }

    isCyclic() {
        let visited = new Set();
        let recStack = new Set();

        for (let node = 0; node < this.V; node++) {
            if (!visited.has(node) && this.isCyclicUtil(node, visited, recStack)) {
                return true;
            }
        }
        return false;
    }
}

// Example Usage
const g = new Graph(4);
g.addEdge(0, 1);
g.addEdge(1, 2);
g.addEdge(2, 0); // Creates a cycle
g.addEdge(2, 3);

console.log(g.isCyclic() ? "Cycle detected!" : "No cycle detected.");

// Output:
// Cycle detected!
