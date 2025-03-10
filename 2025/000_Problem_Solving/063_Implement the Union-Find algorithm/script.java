/*
 * Union-Find Algorithm (Disjoint Set Union - DSU)
 * 
 * This data structure is used for efficient union and find operations.
 * It helps in solving connectivity problems efficiently.
 * 
 * - `find(x)`: Finds the root representative of element `x` (with path compression).
 * - `union(x, y)`: Unites two sets containing `x` and `y` (by rank).
 */

 class script {
    int[] parent, rank;

    // Constructor: Initializes n elements with their own parent
    public script(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;  // Each element is its own parent
            rank[i] = 1;    // Initial rank is 1
        }
    }

    // Find function with path compression
    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    // Union function by rank
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }

    public static void main(String[] args) {
        script uf = new script(5);
        uf.union(0, 1);
        uf.union(1, 2);
        uf.union(3, 4);

        System.out.println("Find(0): " + uf.find(0)); // Should return the same root as find(1) and find(2)
        System.out.println("Find(1): " + uf.find(1));
        System.out.println("Find(2): " + uf.find(2));
        System.out.println("Find(3): " + uf.find(3)); // Should return the same root as find(4)
        System.out.println("Find(4): " + uf.find(4));
    }
}

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
