/*
 * This JavaScript program generates all permutations of a given string.
 * It uses recursion, swapping characters to create different orders.
 */

class script {
    static permute(str, prefix = "", results = []) {
        if (str.length === 0) {
            results.push(prefix);
        } else {
            for (let i = 0; i < str.length; i++) {
                let remaining = str.slice(0, i) + str.slice(i + 1);
                script.permute(remaining, prefix + str[i], results);
            }
        }
        return results;
    }
}

// Example usage
let input = "abc";
let result = script.permute(input);
console.log("Permutations of", input, ":", result);

/*
 * Output:
 * Permutations of abc : [ 'abc', 'acb', 'bac', 'bca', 'cab', 'cba' ]
 *
 * Explanation:
 * - The function recursively selects a character as a prefix and finds permutations of the remaining characters.
 * - When the input string becomes empty, the formed permutation is added to the results array.
 * - Finally, all permutations are printed.
 */
