/*
Tarjan's Algorithm for finding Strongly Connected Components (SCC) in a directed graph.
Uses DFS with discovery and low-link values.
A stack helps keep track of the current DFS path.
Nodes with equal discovery and low-link values are SCC roots.
*/

class TarjanSCC {
    constructor(vertices) {
        this.V = vertices;
        this.graph = new Map();
        for (let i = 0; i < vertices; i++) this.graph.set(i, []);
        this.time = 0;
        this.disc = Array(vertices).fill(-1);
        this.low = Array(vertices).fill(-1);
        this.stack = [];
        this.stackMember = Array(vertices).fill(false);
        this.result = [];
    }

    addEdge(u, v) {
        this.graph.get(u).push(v);
    }

    sccUtil(u) {
        this.disc[u] = this.low[u] = this.time++;
        this.stack.push(u);
        this.stackMember[u] = true;

        for (let v of this.graph.get(u)) {
            if (this.disc[v] === -1) {
                this.sccUtil(v);
                this.low[u] = Math.min(this.low[u], this.low[v]);
            } else if (this.stackMember[v]) {
                this.low[u] = Math.min(this.low[u], this.disc[v]);
            }
        }

        if (this.low[u] === this.disc[u]) {
            let scc = [];
            while (true) {
                let w = this.stack.pop();
                this.stackMember[w] = false;
                scc.push(w);
                if (w === u) break;
            }
            this.result.push(scc);
        }
    }

    tarjanSCC() {
        for (let i = 0; i < this.V; i++) {
            if (this.disc[i] === -1) this.sccUtil(i);
        }
        return this.result;
    }
}

// Example usage:
const graph = new TarjanSCC(5);
graph.addEdge(1, 0);
graph.addEdge(0, 2);
graph.addEdge(2, 1);
graph.addEdge(0, 3);
graph.addEdge(3, 4);

console.log("Strongly Connected Components:", graph.tarjanSCC());

/*
Expected Output:
Strongly Connected Components: [[1, 2, 0], [3], [4]]
*/
