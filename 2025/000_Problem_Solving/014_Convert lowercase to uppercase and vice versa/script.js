function swapCase(str) {
    let result = "";
    for (let char of str) {
        if (char === char.toUpperCase()) {
            result += char.toLowerCase();
        } else {
            result += char.toUpperCase();
        }
    }
    return result;
}

// Example usage
let input = "Hello WoRLd";
console.log("Input:", input);
console.log("Output:", swapCase(input));
