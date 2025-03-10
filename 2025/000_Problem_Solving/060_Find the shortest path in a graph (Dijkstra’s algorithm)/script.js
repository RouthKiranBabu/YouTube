/*
 * Dijkstra's Algorithm in JavaScript
 * 
 * Explanation:
 * - This function finds the shortest path from a source node to all other nodes.
 * - We use a priority queue (min-heap) to always expand the node with the shortest distance first.
 * - The graph is represented as an adjacency list.
 * - We store distances in a dictionary and update them as we find shorter paths.
 */

class script {
    static dijkstra(graph, source) {
        let distances = {};
        let pq = new MinHeap();

        for (let node in graph) distances[node] = Infinity;
        distances[source] = 0;
        pq.insert([source, 0]);

        while (!pq.isEmpty()) {
            let [u, currentDistance] = pq.extractMin();

            for (let [neighbor, weight] of graph[u]) {
                let newDist = currentDistance + weight;
                if (newDist < distances[neighbor]) {
                    distances[neighbor] = newDist;
                    pq.insert([neighbor, newDist]);
                }
            }
        }

        console.log("Shortest distances from source node " + source + ":", distances);
    }
}

// MinHeap implementation for priority queue
class MinHeap {
    constructor() { this.heap = []; }
    
    insert(value) {
        this.heap.push(value);
        this.heap.sort((a, b) => a[1] - b[1]);
    }

    extractMin() { return this.heap.shift(); }
    
    isEmpty() { return this.heap.length === 0; }
}

// Graph representation
let graph = {
    0: [[1, 4], [2, 1]],
    1: [[3, 1]],
    2: [[1, 2], [3, 5]],
    3: []
};

script.dijkstra(graph, 0);

/*
 * Output:
 * Shortest distances from source node 0: { '0': 0, '1': 3, '2': 1, '3': 4 }
 * 
 * Explanation:
 * - The shortest path from node 0 to 1 is 0 → 2 → 1 (cost 3).
 * - The shortest path from node 0 to 2 is 0 → 2 (cost 1).
 * - The shortest path from node 0 to 3 is 0 → 2 → 1 → 3 (cost 4).
 */
