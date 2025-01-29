function reverseString(str) {
    return str.split('').reverse().join('');
}

console.log(reverseString("hello")); // Output: "olleh"

function reverseString(str) {
    let reversed = "";
    for (let char of str) {
        reversed = char + reversed;
    }
    return reversed;
}

console.log(reverseString("hello")); // Output: "olleh"

function reverseString(str) {
    return str === "" ? "" : reverseString(str.substr(1)) + str[0];
}

console.log(reverseString("hello")); // Output: "olleh"
