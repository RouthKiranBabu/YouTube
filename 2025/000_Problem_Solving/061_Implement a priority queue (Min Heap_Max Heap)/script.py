"""
Implementation of Priority Queue using Min Heap and Max Heap in Python.

Python provides a built-in `heapq` module, which implements a Min Heap.
For a Max Heap, we store negative values in the heap to reverse order.
"""

import heapq

class script:
    def __init__(self, is_max_heap=False):
        self.heap = []
        self.is_max_heap = is_max_heap

    def push(self, value):
        if self.is_max_heap:
            heapq.heappush(self.heap, -value)  # Negate for max heap
        else:
            heapq.heappush(self.heap, value)

    def pop(self):
        if self.is_max_heap:
            return -heapq.heappop(self.heap)  # Convert back for max heap
        return heapq.heappop(self.heap)

    def peek(self):
        if self.is_max_heap:
            return -self.heap[0]
        return self.heap[0]

    def print_heap(self):
        if self.is_max_heap:
            print([-x for x in self.heap])  # Convert back for display
        else:
            print(self.heap)

# Min Heap
min_heap = script()
min_heap.push(10)
min_heap.push(40)
min_heap.push(20)
min_heap.push(5)

print("Min Heap: ")
min_heap.print_heap()
print("Min Heap Poll: ", min_heap.pop())
print("Min Heap after Poll: ")
min_heap.print_heap()

# Max Heap
max_heap = script(is_max_heap=True)
max_heap.push(10)
max_heap.push(40)
max_heap.push(20)
max_heap.push(5)

print("\nMax Heap: ")
max_heap.print_heap()
print("Max Heap Poll: ", max_heap.pop())
print("Max Heap after Poll: ")
max_heap.print_heap()

"""
Output:
Min Heap:
[5, 10, 20, 40]
Min Heap Poll: 5
Min Heap after Poll:
[10, 40, 20]

Max Heap:
[40, 10, 20, 5]
Max Heap Poll: 40
Max Heap after Poll:
[20, 10, 5]

Explanation:
- Python's `heapq` is a Min Heap by default.
- For Max Heap, we store negative values to reverse order.
- The root element (highest priority) is removed first when polling.
"""
