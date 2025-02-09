// Function to calculate GCD (Greatest Common Divisor)
function gcd(a, b) {
    while (b !== 0) {
        let temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

// Function to calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
function lcm(a, b) {
    return (a * b) / gcd(a, b);
}

// Example usage
let num1 = 12, num2 = 18;
console.log(`LCM of ${num1} and ${num2} is: ${lcm(num1, num2)}`);
// LCM of 12 and 18 is: 36
