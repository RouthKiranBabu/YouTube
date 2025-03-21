// Boyer-Moore String Search Algorithm in JavaScript
// -------------------------------------------------
// This algorithm efficiently searches for a pattern in a text using precomputed shift tables.

function badCharacterHeuristic(pattern) {
    let badChar = new Array(256).fill(-1);

    for (let i = 0; i < pattern.length; i++) {
        badChar[pattern.charCodeAt(i)] = i;  // Store last occurrence
    }
    return badChar;
}

function boyerMooreSearch(text, pattern) {
    let m = pattern.length;
    let n = text.length;
    let badChar = badCharacterHeuristic(pattern);

    let shift = 0;
    let results = [];

    while (shift <= n - m) {
        let j = m - 1;

        // Compare characters from right to left
        while (j >= 0 && pattern[j] === text[shift + j]) {
            j--;
        }

        if (j < 0) {
            results.push(shift);
            shift += (shift + m < n) ? (m - badChar[text.charCodeAt(shift + m)]) : 1;
        } else {
            shift += Math.max(1, j - badChar[text.charCodeAt(shift + j)]);
        }
    }

    return results;
}

// Example usage:
let text = "ABAAABCD";
let pattern = "ABC";
let matches = boyerMooreSearch(text, pattern);

console.log("Pattern found at indices:", matches);

/*
Output:
Pattern found at indices: [4]
*/

// Explanation:
// 1. The function builds the bad character heuristic table for quick shifts.
// 2. It then slides the pattern over the text and compares from right to left.
// 3. If a mismatch occurs, it shifts based on the last seen position of the mismatched character.
// 4. This results in an optimized search process.
