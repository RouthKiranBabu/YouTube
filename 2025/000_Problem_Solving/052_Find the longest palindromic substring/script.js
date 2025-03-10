/*
 * This JavaScript program finds the longest palindromic substring.
 * It uses the expand-around-center approach, checking each character
 * and each pair of characters as the center of a possible palindrome.
 */

class script {
    static longestPalindrome(s) {
        if (!s || s.length < 1) return "";
        let start = 0, end = 0;

        function expandAroundCenter(left, right) {
            while (left >= 0 && right < s.length && s[left] === s[right]) {
                left--;
                right++;
            }
            return right - left - 1;
        }

        for (let i = 0; i < s.length; i++) {
            let len1 = expandAroundCenter(i, i);      // Odd length palindrome
            let len2 = expandAroundCenter(i, i + 1);  // Even length palindrome
            let len = Math.max(len1, len2);

            if (len > (end - start)) {
                start = i - Math.floor((len - 1) / 2);
                end = i + Math.floor(len / 2);
            }
        }
        return s.substring(start, end + 1);
    }
}

// Example usage
let str = "babad";
console.log("Longest Palindromic Substring:", script.longestPalindrome(str));

/*
 * Output:
 * Longest Palindromic Substring: aba  (or "bab", since both are valid)
 *
 * Explanation:
 * The function iterates through the string, expanding around each center.
 * It keeps track of the longest palindrome found.
 */
