// Boyer-Moore String Search Algorithm in Java
// -------------------------------------------
// The Boyer-Moore algorithm optimizes search by skipping sections using precomputed heuristics.
// It is efficient for large texts as it minimizes character comparisons.

import java.util.Arrays;

public class BoyerMooreSearch {

    static int ALPHABET_SIZE = 256;

    // Preprocesses the pattern to build the bad character table
    public static int[] badCharacterHeuristic(String pattern) {
        int[] badChar = new int[ALPHABET_SIZE];
        Arrays.fill(badChar, -1);

        for (int i = 0; i < pattern.length(); i++) {
            badChar[pattern.charAt(i)] = i;  // Store last occurrence
        }
        return badChar;
    }

    // Performs Boyer-Moore string search
    public static void boyerMooreSearch(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();
        int[] badChar = badCharacterHeuristic(pattern);

        int shift = 0;

        while (shift <= (n - m)) {
            int j = m - 1;

            // Check from right to left
            while (j >= 0 && pattern.charAt(j) == text.charAt(shift + j)) {
                j--;
            }

            if (j < 0) {
                System.out.println("Pattern found at index: " + shift);
                shift += (shift + m < n) ? (m - badChar[text.charAt(shift + m)]) : 1;
            } else {
                shift += Math.max(1, j - badChar[text.charAt(shift + j)]);
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABAAABCD";
        String pattern = "ABC";

        boyerMooreSearch(text, pattern);
    }
}

/*
Output:
Pattern found at index: 4
*/

// Explanation:
// 1. The pattern is preprocessed using the bad character heuristic, storing last occurrences.
// 2. The search starts from the rightmost character of the pattern.
// 3. If a mismatch occurs, the pattern shifts according to the precomputed table.
// 4. The process repeats until the entire text is scanned.
