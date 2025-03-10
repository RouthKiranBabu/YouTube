function findFirstNonRepeatingChar(str) {
    let charCount = new Map();

    // Count occurrences of each character
    for (let char of str) {
        charCount.set(char, (charCount.get(char) || 0) + 1);
    }

    // Find the first character with count 1
    for (let char of str) {
        if (charCount.get(char) === 1) {
            return char;
        }
    }

    return '_'; // Return '_' if no non-repeating character exists
}

let input = "swiss";
console.log("First Non-Repeating Character:", findFirstNonRepeatingChar(input));

/*Example Input/Output
Input: "swiss"
Output: 'w'*/