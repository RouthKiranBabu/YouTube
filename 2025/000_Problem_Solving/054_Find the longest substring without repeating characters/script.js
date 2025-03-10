/*
    This JavaScript function finds the longest substring without repeating characters.
    - We use a sliding window approach with a Set to track characters.
    - The `left` pointer moves ahead when duplicates are found.
    - The `right` pointer expands the window to check unique characters.

    Time Complexity: O(n)
    Space Complexity: O(n)
*/

class script {
    static longestUniqueSubstring(s) {
        let set = new Set();
        let left = 0, maxLength = 0;

        for (let right = 0; right < s.length; right++) {
            while (set.has(s[right])) {
                set.delete(s[left]);
                left++;
            }
            set.add(s[right]);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

// Test case
let input = "abcabcbb";
let result = script.longestUniqueSubstring(input);
console.log("Longest substring length:", result);

/*
    Output:
    Longest substring length: 3

    Explanation:
    - The longest substring without repeating characters in "abcabcbb" is "abc" with a length of 3.
*/
