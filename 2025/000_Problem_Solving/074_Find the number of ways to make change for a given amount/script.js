// JavaScript program to find the number of ways to make change for a given amount
// using dynamic programming.

function countWays(coins, amount) {
    let dp = new Array(amount + 1).fill(0);

    // Base case: There's 1 way to make change for amount 0 (by using no coins)
    dp[0] = 1;

    // Process each coin and update dp array
    for (let coin of coins) {
        for (let j = coin; j <= amount; j++) {
            dp[j] += dp[j - coin];
        }
    }
    
    return dp[amount];
}

// Given coin denominations
let coins = [1, 2, 5];
let amount = 5;

// Print the number of ways to make change
console.log("Ways to make change:", countWays(coins, amount));

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
