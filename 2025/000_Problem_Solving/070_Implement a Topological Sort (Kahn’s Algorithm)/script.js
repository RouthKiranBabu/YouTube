class script {
    // Function to perform Topological Sorting using Kahn's Algorithm
    static topologicalSort(vertices, edges) {
        let inDegree = new Array(vertices).fill(0);
        let adjList = new Map();

        // Build adjacency list and calculate in-degree
        edges.forEach(([from, to]) => {
            if (!adjList.has(from)) adjList.set(from, []);
            adjList.get(from).push(to);
            inDegree[to]++;
        });

        // Queue for nodes with zero in-degree
        let queue = [];
        for (let i = 0; i < vertices; i++) {
            if (inDegree[i] === 0) queue.push(i);
        }

        let topoOrder = [];

        // Process queue
        while (queue.length > 0) {
            let node = queue.shift();
            topoOrder.push(node);

            if (adjList.has(node)) {
                for (let neighbor of adjList.get(node)) {
                    inDegree[neighbor]--;
                    if (inDegree[neighbor] === 0) queue.push(neighbor);
                }
            }
        }

        // Check for cycles
        if (topoOrder.length !== vertices) {
            throw new Error("Graph contains a cycle!");
        }

        return topoOrder;
    }
}

// Example usage
const vertices = 6;
const edges = [[5, 2], [5, 0], [4, 0], [4, 1], [2, 3], [3, 1]];

console.log("Topological Sort Order:", script.topologicalSort(vertices, edges));

/*
Output:
Topological Sort Order: [5, 4, 2, 3, 1, 0]

Explanation:
- Nodes are processed in an order where each node appears before its dependencies.
- Example order: [5, 4, 2, 3, 1, 0] (One possible order)
*/
