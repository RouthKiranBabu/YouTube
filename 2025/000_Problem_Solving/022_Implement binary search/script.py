def binary_search(arr, target):
    left, right = 0, len(arr) - 1

    while left <= right:
        mid = left + (right - left) // 2  # Avoid overflow
        
        if arr[mid] == target:
            return mid  # Target found
        
        if arr[mid] < target:
            left = mid + 1  # Search right half
        else:
            right = mid - 1  # Search left half

    return -1  # Target not found

# Example usage
arr = [1, 3, 5, 7, 9, 11, 13]
target = 7

result = binary_search(arr, target)
if result != -1:
    print("Element found at index:", result)
else:
    print("Element not found")
"""Input: arr = [1, 3, 5, 7, 9, 11, 13], target = 7
Output: Element found at index: 3
"""