// Explanation:
// This Java program calculates the number of ways to climb n stairs using Dynamic Programming.
// We use an array dp[] where dp[i] stores the number of ways to reach the i-th step.
// The recurrence relation is dp[i] = dp[i-1] + dp[i-2], similar to the Fibonacci sequence.

class script {
    public static int climbStairs(int n) {
        if (n <= 1) return 1;
        
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Number of ways to climb " + n + " stairs: " + climbStairs(n));
    }
}

/*
Output:
Number of ways to climb 5 stairs: 8

Explanation:
The number of ways to climb 5 stairs is calculated as:
dp[5] = dp[4] + dp[3] => 5 + 3 = 8
where dp[4] = 5 and dp[3] = 3.
*/
