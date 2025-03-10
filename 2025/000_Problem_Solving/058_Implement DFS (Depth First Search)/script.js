/*
 * Depth First Search (DFS) Implementation in JavaScript
 * The function uses an adjacency list to represent the graph.
 * It explores nodes as deep as possible before backtracking.
 */

class script {
    constructor(vertices) {
        this.vertices = vertices;
        this.adjacencyList = new Map();
        
        for (let i = 0; i < vertices; i++) {
            this.adjacencyList.set(i, []);
        }
    }

    // Method to add an edge
    addEdge(v, w) {
        this.adjacencyList.get(v).push(w);
    }

    // DFS utility function
    DFSUtil(v, visited) {
        visited[v] = true;
        process.stdout.write(v + " "); // Print the visited node

        for (let neighbor of this.adjacencyList.get(v)) {
            if (!visited[neighbor]) {
                this.DFSUtil(neighbor, visited);
            }
        }
    }

    // Function to perform DFS
    DFS(startVertex) {
        let visited = new Array(this.vertices).fill(false);
        this.DFSUtil(startVertex, visited);
    }
}

// Example usage
let graph = new script(6);
graph.addEdge(0, 1);
graph.addEdge(0, 2);
graph.addEdge(1, 3);
graph.addEdge(1, 4);
graph.addEdge(2, 5);

console.log("Depth First Search (DFS) starting from vertex 0:");
graph.DFS(0);

/*
 * Output:
 * Depth First Search (DFS) starting from vertex 0:
 * 0 1 3 4 2 5 
 * 
 * Explanation:
 * The traversal starts from node 0, explores node 1 first, going deeper before backtracking.
 * The traversal follows: 0 → 1 → 3 → 4 → backtrack → 2 → 5.
 */
