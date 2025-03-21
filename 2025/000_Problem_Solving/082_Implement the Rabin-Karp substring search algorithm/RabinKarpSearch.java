// Problem: Implement the Rabin-Karp substring search algorithm
// Theory:
// The Rabin-Karp algorithm uses hashing to efficiently search for a pattern in a text.
// It slides a window over the text and calculates the hash of the current substring.
// If the hash matches the pattern's hash, a direct comparison is performed.

// Approach:
// 1. Compute the hash value of the pattern.
// 2. Compute the hash value of the first window in the text.
// 3. Slide the window, update the hash, and compare with the pattern’s hash.
// 4. If a hash match occurs, verify the substring manually.

class RabinKarpSearch {
    final static int d = 256; // Number of characters in the input alphabet
    final static int prime = 101; // Prime number to reduce collisions

    static void rabinKarp(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();
        int patternHash = 0;
        int textHash = 0;
        int h = 1;

        // Compute h = d^(m-1) % prime
        for (int i = 0; i < m - 1; i++)
            h = (h * d) % prime;

        // Compute the initial hash values
        for (int i = 0; i < m; i++) {
            patternHash = (d * patternHash + pattern.charAt(i)) % prime;
            textHash = (d * textHash + text.charAt(i)) % prime;
        }

        // Slide the pattern over text
        for (int i = 0; i <= n - m; i++) {
            // Check if the hash values match
            if (patternHash == textHash) {
                if (text.substring(i, i + m).equals(pattern))
                    System.out.println("Pattern found at index " + i);
            }

            // Compute the hash for the next window
            if (i < n - m) {
                textHash = (d * (textHash - text.charAt(i) * h) + text.charAt(i + m)) % prime;
                if (textHash < 0)
                    textHash += prime;
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";
        rabinKarp(text, pattern);
    }
}

// Output:
// Pattern found at index 10
