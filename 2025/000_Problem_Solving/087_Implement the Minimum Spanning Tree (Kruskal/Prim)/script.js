// Problem: Implement Minimum Spanning Tree (MST) using Kruskal's Algorithm
// Theory:
// - Uses the Union-Find algorithm to detect cycles.
// - Picks the smallest edge that doesn’t form a cycle.

class DisjointSet {
    constructor(n) {
        this.parent = Array.from({ length: n }, (_, i) => i);
        this.rank = Array(n).fill(0);
    }
    find(i) {
        if (this.parent[i] !== i) this.parent[i] = this.find(this.parent[i]);
        return this.parent[i];
    }
    union(x, y) {
        let rootX = this.find(x), rootY = this.find(y);
        if (rootX !== rootY) {
            if (this.rank[rootX] > this.rank[rootY]) this.parent[rootY] = rootX;
            else if (this.rank[rootX] < this.rank[rootY]) this.parent[rootX] = rootY;
            else { this.parent[rootY] = rootX; this.rank[rootX]++; }
        }
    }
}

function kruskalMST(edges, V) {
    edges.sort((a, b) => a[2] - b[2]);
    let ds = new DisjointSet(V), mst = [];
    edges.forEach(([u, v, w]) => { if (ds.find(u) !== ds.find(v)) { mst.push([u, v, w]); ds.union(u, v); } });
    return mst;
}

console.log(kruskalMST([[0,1,10],[0,2,6],[0,3,5],[1,3,15],[2,3,4]], 4));
