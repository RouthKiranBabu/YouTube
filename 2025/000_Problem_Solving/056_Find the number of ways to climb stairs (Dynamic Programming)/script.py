# Explanation:
# This Python function calculates the number of ways to climb stairs using Dynamic Programming.
# We use an array dp[], where dp[i] stores the number of ways to reach the i-th step.
# The relation used is dp[i] = dp[i-1] + dp[i-2].

class script:
    @staticmethod
    def climbStairs(n):
        if n <= 1:
            return 1

        dp = [0] * (n + 1)
        dp[0], dp[1] = 1, 1

        for i in range(2, n + 1):
            dp[i] = dp[i - 1] + dp[i - 2]
            
        return dp[n]

n = 5  # Example input
print(f"Number of ways to climb {n} stairs:", script.climbStairs(n))

'''
Output:
Number of ways to climb 5 stairs: 8

Explanation:
The number of ways to climb 5 stairs is:
dp[5] = dp[4] + dp[3] => 5 + 3 = 8
where dp[4] = 5 and dp[3] = 3.
'''
