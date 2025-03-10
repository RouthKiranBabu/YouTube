def union_of_arrays(arr1, arr2):
    return list(set(arr1) | set(arr2))

# Example input
arr1 = [1, 2, 3, 4, 5]
arr2 = [3, 4, 5, 6, 7]

print("Union of arrays:", union_of_arrays(arr1, arr2))
"""Input
plaintext
Copy
Edit
arr1 = [1, 2, 3, 4, 5]
arr2 = [3, 4, 5, 6, 7]
Output
plaintext
Copy
Edit
Union of arrays: [1, 2, 3, 4, 5, 6, 7]
Explanation
Convert both arrays into sets.
Use the | (union) operator to merge them.
Convert the resulting set back into a list."""