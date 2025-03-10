def selection_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        min_index = i
        for j in range(i + 1, n):
            if arr[j] < arr[min_index]:
                min_index = j  # Find the minimum element in unsorted part
        # Swap the found minimum element with the first element of unsorted part
        arr[i], arr[min_index] = arr[min_index], arr[i]

arr = [64, 25, 12, 22, 11]
print("Original Array:", arr)
selection_sort(arr)
print("Sorted Array:", arr)

"""Example Input and Output (Python)
Input: [64, 25, 12, 22, 11]
Output: [11, 12, 22, 25, 64]"""