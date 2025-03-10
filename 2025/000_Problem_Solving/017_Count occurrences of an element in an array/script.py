def count_occurrences(arr, target):
    return arr.count(target)

arr = [1, 2, 3, 2, 4, 2, 5, 3, 1, 2]
target = 2
print(f"Occurrences of {target}: {count_occurrences(arr, target)}")
"""Input:
python
Copy
Edit
arr = [1, 2, 3, 2, 4, 2, 5, 3, 1, 2]
target = 2
Output:
yaml
Copy
Edit
Occurrences of 2: 4
Explanation:
The .count() method counts the number of times target appears in arr"""