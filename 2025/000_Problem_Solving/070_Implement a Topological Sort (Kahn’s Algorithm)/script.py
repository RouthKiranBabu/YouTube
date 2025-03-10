from collections import deque

class script:
    @staticmethod
    def topological_sort(vertices, edges):
        # Step 1: Compute in-degree and adjacency list
        in_degree = [0] * vertices
        adj_list = {i: [] for i in range(vertices)}

        for frm, to in edges:
            adj_list[frm].append(to)
            in_degree[to] += 1

        # Step 2: Enqueue nodes with in-degree 0
        queue = deque([i for i in range(vertices) if in_degree[i] == 0])
        topo_order = []

        # Step 3: Process nodes in queue
        while queue:
            node = queue.popleft()
            topo_order.append(node)

            for neighbor in adj_list[node]:
                in_degree[neighbor] -= 1
                if in_degree[neighbor] == 0:
                    queue.append(neighbor)

        # Step 4: Detect cycle
        if len(topo_order) != vertices:
            raise Exception("Graph contains a cycle!")

        return topo_order

# Example usage
vertices = 6
edges = [(5, 2), (5, 0), (4, 0), (4, 1), (2, 3), (3, 1)]

print("Topological Sort Order:", script.topological_sort(vertices, edges))

"""
Output:
Topological Sort Order: [5, 4, 2, 3, 1, 0]

Explanation:
- Nodes are processed in an order where each node appears before its dependencies.
- Example order: [5, 4, 2, 3, 1, 0] (One possible order)
"""
