function reverseInteger(x) {
    let rev = 0;
    let sign = x < 0 ? -1 : 1;
    x = Math.abs(x);

    while (x !== 0) {
        let digit = x % 10;
        x = Math.floor(x / 10);

        // Check for overflow
        if (rev > Math.floor(2147483647 / 10) || (rev === Math.floor(2147483647 / 10) && digit > 7)) return 0;

        rev = rev * 10 + digit;
    }

    return rev * sign;
}

console.log(reverseInteger(123));   // Output: 321
console.log(reverseInteger(-456));  // Output: -654
console.log(reverseInteger(1534236469)); // Output: 0 (overflow)
