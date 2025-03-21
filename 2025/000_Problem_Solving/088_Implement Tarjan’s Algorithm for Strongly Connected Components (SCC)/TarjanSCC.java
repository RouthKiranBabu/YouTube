/*
Tarjan's Algorithm for finding Strongly Connected Components (SCC) in a directed graph.
Uses DFS and maintains discovery and low-link values.
A stack keeps track of nodes in the current DFS path.
Nodes whose discovery time matches their low-link value are SCC roots.
*/

import java.util.*;

class TarjanSCC {
    private int V; // Number of vertices
    private List<List<Integer>> graph; // Adjacency list
    private int time; // Time counter
    private int[] disc, low; // Discovery and low-link values
    private boolean[] stackMember; // Tracks if a node is in the stack
    private Stack<Integer> stack; // Stack for SCC tracking
    private List<List<Integer>> result; // Stores SCCs

    public TarjanSCC(int vertices) {
        this.V = vertices;
        this.graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        this.disc = new int[vertices];
        Arrays.fill(disc, -1);
        this.low = new int[vertices];
        this.stackMember = new boolean[vertices];
        this.stack = new Stack<>();
        this.result = new ArrayList<>();
        this.time = 0;
    }

    public void addEdge(int u, int v) {
        graph.get(u).add(v);
    }

    private void sccUtil(int u) {
        disc[u] = low[u] = time++;
        stack.push(u);
        stackMember[u] = true;

        for (int v : graph.get(u)) {
            if (disc[v] == -1) {
                sccUtil(v);
                low[u] = Math.min(low[u], low[v]);
            } else if (stackMember[v]) {
                low[u] = Math.min(low[u], disc[v]);
            }
        }

        if (low[u] == disc[u]) {
            List<Integer> scc = new ArrayList<>();
            while (true) {
                int w = stack.pop();
                stackMember[w] = false;
                scc.add(w);
                if (w == u) break;
            }
            result.add(scc);
        }
    }

    public List<List<Integer>> tarjanSCC() {
        for (int i = 0; i < V; i++) {
            if (disc[i] == -1) {
                sccUtil(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TarjanSCC graph = new TarjanSCC(5);
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(2, 1);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);

        System.out.println("Strongly Connected Components: " + graph.tarjanSCC());
    }
}

/*
Expected Output:
Strongly Connected Components: [[1, 2, 0], [3], [4]]
*/
