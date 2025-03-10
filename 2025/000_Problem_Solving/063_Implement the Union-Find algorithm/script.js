/*
 * Union-Find Algorithm (Disjoint Set Union - DSU)
 * 
 * - `find(x)`: Finds the root representative of `x` (with path compression).
 * - `union(x, y)`: Unites two sets containing `x` and `y` (by rank).
 */

class script {
    constructor(n) {
        this.parent = Array(n).fill(0).map((_, i) => i);
        this.rank = Array(n).fill(1);
    }

    // Find function with path compression
    find(x) {
        if (this.parent[x] !== x) {
            this.parent[x] = this.find(this.parent[x]); // Path compression
        }
        return this.parent[x];
    }

    // Union function by rank
    union(x, y) {
        let rootX = this.find(x);
        let rootY = this.find(y);

        if (rootX !== rootY) {
            if (this.rank[rootX] > this.rank[rootY]) {
                this.parent[rootY] = rootX;
            } else if (this.rank[rootX] < this.rank[rootY]) {
                this.parent[rootX] = rootY;
            } else {
                this.parent[rootY] = rootX;
                this.rank[rootX]++;
            }
        }
    }
}

// Example Usage
const uf = new script(5);
uf.union(0, 1);
uf.union(1, 2);
uf.union(3, 4);

console.log("Find(0):", uf.find(0)); // Should return the same root as find(1) and find(2)
console.log("Find(1):", uf.find(1));
console.log("Find(2):", uf.find(2));
console.log("Find(3):", uf.find(3)); // Should return the same root as find(4)
console.log("Find(4):", uf.find(4));

/*
 * Output:
 * Find(0): 0
 * Find(1): 0
 * Find(2): 0
 * Find(3): 3
 * Find(4): 3
 * 
 * Explanation:
 * - Elements {0,1,2} are connected in one set with root 0.
 * - Elements {3,4} are connected in another set with root 3.
 * - The `find` function confirms the root of each element.
 */
