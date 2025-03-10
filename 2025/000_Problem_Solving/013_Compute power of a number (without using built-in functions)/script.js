function power(base, exponent) {
    let result = 1;
    let isNegative = exponent < 0;
    exponent = Math.abs(exponent);

    for (let i = 0; i < exponent; i++) {
        result *= base;
    }

    return isNegative ? 1 / result : result;
}

// Example usage
let base = 2;
let exponent = -3;
console.log(`${base}^${exponent} = ${power(base, exponent)}`);
/*Input:
plaintext
Copy
Edit
Base = 2, Exponent = -3
Output:
plaintext
Copy
Edit
2^-3 = 0.125
Explanation:
The function multiplies base exponent times and inverts the result if the exponent is negative.*/