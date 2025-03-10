# Python program to find the number of ways to make change for a given amount
# using dynamic programming.

def count_ways(coins, amount):
    # Create a dp array to store the number of ways to make change
    dp = [0] * (amount + 1)

    # Base case: There's 1 way to make change for amount 0 (by using no coins)
    dp[0] = 1

    # Process each coin and update dp array
    for coin in coins:
        for j in range(coin, amount + 1):
            dp[j] += dp[j - coin]
    
    return dp[amount]

# Given coin denominations
coins = [1, 2, 5]
amount = 5

# Print the number of ways to make change
print("Ways to make change:", count_ways(coins, amount))

"""
Output:
Ways to make change: 4

Explanation:
For amount = 5 with coins {1, 2, 5}, the possible ways are:
1. {1,1,1,1,1}
2. {1,1,1,2}
3. {1,2,2}
4. {5}
Thus, the result is 4.
"""
