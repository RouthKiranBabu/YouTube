// Word Break Problem using Dynamic Programming

function wordBreak(s, wordDict) {
    // Convert wordDict to a Set for fast lookup
    let wordSet = new Set(wordDict);
    
    // DP array to store results
    let dp = new Array(s.length + 1).fill(false);
    
    // Base case: empty string is always valid
    dp[0] = true;

    // Iterate through the string
    for (let i = 1; i <= s.length; i++) {
        for (let j = 0; j < i; j++) {
            if (dp[j] && wordSet.has(s.substring(j, i))) {
                dp[i] = true;
                break;
            }
        }
    }
    
    return dp[s.length];
}

// Example usage
let s = "leetcode";
let wordDict = ["leet", "code"];

console.log(wordBreak(s, wordDict)); // Output: true

// Explanation:
// dp[4] (for "leet") -> True
// dp[8] (for "leetcode") -> True
