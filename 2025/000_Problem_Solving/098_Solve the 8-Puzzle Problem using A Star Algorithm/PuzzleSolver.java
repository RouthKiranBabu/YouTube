import java.util.*;

class PuzzleNode implements Comparable<PuzzleNode> {
    int[][] state;
    PuzzleNode parent;
    String move;
    int depth;
    int cost;

    public PuzzleNode(int[][] state, PuzzleNode parent, String move, int depth, int cost) {
        this.state = state;
        this.parent = parent;
        this.move = move;
        this.depth = depth;
        this.cost = cost;
    }

    @Override
    public int compareTo(PuzzleNode other) {
        return (this.depth + this.cost) - (other.depth + other.cost);
    }
}

public class PuzzleSolver {
    static final int[][] GOAL_STATE = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};

    static int calculateManhattanDistance(int[][] state) {
        int distance = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (state[i][j] == 0) continue;
                int x = (state[i][j] - 1) / 3;
                int y = (state[i][j] - 1) % 3;
                distance += Math.abs(x - i) + Math.abs(y - j);
            }
        }
        return distance;
    }

    static List<String> solvePuzzle(int[][] startState) {
        PriorityQueue<PuzzleNode> pq = new PriorityQueue<>();
        pq.add(new PuzzleNode(startState, null, null, 0, calculateManhattanDistance(startState)));
        Set<String> visited = new HashSet<>();

        while (!pq.isEmpty()) {
            PuzzleNode node = pq.poll();

            // If we reach the goal state, reconstruct the path
            if (Arrays.deepEquals(node.state, GOAL_STATE)) {
                List<String> path = new ArrayList<>();
                while (node.parent != null) {
                    path.add(node.move);
                    node = node.parent;
                }
                Collections.reverse(path);
                return path;
            }

            visited.add(Arrays.deepToString(node.state));

            for (var neighbor : getNeighbors(node.state)) {
                int[][] newState = neighbor.getKey();
                String move = neighbor.getValue();

                if (!visited.contains(Arrays.deepToString(newState))) {
                    pq.add(new PuzzleNode(newState, node, move, node.depth + 1, calculateManhattanDistance(newState)));
                }
            }
        }
        return null;
    }

    // Generate possible moves (Up, Down, Left, Right)
    static List<AbstractMap.SimpleEntry<int[][], String>> getNeighbors(int[][] state) {
        List<AbstractMap.SimpleEntry<int[][], String>> neighbors = new ArrayList<>();
        int x = -1, y = -1;

        // Find the position of the empty space (0)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (state[i][j] == 0) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        // Possible moves
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        String[] moves = {"Up", "Down", "Left", "Right"};

        for (int i = 0; i < 4; i++) {
            int nx = x + directions[i][0], ny = y + directions[i][1];
            if (nx >= 0 && nx < 3 && ny >= 0 && ny < 3) {
                int[][] newState = deepCopy(state);
                newState[x][y] = newState[nx][ny];
                newState[nx][ny] = 0;
                neighbors.add(new AbstractMap.SimpleEntry<>(newState, moves[i]));
            }
        }

        return neighbors;
    }

    // Helper method to deep copy a 2D array
    static int[][] deepCopy(int[][] array) {
        int[][] copy = new int[3][3];
        for (int i = 0; i < 3; i++) {
            System.arraycopy(array[i], 0, copy[i], 0, 3);
        }
        return copy;
    }

    public static void main(String[] args) {
        int[][] startState = {{1, 2, 3}, {4, 0, 5}, {7, 8, 6}};
        List<String> solution = solvePuzzle(startState);

        if (solution != null) {
            System.out.println("Solution: " + solution);
        } else {
            System.out.println("No solution found.");
        }
    }
}
