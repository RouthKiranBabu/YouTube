def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    
    pivot = arr[-1]  # Choosing last element as pivot
    left = [x for x in arr[:-1] if x < pivot]
    right = [x for x in arr[:-1] if x >= pivot]

    return quick_sort(left) + [pivot] + quick_sort(right)

# Example usage
arr = [8, 4, 7, 3, 5, 2]
print("Before sorting:", arr)
sorted_arr = quick_sort(arr)
print("After sorting:", sorted_arr)

"""Example Input & Output
Input: [8, 4, 7, 3, 5, 2]
Output: [2, 3, 4, 5, 7, 8]"""