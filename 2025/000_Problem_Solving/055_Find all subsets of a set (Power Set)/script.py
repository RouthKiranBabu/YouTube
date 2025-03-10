# The following Python program generates all subsets (Power Set) of a given set using recursion.
# It defines a helper function that explores subsets by including/excluding elements.

class script:
    @staticmethod
    def getSubsets(arr, index, current, result):
        if index == len(arr):
            result.append(current[:])  # Store current subset
            return
        
        # Include current element
        current.append(arr[index])
        script.getSubsets(arr, index + 1, current, result)
        
        # Exclude current element
        current.pop()
        script.getSubsets(arr, index + 1, current, result)

    @staticmethod
    def main():
        arr = [1, 2, 3]  # Input set
        result = []
        
        script.getSubsets(arr, 0, [], result)
        print("Power Set:", result)

script.main()

'''
Output:
Power Set: [[], [3], [2], [2, 3], [1], [1, 3], [1, 2], [1, 2, 3]]

Explanation:
- The function recursively builds subsets by either including or excluding elements.
- The result contains all subsets, including the empty and full set.
'''
