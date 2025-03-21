// KMP Algorithm for Pattern Matching in JavaScript

// Problem Statement:
// Given a text and a pattern, find all occurrences of the pattern in the text using the KMP algorithm.
// The KMP algorithm preprocesses the pattern to create an LPS (Longest Prefix Suffix) array,
// which helps in avoiding redundant comparisons during the search.

// Function to preprocess the pattern and create the LPS array
function computeLPS(pattern) {
    let m = pattern.length;
    let lps = Array(m).fill(0);
    let j = 0; // Length of previous longest prefix suffix

    for (let i = 1; i < m; i++) {
        while (j > 0 && pattern[i] !== pattern[j]) {
            j = lps[j - 1]; // Fall back in pattern
        }
        if (pattern[i] === pattern[j]) {
            j++;
            lps[i] = j; // Store the length in LPS array
        }
    }
    return lps;
}

// Function to perform the KMP search algorithm
function kmpSearch(text, pattern) {
    let n = text.length, m = pattern.length;
    let lps = computeLPS(pattern); // Compute LPS array
    let j = 0; // Index for pattern
    let result = [];

    for (let i = 0; i < n; i++) {
        while (j > 0 && text[i] !== pattern[j]) {
            j = lps[j - 1]; // Fall back in pattern
        }
        if (text[i] === pattern[j]) {
            j++;
        }
        if (j === m) { // Pattern found
            result.push(i - m + 1);
            j = lps[j - 1]; // Continue searching for more occurrences
        }
    }
    return result;
}

// Example Usage
let text = "ababcababcabc";
let pattern = "abc";
console.log("Pattern found at indices:", kmpSearch(text, pattern));

// Expected Output:
// Pattern found at indices: [2, 7, 10]

/*
Explanation:
1. The pattern 'abc' appears at indices 2, 7, and 10 in the text.
2. The LPS array helps in avoiding unnecessary comparisons, making the search efficient.
3. Time Complexity: O(n + m), where n is the length of the text and m is the length of the pattern.
*/
