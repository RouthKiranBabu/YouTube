"""
Dijkstra's Algorithm in Python

Explanation:
- This function finds the shortest path from a source node to all other nodes.
- A priority queue (min-heap) is used to process nodes with the shortest known distance first.
- The graph is represented using a dictionary of adjacency lists.
- Distances are stored in a dictionary and updated as we find shorter paths.
"""

import heapq

class script:
    @staticmethod
    def dijkstra(graph, source):
        pq = [(0, source)]
        distances = {node: float('inf') for node in graph}
        distances[source] = 0

        while pq:
            current_distance, u = heapq.heappop(pq)

            for neighbor, weight in graph[u]:
                new_distance = current_distance + weight
                if new_distance < distances[neighbor]:
                    distances[neighbor] = new_distance
                    heapq.heappush(pq, (new_distance, neighbor))

        print("Shortest distances from source node", source, ":", distances)


# Graph representation
graph = {
    0: [(1, 4), (2, 1)],
    1: [(3, 1)],
    2: [(1, 2), (3, 5)],
    3: []
}

script.dijkstra(graph, 0)

"""
Output:
Shortest distances from source node 0: {0: 0, 1: 3, 2: 1, 3: 4}

Explanation:
- The shortest path from node 0 to 1 is 0 → 2 → 1 (cost 3).
- The shortest path from node 0 to 2 is 0 → 2 (cost 1).
- The shortest path from node 0 to 3 is 0 → 2 → 1 → 3 (cost 4).
"""
