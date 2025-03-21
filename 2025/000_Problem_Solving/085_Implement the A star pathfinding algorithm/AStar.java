/*
Problem:
Implement the A* algorithm in Java for pathfinding in a 2D grid.
Theory:
- A* combines the actual cost (g) and heuristic estimate (h) to find the shortest path.
- Uses a priority queue to explore the most promising nodes first.
*/

import java.util.*;

class Node implements Comparable<Node> {
    int x, y, g, h, f;
    Node parent;

    public Node(int x, int y, int g, int h, Node parent) {
        this.x = x;
        this.y = y;
        this.g = g;
        this.h = h;
        this.f = g + h;
        this.parent = parent;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.f, other.f);
    }
}

public class AStar {
    public static int heuristic(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    public static List<int[]> astar(int[][] grid, int[] start, int[] goal) {
        PriorityQueue<Node> openSet = new PriorityQueue<>();
        Set<String> closedSet = new HashSet<>();

        Node startNode = new Node(start[0], start[1], 0, heuristic(start[0], start[1], goal[0], goal[1]), null);
        openSet.add(startNode);

        while (!openSet.isEmpty()) {
            Node current = openSet.poll();
            if (current.x == goal[0] && current.y == goal[1]) {
                List<int[]> path = new ArrayList<>();
                while (current != null) {
                    path.add(new int[]{current.x, current.y});
                    current = current.parent;
                }
                Collections.reverse(path);
                return path;
            }

            closedSet.add(current.x + "," + current.y);

            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            for (int[] d : directions) {
                int nx = current.x + d[0], ny = current.y + d[1];
                if (nx >= 0 && ny >= 0 && nx < grid.length && ny < grid[0].length && grid[nx][ny] == 0) {
                    if (closedSet.contains(nx + "," + ny)) continue;
                    int g = current.g + 1;
                    Node neighbor = new Node(nx, ny, g, heuristic(nx, ny, goal[0], goal[1]), current);
                    openSet.add(neighbor);
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {0, 1, 0, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0}
        };
        int[] start = {0, 0}, goal = {4, 4};

        List<int[]> path = astar(grid, start, goal);
        if (path != null) {
            System.out.print("Shortest Path: ");
            for (int[] p : path) System.out.print(Arrays.toString(p) + " ");
        } else {
            System.out.println("No path found.");
        }
    }
}
