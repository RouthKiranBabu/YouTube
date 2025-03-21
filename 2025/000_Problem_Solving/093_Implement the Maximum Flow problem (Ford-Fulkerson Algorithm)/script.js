// Problem: Implement Maximum Flow problem using Ford-Fulkerson Algorithm in JavaScript
// Theory:
// - This algorithm finds the max flow in a graph using BFS to find augmenting paths.
// - It updates residual capacities until no more augmenting paths exist.

class Graph {
    constructor(vertices) {
        this.V = vertices;
        this.graph = Array.from({ length: vertices }, () => Array(vertices).fill(0));
    }

    addEdge(u, v, capacity) {
        this.graph[u][v] = capacity; // Assign capacity
    }

    bfs(source, sink, parent) {
        let visited = Array(this.V).fill(false);
        let queue = [source];
        visited[source] = true;

        while (queue.length > 0) {
            let u = queue.shift();
            for (let v = 0; v < this.V; v++) {
                if (!visited[v] && this.graph[u][v] > 0) {
                    queue.push(v);
                    parent[v] = u;
                    visited[v] = true;
                    if (v === sink) return true;
                }
            }
        }
        return false;
    }

    fordFulkerson(source, sink) {
        let parent = Array(this.V).fill(-1);
        let maxFlow = 0;

        while (this.bfs(source, sink, parent)) {
            let pathFlow = Infinity;
            let v = sink;

            while (v !== source) {
                let u = parent[v];
                pathFlow = Math.min(pathFlow, this.graph[u][v]);
                v = u;
            }

            v = sink;
            while (v !== source) {
                let u = parent[v];
                this.graph[u][v] -= pathFlow;
                this.graph[v][u] += pathFlow;
                v = u;
            }

            maxFlow += pathFlow;
        }

        return maxFlow;
    }
}

// Example usage:
let g = new Graph(6);
g.addEdge(0, 1, 16);
// Add remaining edges...
console.log("The maximum possible flow is:", g.fordFulkerson(0, 5));
