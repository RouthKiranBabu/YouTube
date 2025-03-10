def power(base, exponent):
    result = 1
    is_negative = exponent < 0
    exponent = abs(exponent)

    for _ in range(exponent):
        result *= base

    return 1 / result if is_negative else result

# Example usage
base = 2
exponent = -3
print(f"{base}^{exponent} = {power(base, exponent)}")
"""Example:
Input:
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
The function repeatedly multiplies base by itself for exponent times. If exponent is negative, the function returns the reciprocal."""