function isPalindrome(num) {
    let original = num.toString();
    let reversed = original.split('').reverse().join('');
    return original === reversed;
}

let num = 121;
console.log(`${num} is palindrome? ${isPalindrome(num)}`);
