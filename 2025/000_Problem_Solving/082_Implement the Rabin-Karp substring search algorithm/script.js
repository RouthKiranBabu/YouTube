// Problem: Implement the Rabin-Karp substring search algorithm
// Theory:
// Rabin-Karp is a string searching algorithm that uses hashing to find a pattern in a text.
// Instead of checking every substring, it compares hash values to speed up the search process.

// Approach:
// 1. Compute the hash value of the pattern.
// 2. Compute the hash value of the first substring of the text.
// 3. Slide the window across the text, updating the hash and checking for a match.
// 4. If a hash match occurs, confirm by checking characters manually.

function rabinKarp(text, pattern, prime = 101) {
    let n = text.length;
    let m = pattern.length;
    let base = 256; // Total number of characters in input set
    let patternHash = 0;
    let textHash = 0;
    let h = 1;

    // Compute the value of base^(m-1) % prime
    for (let i = 0; i < m - 1; i++)
        h = (h * base) % prime;

    // Compute the initial hash values
    for (let i = 0; i < m; i++) {
        patternHash = (base * patternHash + pattern.charCodeAt(i)) % prime;
        textHash = (base * textHash + text.charCodeAt(i)) % prime;
    }

    // Slide the pattern over text
    for (let i = 0; i <= n - m; i++) {
        // Check if hash values match
        if (patternHash === textHash) {
            if (text.substring(i, i + m) === pattern)
                console.log(`Pattern found at index ${i}`);
        }

        // Compute the hash for the next window
        if (i < n - m) {
            textHash = (base * (textHash - text.charCodeAt(i) * h) + text.charCodeAt(i + m)) % prime;
            if (textHash < 0)
                textHash += prime;
        }
    }
}

// Example Usage:
let text = "ABABDABACDABABCABAB";
let pattern = "ABABCABAB";
rabinKarp(text, pattern);

// Output:
// Pattern found at index 10
