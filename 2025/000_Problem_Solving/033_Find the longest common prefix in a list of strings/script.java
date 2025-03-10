/*Problem Explanation
The Longest Common Prefix (LCP) problem involves finding the longest prefix shared by all strings in a given list.

Example Cases:
Input: ["flower", "flow", "flight"]
Output: "fl"
Input: ["dog", "racecar", "car"]
Output: "" (No common prefix)
Approach to Solve:
Compare the characters of each string one by one.
Stop when a mismatch is found or one string ends.
Return the common prefix.*/
public class script {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0]; // Start with first string as prefix

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // Keep trimming prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(words));
    }
}
/*Explanation:
Start with the first string as the prefix.
Compare with each string, shortening the prefix until a match is found.
If the prefix becomes empty, return "".*/