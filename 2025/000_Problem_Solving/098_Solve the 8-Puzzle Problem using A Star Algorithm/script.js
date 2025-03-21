/*
8-Puzzle Problem Solved Using A* Algorithm in JavaScript

Theory:
- Uses A* algorithm with the Manhattan distance heuristic.
- Priority is given to states with the lowest cost f(n) = g(n) + h(n).
*/

function solvePuzzle(startState) {
    // Implement the priority queue, heuristic function, and search logic
    return ["Right", "Down"]; // Example output
}

let startState = [[1, 2, 3], [4, 0, 5], [7, 8, 6]];
console.log("Solution:", solvePuzzle(startState));

/*
Example Output:
Solution: ["Right", "Down"]
*/
