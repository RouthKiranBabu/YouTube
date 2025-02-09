function sumDigits(num) {
    let sum = 0;
    while (num !== 0) {
        sum += num % 10; // Get last digit and add to sum
        num = Math.floor(num / 10); // Remove last digit
    }
    return sum;
}

let num = 12345; // Example input
console.log("Sum of digits:", sumDigits(num));
