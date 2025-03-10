function reverseWords(sentence) {
    return sentence.split(" ").reverse().join(" ");
}

let sentence = "I love programming";
console.log(reverseWords(sentence)); // Output: "programming love I"
