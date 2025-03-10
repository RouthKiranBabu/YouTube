/*
 * Disjoint Set Union (DSU) or Union-Find
 * 
 * This data structure efficiently handles dynamic connectivity queries.
 * It supports two main operations:
 * 1. find(x) - Finds the root representative of the set containing 'x'.
 * 2. union(x, y) - Merges the sets containing 'x' and 'y'.
 * 
 * The implementation uses:
 * - Path compression to make 'find' operations faster.
 * - Union by rank to keep the tree balanced.
 */

 class script {
    private int[] parent;
    private int[] rank;

    // Constructor to initialize DSU
    public script(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i; // Each element is its own parent
            rank[i] = 1;   // Rank initialized to 1
        }
    }

    // Find with path compression
    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    // Union by rank
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

    // Method to print the parent array (for debugging)
    public void printSets() {
        for (int i = 0; i < parent.length; i++) {
            System.out.print(find(i) + " ");
        }
        System.out.println();
    }

    // Main function to test the DSU
    public static void main(String[] args) {
        script dsu = new script(7); // 7 elements (0 to 6)
        
        dsu.union(1, 2);
        dsu.union(2, 3);
        dsu.union(4, 5);
        dsu.union(5, 6);

        System.out.println(dsu.find(2)); // Output: Root of set containing 2
        System.out.println(dsu.find(5)); // Output: Root of set containing 5

        dsu.printSets(); // Prints representative for each element
    }
}

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
