function hasUniqueChars(str) {
    let charSet = new Set();
    for (let ch of str) {
        if (charSet.has(ch)) {
            return false;
        }
        charSet.add(ch);
    }
    return true;
}

console.log("Input: 'abcdef'");
console.log("All unique characters? " + hasUniqueChars("abcdef"));

console.log("Input: 'hello'");
console.log("All unique characters? " + hasUniqueChars("hello"));

/*Input: 'abcdef'
All unique characters? true
Input: 'hello'
All unique characters? false
*/