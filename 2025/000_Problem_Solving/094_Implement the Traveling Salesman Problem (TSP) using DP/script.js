// Traveling Salesman Problem (TSP) using Dynamic Programming (Held-Karp Algorithm)

const INF = Number.MAX_SAFE_INTEGER;
let n;
let dist;
let dp;

// Function to solve TSP using DP and Bitmasking
function tsp(mask, pos) {
    // Base case: all cities visited
    if (mask === (1 << n) - 1) return dist[pos][0];

    // Return stored result if already computed
    if (dp[mask][pos] !== -1) return dp[mask][pos];

    let minCost = INF;

    // Try visiting all unvisited cities
    for (let city = 0; city < n; city++) {
        if ((mask & (1 << city)) === 0) { // If city is not visited
            let newCost = dist[pos][city] + tsp(mask | (1 << city), city);
            minCost = Math.min(minCost, newCost);
        }
    }

    // Store result and return
    dp[mask][pos] = minCost;
    return minCost;
}

// Driver function
function solveTSP(matrix) {
    dist = matrix;
    n = dist.length;
    dp = Array(1 << n).fill().map(() => Array(n).fill(-1));

    return tsp(1, 0); // Start from city 0 with only city 0 visited
}

// Example Input
const distMatrix = [
    [0, 10, 15, 20],
    [10, 0, 35, 25],
    [15, 35, 0, 30],
    [20, 25, 30, 0]
];

// Solve TSP
console.log("Minimum Traveling Cost:", solveTSP(distMatrix));

/*
Expected Output:
Minimum Traveling Cost: 80
*/
