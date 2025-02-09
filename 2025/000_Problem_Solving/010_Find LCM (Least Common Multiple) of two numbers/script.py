import math

# Function to calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
def lcm(a, b):
    return (a * b) // math.gcd(a, b)

# Example usage
num1, num2 = 12, 18
print(f"LCM of {num1} and {num2} is: {lcm(num1, num2)}")
# LCM of 12 and 18 is: 36