/*
Problem: Implement the Fast Fourier Transform (FFT)
Theory:
FFT is an optimized way to compute the Discrete Fourier Transform (DFT) in O(n log n) time.
It divides the problem into smaller subproblems (even-indexed and odd-indexed elements).
The results are combined using complex exponential terms.

Approach:
1. Base case: If size is 1, return the array.
2. Recursively compute FFT for even and odd parts.
3. Combine results using the formula:
   X[k] = E[k] + W^k * O[k]
   X[k + n/2] = E[k] - W^k * O[k]

Input: Array of complex numbers
Output: Transformed frequency-domain representation
*/

import java.util.Arrays;

class Complex {
    double real, imag;

    Complex(double r, double i) {
        this.real = r;
        this.imag = i;
    }

    Complex add(Complex b) {
        return new Complex(this.real + b.real, this.imag + b.imag);
    }

    Complex subtract(Complex b) {
        return new Complex(this.real - b.real, this.imag - b.imag);
    }

    Complex multiply(Complex b) {
        return new Complex(this.real * b.real - this.imag * b.imag, this.real * b.imag + this.imag * b.real);
    }

    public String toString() {
        return String.format("(%.2f + %.2fi)", real, imag);
    }
}

public class FFT {
    public static void fft(Complex[] arr) {
        int n = arr.length;
        if (n <= 1) return;

        // Split into even and odd parts
        Complex[] even = new Complex[n / 2];
        Complex[] odd = new Complex[n / 2];

        for (int i = 0; i < n / 2; i++) {
            even[i] = arr[i * 2];
            odd[i] = arr[i * 2 + 1];
        }

        // Recursive FFT calls
        fft(even);
        fft(odd);

        // Combine results
        for (int k = 0; k < n / 2; k++) {
            double angle = -2 * Math.PI * k / n;
            Complex w = new Complex(Math.cos(angle), Math.sin(angle));
            Complex t = w.multiply(odd[k]);
            arr[k] = even[k].add(t);
            arr[k + n / 2] = even[k].subtract(t);
        }
    }

    public static void main(String[] args) {
        Complex[] input = { new Complex(1, 0), new Complex(2, 0), new Complex(3, 0), new Complex(4, 0) };
        fft(input);
        System.out.println("FFT Output: " + Arrays.toString(input));
    }
}

/*
Output:
FFT Output: [(10.00 + 0.00i), (-2.00 + 2.00i), (-2.00 + 0.00i), (-2.00 - 2.00i)]

Explanation:
- The input is transformed into its frequency-domain representation.
- Each value represents a frequency component.
*/
