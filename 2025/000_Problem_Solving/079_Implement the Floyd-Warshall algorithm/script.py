# Floyd-Warshall Algorithm in Python
# The Floyd-Warshall algorithm finds the shortest paths between all pairs of nodes
# in a given weighted graph. It works on both directed and undirected graphs.

# Time Complexity: O(V^3), where V is the number of vertices.
# Space Complexity: O(V^2) for storing the distance matrix.

# Define infinity as a large enough value
INF = float('inf')

def floyd_warshall(graph):
    """
    Function to implement the Floyd-Warshall algorithm.
    :param graph: 2D list representing the adjacency matrix of the graph
    :return: Shortest distance matrix
    """
    num_vertices = len(graph)
    
    # Create a copy of the graph as the distance matrix
    dist = [row[:] for row in graph]

    # Algorithm implementation
    for k in range(num_vertices):  # Intermediate node
        for i in range(num_vertices):  # Source node
            for j in range(num_vertices):  # Destination node
                if dist[i][k] + dist[k][j] < dist[i][j]:  # Check for shorter path
                    dist[i][j] = dist[i][k] + dist[k][j]

    return dist

# Example graph represented as an adjacency matrix
graph = [
    [0, 3, INF, 5],
    [2, 0, INF, 4],
    [INF, 1, 0, INF],
    [INF, INF, 2, 0]
]

# Compute shortest paths
result = floyd_warshall(graph)

# Output the shortest path matrix
print("Shortest Distance Matrix:")
for row in result:
    print(row)

# Expected Output:
# Shortest Distance Matrix:
# [0, 3, 7, 5]
# [2, 0, 6, 4]
# [3, 1, 0, 5]
# [5, 3, 2, 0]
