def insertion_sort(arr):
    n = len(arr)
    for i in range(1, n):
        key = arr[i]
        j = i - 1
        
        # Move elements of arr[0..i-1] that are greater than key
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

arr = [9, 5, 1, 4, 3]
print("Before Sorting:", arr)
insertion_sort(arr)
print("After Sorting:", arr)

"""Output:
Before Sorting: [9, 5, 1, 4, 3]
After Sorting: [1, 3, 4, 5, 9]
"""