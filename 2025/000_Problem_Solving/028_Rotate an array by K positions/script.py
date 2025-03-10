def rotate_right(arr, k):
    n = len(arr)
    k = k % n  # Handle cases where k > n
    return arr[-k:] + arr[:-k]

arr = [1, 2, 3, 4, 5, 6, 7]
k = 3
rotated = rotate_right(arr, k)
print("Rotated Array (Right):", rotated)

"""Input
plaintext
Copy
Edit
Array: [1, 2, 3, 4, 5, 6, 7]
K: 3
Output
plaintext
Copy
Edit
Rotated Array (Right): [5, 6, 7, 1, 2, 3, 4]"""