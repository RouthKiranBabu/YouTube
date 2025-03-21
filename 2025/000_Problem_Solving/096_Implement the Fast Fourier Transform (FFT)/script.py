"""
Problem: Implement the Fast Fourier Transform (FFT)
Theory:
The FFT is an efficient algorithm to compute the Discrete Fourier Transform (DFT).
DFT converts a sequence of complex numbers (or real numbers) into frequency components.
Time complexity of naive DFT: O(n^2), but FFT reduces it to O(n log n) using the divide-and-conquer approach.

Approach:
- If the input size is 1, return the input as it is.
- Otherwise, recursively apply FFT on even-indexed and odd-indexed elements.
- Combine the results using the formula:
  X[k] = E[k] + W^k * O[k]
  X[k + n/2] = E[k] - W^k * O[k]
  where W^k is a complex exponential term.

Input: A list of complex numbers.
Output: The FFT-transformed list.
"""

import cmath  # Library for complex numbers

def fft(arr):
    n = len(arr)
    if n == 1:
        return arr

    # Split into even and odd parts
    even_part = fft(arr[0::2])
    odd_part = fft(arr[1::2])

    # Compute FFT using the divide-and-conquer approach
    factor = [cmath.exp(-2j * cmath.pi * k / n) * odd_part[k] for k in range(n // 2)]
    return [even_part[k] + factor[k] for k in range(n // 2)] + \
           [even_part[k] - factor[k] for k in range(n // 2)]

# Example usage:
input_data = [complex(1, 0), complex(2, 0), complex(3, 0), complex(4, 0)]
output_data = fft(input_data)

# Printing output
print("FFT Output:", output_data)

"""
Output:
FFT Output: [(10+0j), (-2+2j), (-2+0j), (-2-2j)]

Explanation:
- The input is transformed from the time domain to the frequency domain.
- The output represents frequency components, including magnitude and phase.
"""
