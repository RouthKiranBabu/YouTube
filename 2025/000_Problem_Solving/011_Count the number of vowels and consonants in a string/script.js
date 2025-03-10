function countVowelsAndConsonants(str) {
    str = str.toLowerCase(); // Convert to lowercase
    let vowels = 0, consonants = 0;
    let vowelsSet = new Set(['a', 'e', 'i', 'o', 'u']);

    for (let char of str) {
        if (/[a-z]/.test(char)) { // Check if it's a letter
            if (vowelsSet.has(char)) {
                vowels++;
            } else {
                consonants++;
            }
        }
    }

    console.log("Input:", str);
    console.log("Vowels:", vowels);
    console.log("Consonants:", consonants);
}

// Example usage
countVowelsAndConsonants("Hello World");

/*Output
Input: hello world
Vowels: 3
Consonants: 7

Explanation
Convert the input to lowercase.
Iterate through the characters and check if they are letters.
Use a Set to store vowels for quick lookup.
Count vowels and consonants accordingly.*/