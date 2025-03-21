/*
Problem:
Implement the A* (A-star) pathfinding algorithm in JavaScript.
Theory:
- A* is an informed search algorithm that finds the shortest path using:
  - g(n): Cost from the start node to the current node
  - h(n): Heuristic estimate to the goal (Manhattan distance)
  - f(n) = g(n) + h(n): Total estimated cost
- Uses a priority queue (min-heap) to explore nodes in the most promising order.
*/

class Node {
    constructor(position, g, h, parent = null) {
        this.position = position;  // [x, y] coordinates
        this.g = g;  // Cost from start node
        this.h = h;  // Heuristic cost to goal
        this.f = g + h;  // Total cost
        this.parent = parent;  // Parent node for path reconstruction
    }
}

// Heuristic function: Manhattan distance
function heuristic(a, b) {
    return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
}

function astar(grid, start, goal) {
    let openSet = [];
    let closedSet = new Set();
    
    let startNode = new Node(start, 0, heuristic(start, goal));
    openSet.push(startNode);

    while (openSet.length > 0) {
        // Sort open set by f value (priority queue simulation)
        openSet.sort((a, b) => a.f - b.f);
        let current = openSet.shift();

        if (current.position[0] === goal[0] && current.position[1] === goal[1]) {
            // Path found, reconstruct it
            let path = [];
            while (current) {
                path.push(current.position);
                current = current.parent;
            }
            return path.reverse();
        }

        closedSet.add(current.position.toString());

        // Explore neighbors (up, down, left, right)
        let directions = [[-1, 0], [1, 0], [0, -1], [0, 1]];
        for (let [dx, dy] of directions) {
            let nx = current.position[0] + dx;
            let ny = current.position[1] + dy;
            let neighborPos = [nx, ny];

            if (
                nx >= 0 && ny >= 0 &&
                nx < grid.length && ny < grid[0].length &&
                grid[nx][ny] === 0 &&
                !closedSet.has(neighborPos.toString())
            ) {
                let gScore = current.g + 1;
                let neighbor = new Node(neighborPos, gScore, heuristic(neighborPos, goal), current);
                openSet.push(neighbor);
            }
        }
    }
    return null;  // No path found
}

// Example usage
let grid = [
    [0, 1, 0, 0, 0],
    [0, 1, 0, 1, 0],
    [0, 0, 0, 1, 0],
    [1, 1, 0, 1, 0],
    [0, 0, 0, 0, 0]
];
let start = [0, 0];
let goal = [4, 4];

let path = astar(grid, start, goal);
console.log("Shortest Path:", path);

/*
Output:
Shortest Path: [[0,0],[1,0],[2,0],[2,1],[2,2],[3,2],[4,2],[4,3],[4,4]]
*/
