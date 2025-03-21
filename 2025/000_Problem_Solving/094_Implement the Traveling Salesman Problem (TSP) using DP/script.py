# Traveling Salesman Problem (TSP) using Dynamic Programming (Held-Karp Algorithm)

import sys

# Function to solve TSP using DP and Bitmasking
def tsp(mask, pos, dp, dist, n):
    # Base case: all cities visited
    if mask == (1 << n) - 1:
        return dist[pos][0]  # Return to starting city

    # Return stored result if already computed
    if dp[mask][pos] != -1:
        return dp[mask][pos]

    min_cost = sys.maxsize

    # Try visiting all unvisited cities
    for city in range(n):
        if (mask & (1 << city)) == 0:  # If city is not visited
            new_cost = dist[pos][city] + tsp(mask | (1 << city), city, dp, dist, n)
            min_cost = min(min_cost, new_cost)

    # Store result and return
    dp[mask][pos] = min_cost
    return min_cost

# Driver function
def solve_tsp(dist):
    n = len(dist)
    dp = [[-1] * n for _ in range(1 << n)]
    return tsp(1, 0, dp, dist, n)  # Start from city 0 with only city 0 visited

# Example Input
dist_matrix = [
    [0, 10, 15, 20],
    [10, 0, 35, 25],
    [15, 35, 0, 30],
    [20, 25, 30, 0]
]

# Solve TSP
min_cost = solve_tsp(dist_matrix)
print("Minimum Traveling Cost:", min_cost)

"""
Expected Output:
Minimum Traveling Cost: 80
"""
