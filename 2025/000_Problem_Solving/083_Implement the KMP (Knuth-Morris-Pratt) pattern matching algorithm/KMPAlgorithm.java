// KMP Algorithm for Pattern Matching in Java

// Problem Statement:
// Given a text and a pattern, find all occurrences of the pattern in the text using the KMP algorithm.
// The KMP algorithm preprocesses the pattern to create an LPS (Longest Prefix Suffix) array,
// which helps in avoiding redundant comparisons during the search.

import java.util.ArrayList;
import java.util.List;

public class KMPAlgorithm {
    // Function to preprocess the pattern and create the LPS array
    public static int[] computeLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m]; // Initialize LPS array
        int j = 0; // Length of previous longest prefix suffix

        for (int i = 1; i < m; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = lps[j - 1]; // Fall back in pattern
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
                lps[i] = j; // Store the length in LPS array
            }
        }
        return lps;
    }

    // Function to perform the KMP search algorithm
    public static List<Integer> kmpSearch(String text, String pattern) {
        int n = text.length(), m = pattern.length();
        int[] lps = computeLPS(pattern); // Compute LPS array
        int j = 0; // Index for pattern
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            while (j > 0 && text.charAt(i) != pattern.charAt(j)) {
                j = lps[j - 1]; // Fall back in pattern
            }
            if (text.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            if (j == m) { // Pattern found
                result.add(i - m + 1);
                j = lps[j - 1]; // Continue searching for more occurrences
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "ababcababcabc";
        String pattern = "abc";
        System.out.println("Pattern found at indices: " + kmpSearch(text, pattern));
    }
}

// Expected Output:
// Pattern found at indices: [2, 7, 10]

/*
Explanation:
1. The pattern 'abc' appears at indices 2, 7, and 10 in the text.
2. The LPS array helps in avoiding unnecessary comparisons, making the search efficient.
3. Time Complexity: O(n + m), where n is the length of the text and m is the length of the pattern.
*/
