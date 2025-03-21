/*
Problem: Implement the Fast Fourier Transform (FFT)
Theory:
FFT optimizes the DFT computation from O(n^2) to O(n log n) using recursion and divide-and-conquer.
The signal is divided into even and odd parts, transformed separately, and then recombined.

Approach:
1. Base case: If size is 1, return the array.
2. Recursively compute FFT for even and odd indices.
3. Combine results using complex exponentials.

Input: Array of complex numbers
Output: Transformed frequency-domain representation
*/

function Complex(real, imag) {
    this.real = real;
    this.imag = imag;
}

Complex.prototype.add = function (b) {
    return new Complex(this.real + b.real, this.imag + b.imag);
};

Complex.prototype.subtract = function (b) {
    return new Complex(this.real - b.real, this.imag - b.imag);
};

Complex.prototype.multiply = function (b) {
    return new Complex(
        this.real * b.real - this.imag * b.imag,
        this.real * b.imag + this.imag * b.real
    );
};

function fft(arr) {
    let n = arr.length;
    if (n === 1) return arr;

    // Split into even and odd parts
    let even = fft(arr.filter((_, i) => i % 2 === 0));
    let odd = fft(arr.filter((_, i) => i % 2 !== 0));

    let result = new Array(n);
    for (let k = 0; k < n / 2; k++) {
        let angle = (-2 * Math.PI * k) / n;
        let wk = new Complex(Math.cos(angle), Math.sin(angle)).multiply(odd[k]);
        result[k] = even[k].add(wk);
        result[k + n / 2] = even[k].subtract(wk);
    }
    return result;
}

// Example usage
let input = [new Complex(1, 0), new Complex(2, 0), new Complex(3, 0), new Complex(4, 0)];
let output = fft(input);
console.log("FFT Output:", output.map(c => `(${c.real.toFixed(2)} + ${c.imag.toFixed(2)}i)`));

/*
Output:
FFT Output: ["(10.00 + 0.00i)", "(-2.00 + 2.00i)", "(-2.00 + 0.00i)", "(-2.00 - 2.00i)"]

Explanation:
- The input is transformed into frequency components.
- The real and imaginary parts represent magnitude and phase.
*/
