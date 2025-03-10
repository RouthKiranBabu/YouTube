/*
    JavaScript program to find the Longest Increasing Subsequence (LIS)
    Approach: Dynamic Programming
    - Create an array `dp[]` where dp[i] stores the length of LIS ending at index i.
    - Iterate through the array and update the dp array by checking previous elements.
    - Return the maximum value in dp[] as the length of LIS.
    - Time Complexity: O(n^2)
*/

class script {
    static findLIS(nums) {
        if (nums.length === 0) return 0;

        let dp = new Array(nums.length).fill(1);  // Each element is initially a subsequence of length 1
        let maxLIS = 1;  // Stores the maximum LIS found

        for (let i = 1; i < nums.length; i++) {
            for (let j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLIS = Math.max(maxLIS, dp[i]);
        }

        return maxLIS;
    }
}

// Example usage
let nums = [10, 22, 9, 33, 21, 50, 41, 60, 80];
console.log("Length of Longest Increasing Subsequence:", script.findLIS(nums));

/*
Output:
Length of Longest Increasing Subsequence: 6

Explanation:
The longest increasing subsequence in the given array is [10, 22, 33, 50, 60, 80], which has a length of 6.
*/
