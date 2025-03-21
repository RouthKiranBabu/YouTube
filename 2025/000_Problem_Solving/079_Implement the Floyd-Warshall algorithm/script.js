// Floyd-Warshall Algorithm in JavaScript
// This algorithm finds the shortest paths between all pairs of nodes in a graph.

// Time Complexity: O(V^3), where V is the number of vertices.
// Space Complexity: O(V^2) for storing the distance matrix.

const INF = Infinity; // Define infinity

// Function to implement Floyd-Warshall algorithm
function floydWarshall(graph) {
    let numVertices = graph.length;
    let dist = JSON.parse(JSON.stringify(graph)); // Clone the graph

    // Algorithm implementation
    for (let k = 0; k < numVertices; k++) {  // Intermediate node
        for (let i = 0; i < numVertices; i++) {  // Source node
            for (let j = 0; j < numVertices; j++) {  // Destination node
                if (dist[i][k] + dist[k][j] < dist[i][j]) {
                    dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
    }
    return dist;
}

// Example graph represented as an adjacency matrix
let graph = [
    [0, 3, INF, 5],
    [2, 0, INF, 4],
    [INF, 1, 0, INF],
    [INF, INF, 2, 0]
];

// Compute shortest paths
let result = floydWarshall(graph);

// Output the shortest path matrix
console.log("Shortest Distance Matrix:");
for (let row of result) {
    console.log(row);
}

// Expected Output:
// Shortest Distance Matrix:
// [ 0, 3, 7, 5 ]
// [ 2, 0, 6, 4 ]
// [ 3, 1, 0, 5 ]
// [ 5, 3, 2, 0 ]
