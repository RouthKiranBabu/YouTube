def find_intersection(nums1, nums2):
    set1 = set(nums1)
    result_set = set()

    for num in nums2:
        if num in set1:
            result_set.add(num)

    return list(result_set)

# Example Usage
nums1 = [1, 2, 2, 3, 4]
nums2 = [2, 2, 4, 5]

print("Intersection:", find_intersection(nums1, nums2))
