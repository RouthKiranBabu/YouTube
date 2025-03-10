function containsOnlyDigits(str) {
    return /^\d+$/.test(str);
}

console.log(containsOnlyDigits("123456")); // Output: true
console.log(containsOnlyDigits("abc123")); // Output: false
/*Explanation (JavaScript)
The function uses the test() method of a regular expression (/^\d+$/).
^ ensures the pattern starts at the beginning of the string.
\d+ ensures the presence of only digits.
$ ensures the pattern ends at the end of the string.
If the input matches the pattern, it returns true; otherwise, false.*/