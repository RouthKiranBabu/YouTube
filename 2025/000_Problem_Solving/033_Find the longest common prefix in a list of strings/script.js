function longestCommonPrefix(strs) {
    if (!strs.length) return "";

    let prefix = strs[0];

    for (let i = 1; i < strs.length; i++) {
        while (strs[i].indexOf(prefix) !== 0) {
            prefix = prefix.slice(0, -1);
            if (prefix === "") return "";
        }
    }
    return prefix;
}

// Example usage
let words = ["flower", "flow", "flight"];
console.log("Longest Common Prefix:", longestCommonPrefix(words));
/*Explanation:
Initialize prefix with the first string.
Trim the prefix while it’s not a substring at the start.
If the prefix becomes empty, return "".
*/