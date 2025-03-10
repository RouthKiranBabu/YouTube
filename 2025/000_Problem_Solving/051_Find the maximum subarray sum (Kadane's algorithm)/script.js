// JavaScript program to find the maximum subarray sum using Kadane's Algorithm
class script {
    static maxSubArraySum(nums) {
        let maxSum = -Infinity; // Stores the maximum sum found
        let currentSum = 0; // Stores the running sum of the subarray

        for (let num of nums) {
            currentSum += num; // Add the current number to the running sum
            maxSum = Math.max(maxSum, currentSum); // Update maxSum if currentSum is greater
            
            // If currentSum becomes negative, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}

// Example usage
let arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4];
console.log("Maximum Subarray Sum:", script.maxSubArraySum(arr));

/*
Output:
Maximum Subarray Sum: 6

Explanation:
The subarray [4, -1, 2, 1] has the maximum sum of 6.
Kadane's Algorithm ensures that negative sums are ignored by resetting the current sum.
*/
