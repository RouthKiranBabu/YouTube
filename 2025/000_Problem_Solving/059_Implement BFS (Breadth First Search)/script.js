/*
 * Breadth-First Search (BFS) Implementation in JavaScript
 * BFS is used for traversing or searching tree/graph data structures.
 * It explores all nodes at the current depth before moving to the next level.
 */

class script {
    constructor() {
        this.adjList = new Map();
    }

    // Method to add an edge to the graph
    addEdge(src, dest) {
        if (!this.adjList.has(src)) this.adjList.set(src, []);
        if (!this.adjList.has(dest)) this.adjList.set(dest, []);
        this.adjList.get(src).push(dest);
    }

    // BFS Implementation
    bfs(startNode) {
        let queue = [startNode];
        let visited = new Set();
        visited.add(startNode);

        console.log("BFS Traversal:", startNode);

        while (queue.length > 0) {
            let current = queue.shift();
            process.stdout.write(current + " ");

            for (let neighbor of (this.adjList.get(current) || [])) {
                if (!visited.has(neighbor)) {
                    queue.push(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        console.log();
    }
}

// Creating and testing the graph
let graph = new script();
graph.addEdge(0, 1);
graph.addEdge(0, 2);
graph.addEdge(1, 3);
graph.addEdge(1, 4);
graph.addEdge(2, 5);
graph.addEdge(2, 6);

// Perform BFS starting from node 0
graph.bfs(0);

/*
 * Output:
 * BFS Traversal: 0 1 2 3 4 5 6
 * 
 * Explanation:
 * The BFS starts at node 0, then explores its neighbors (1,2), then their neighbors (3,4,5,6).
 */
