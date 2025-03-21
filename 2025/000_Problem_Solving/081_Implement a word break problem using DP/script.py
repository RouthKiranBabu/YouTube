# Word Break Problem using Dynamic Programming

# Function to determine if a word can be segmented
def word_break(s, word_dict):
    # Convert wordDict to a set for quick lookup
    word_set = set(word_dict)
    
    # dp[i] represents whether substring s[0:i] can be segmented
    dp = [False] * (len(s) + 1)
    
    # Base case: empty string is always valid
    dp[0] = True  

    # Iterate through the string
    for i in range(1, len(s) + 1):
        for j in range(i):
            # Check if s[j:i] is a word and dp[j] is True
            if dp[j] and s[j:i] in word_set:
                dp[i] = True
                break
    
    return dp[len(s)]

# Example usage
s = "leetcode"
wordDict = ["leet", "code"]
print(word_break(s, wordDict))  # Output: True

# Explanation:
# dp[4] (for "leet") -> True
# dp[8] (for "leetcode") -> True
