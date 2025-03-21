/*
Problem: Check if a given graph is bipartite.

Theory:
A graph is bipartite if we can color its vertices using two colors such that no two adjacent vertices have the same color.
We use BFS to traverse nodes and ensure proper coloring.
*/

function isBipartite(graph) {
    let n = graph.length;
    let color = new Array(n).fill(-1); // -1 means uncolored

    for (let start = 0; start < n; start++) { // Check all components
        if (color[start] === -1) {
            let queue = [start];
            color[start] = 0; // Start with color 0

            while (queue.length > 0) {
                let node = queue.shift();
                for (let neighbor of graph[node]) {
                    if (color[neighbor] === -1) {
                        color[neighbor] = 1 - color[node];
                        queue.push(neighbor);
                    } else if (color[neighbor] === color[node]) {
                        return false; // If adjacent nodes have the same color, not bipartite
                    }
                }
            }
        }
    }
    return true;
}

// Example usage
let graph = [
    [1, 3], // Node 0 is connected to 1 and 3
    [0, 2], // Node 1 is connected to 0 and 2
    [1, 3], // Node 2 is connected to 1 and 3
    [0, 2]  // Node 3 is connected to 0 and 2
];

console.log(isBipartite(graph)); // Output: true

/*
Explanation:
- The given graph is a cycle of even length (4 nodes), which is bipartite.
- BFS ensures that adjacent nodes have alternate colors.
*/
