def reverse_integer(x):
    sign = -1 if x < 0 else 1
    rev = int(str(abs(x))[::-1]) * sign

    # Check for 32-bit integer overflow
    if rev < -2**31 or rev > 2**31 - 1:
        return 0
    return rev

print(reverse_integer(123))   # Output: 321
print(reverse_integer(-456))  # Output: -654
print(reverse_integer(1534236469)) # Output: 0 (overflow)
