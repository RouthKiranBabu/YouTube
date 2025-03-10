/*
    This Java program finds the longest substring without repeating characters.
    - We use the sliding window technique with a HashSet.
    - The `left` pointer moves when a duplicate is found.
    - The `right` pointer expands the window while adding unique characters.

    Time Complexity: O(n)
    Space Complexity: O(n)
*/

import java.util.HashSet;

public class script {
    public static int longestUniqueSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = longestUniqueSubstring(input);
        System.out.println("Longest substring length: " + result);
    }
}

/*
    Output:
    Longest substring length: 3

    Explanation:
    - The longest substring without repeating characters in "abcabcbb" is "abc" with a length of 3.
*/
