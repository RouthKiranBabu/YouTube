import java.util.*;

public class WordBreakDP {
    // Function to check if the string can be segmented
    public static boolean wordBreak(String s, List<String> wordDict) {
        // Convert list to set for faster lookup
        Set<String> wordSet = new HashSet<>(wordDict);
        
        // DP array to store results
        boolean[] dp = new boolean[s.length() + 1];
        
        // Base case: Empty string is always valid
        dp[0] = true;

        // Fill DP table
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");

        System.out.println(wordBreak(s, wordDict)); // Output: true

        // Explanation:
        // dp[4] (for "leet") -> True
        // dp[8] (for "leetcode") -> True
    }
}
