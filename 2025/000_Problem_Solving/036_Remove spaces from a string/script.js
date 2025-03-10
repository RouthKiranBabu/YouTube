let input = "Hello World, Welcome to Programming!";
let output = input.replace(/\s/g, ""); // Remove all spaces
console.log("Output:", output);
/*Explanation:
The .replace(/\s/g, "") function uses a regular expression where:
\s matches all whitespace characters.
g is a global flag that replaces all occurrences.
The modified string is printed to the console.*/