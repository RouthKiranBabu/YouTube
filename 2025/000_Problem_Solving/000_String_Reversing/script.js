function revString(str) {
  if (str === null || str === undefined || str.length === 0) {
    return str;
  }

  const chars = Array.from(str);
  let left = 0;
  let right = chars.length - 1;

  while (left < right) {
    const temp = chars[left];
    chars[left] = chars[right];
    chars[right] = temp;
    left++;
    right--;
  }

  return chars.join("");
}

const str = "hello world!";
const rev = revString(str);
console.log(rev);

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
