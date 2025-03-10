/*The first non-repeating character in a string is the first character that appears only once in the string when traversed from left to right.

Explanation
We traverse the string and count occurrences of each character using:

A LinkedHashMap in Java (to maintain insertion order).
A Map in JavaScript.
A dictionary {} in Python.
We iterate over the string again and find the first character that appears only once.

If all characters are repeated, we return '_'.

Final Thoughts
This algorithm ensures that we efficiently find the first non-repeating character in a string in O(n) time complexity, where n is the length of the string.
*/
import java.util.LinkedHashMap;
import java.util.Map;

public class script {
    public static char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with count 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '_'; // Return '_' if no non-repeating character exists
    }

    public static void main(String[] args) {
        String input = "swiss";
        System.out.println("First Non-Repeating Character: " + findFirstNonRepeatingChar(input));
    }
}

/*Example Input/Output
Input: "swiss"
Output: 'w'

*/