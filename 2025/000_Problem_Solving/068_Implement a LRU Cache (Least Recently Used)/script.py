"""
LRU (Least Recently Used) Cache implementation using OrderedDict in Python.
OrderedDict maintains insertion order, allowing O(1) access time for get and put.
When the cache exceeds its capacity, the least recently used entry is removed.
"""

from collections import OrderedDict

class script:
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.cache = OrderedDict()

    def get(self, key: int) -> str:
        if key not in self.cache:
            return -1
        self.cache.move_to_end(key)  # Moves key to the end (most recently used)
        return self.cache[key]

    def put(self, key: int, value: str) -> None:
        if key in self.cache:
            self.cache.move_to_end(key)
        self.cache[key] = value
        if len(self.cache) > self.capacity:
            self.cache.popitem(last=False)  # Removes the least recently used key

    def print_cache(self):
        print(list(self.cache.items()))

# Example Usage
cache = script(3)

cache.put(1, "A")
cache.put(2, "B")
cache.put(3, "C")
cache.print_cache()  # [(1, 'A'), (2, 'B'), (3, 'C')]

cache.get(1)  # Moves key 1 to the end
cache.put(4, "D")  # Removes the least recently used (2)
cache.print_cache()  # [(3, 'C'), (1, 'A'), (4, 'D')]

cache.put(5, "E")  # Removes the least recently used (3)
cache.print_cache()  # [(1, 'A'), (4, 'D'), (5, 'E')]

"""
Output:
[(1, 'A'), (2, 'B'), (3, 'C')]
[(3, 'C'), (1, 'A'), (4, 'D')]
[(1, 'A'), (4, 'D'), (5, 'E')]

Explanation:
- Initially, the cache is filled with 3 elements.
- Accessing key 1 moves it to the end.
- Adding key 4 removes key 2 (least recently used).
- Adding key 5 removes key 3.
"""
