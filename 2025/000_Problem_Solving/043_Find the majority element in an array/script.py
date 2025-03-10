def find_majority_element(nums):
    candidate, count = 0, 0

    for num in nums:
        if count == 0:
            candidate = num
        count += (1 if num == candidate else -1)

    return candidate

nums = [2, 2, 1, 1, 1, 2, 2]
print("Majority Element:", find_majority_element(nums))
