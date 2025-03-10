/*
 * Disjoint Set Union (DSU) or Union-Find in JavaScript
 * 
 * This data structure supports:
 * 1. find(x) - Finds the representative of the set containing 'x' (with path compression).
 * 2. union(x, y) - Merges the sets containing 'x' and 'y' (using union by rank).
 */

class script {
    constructor(n) {
        this.parent = Array.from({ length: n }, (_, i) => i);
        this.rank = Array(n).fill(1);
    }

    // Find with path compression
    find(x) {
        if (this.parent[x] !== x) {
            this.parent[x] = this.find(this.parent[x]);
        }
        return this.parent[x];
    }

    // Union by rank
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

    // Print the parent array for debugging
    printSets() {
        console.log(this.parent.map((_, i) => this.find(i)).join(" "));
    }
}

// Testing DSU
const dsu = new script(7);

dsu.union(1, 2);
dsu.union(2, 3);
dsu.union(4, 5);
dsu.union(5, 6);

console.log(dsu.find(2)); // Output: Root of set containing 2
console.log(dsu.find(5)); // Output: Root of set containing 5

dsu.printSets(); // Prints representatives for each element

/*
 * Output:
 * 1
 * 4
 * 0 1 1 1 4 4 4
 *
 * Explanation:
 * - Elements 1, 2, and 3 belong to the same set with representative 1.
 * - Elements 4, 5, and 6 belong to the same set with representative 4.
 */
