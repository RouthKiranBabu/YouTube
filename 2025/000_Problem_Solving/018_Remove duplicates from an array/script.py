def remove_duplicates(arr):
    return list(dict.fromkeys(arr))  # Maintains order while removing duplicates

arr = [1, 2, 3, 2, 4, 5, 1, 6]
print(remove_duplicates(arr))
