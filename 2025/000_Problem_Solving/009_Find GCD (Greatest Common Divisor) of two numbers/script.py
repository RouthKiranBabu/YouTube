def find_gcd(a, b):
    while b:
        a, b = b, a % b
    return a

num1, num2 = 56, 98
print(f"GCD of {num1} and {num2} is: {find_gcd(num1, num2)}") 
# GCD of 56 and 98 is: 14
