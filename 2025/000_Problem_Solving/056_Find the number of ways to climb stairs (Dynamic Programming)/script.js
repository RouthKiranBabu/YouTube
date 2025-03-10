// Explanation:
// This JavaScript function uses Dynamic Programming to compute the number of ways to climb stairs.
// We maintain an array dp[], where dp[i] stores the number of ways to reach the i-th step.
// The relation used is dp[i] = dp[i-1] + dp[i-2].

class script {
    static climbStairs(n) {
        if (n <= 1) return 1;
        
        let dp = new Array(n + 1).fill(0);
        dp[0] = 1;
        dp[1] = 1;
        
        for (let i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}

let n = 5; // Example input
console.log("Number of ways to climb " + n + " stairs: " + script.climbStairs(n));

/*
Output:
Number of ways to climb 5 stairs: 8

Explanation:
The number of ways to climb 5 stairs follows:
dp[5] = dp[4] + dp[3] => 5 + 3 = 8
where dp[4] = 5 and dp[3] = 3.
*/
