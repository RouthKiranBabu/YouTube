function isPrime(n) {
    if (n < 2) return false;
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) return false;
    }
    return true;
}

// Example usage
let num = 29;
console.log(`${num} is prime: ${isPrime(num)}`);
