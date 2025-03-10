// Java program to find the number of ways to make change for a given amount
// using dynamic programming (Coin Change Problem - Unbounded Knapsack variation).

// The class name should be 'script' as per the requirement.
public class script {
    // Function to compute the number of ways to make change
    public static int countWays(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount + 1];

        // Base case: There's 1 way to make change for amount 0 (by using no coins)
        dp[0] = 1;

        // Process each coin and update the dp array
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                dp[j] += dp[j - coin];
            }
        }
        return dp[amount];
    }

    // Main function to test the implementation
    public static void main(String[] args) {
        int[] coins = {1, 2, 5}; // Available coin denominations
        int amount = 5; // Target amount

        // Print the number of ways to make change
        System.out.println("Ways to make change: " + countWays(coins, amount));
    }
}

/*
Output:
Ways to make change: 4

Explanation:
For amount = 5 with coins {1, 2, 5}, the possible ways are:
1. {1,1,1,1,1}
2. {1,1,1,2}
3. {1,2,2}
4. {5}
Thus, the result is 4.
*/
