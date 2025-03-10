import heapq

def find_kth_largest(nums, k):
    return heapq.nlargest(k, nums)[-1]

def find_kth_smallest(nums, k):
    return heapq.nsmallest(k, nums)[-1]

arr = [3, 2, 1, 5, 6, 4]
k = 2

print("Kth Largest:", find_kth_largest(arr, k))
print("Kth Smallest:", find_kth_smallest(arr, k))

"""Explanation
Uses Python’s built-in heapq module.
heapq.nlargest(k, nums) returns the top k largest elements (sorted).
The last element of the result is the kth largest.
Similar logic for heapq.nsmallest(k, nums).

Summary
Language	Approach Used
Java	Min-Heap for largest, Max-Heap for smallest
JavaScript	Array sorting used as a heap
Python	heapq.nlargest() and heapq.nsmallest()
Time Complexity:
Heap-based (Java, Python): O(N log K)
Sorting-based (JavaScript): O(N log N)
These solutions efficiently find the kth largest and smallest elements."""