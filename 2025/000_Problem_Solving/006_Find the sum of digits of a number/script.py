def sum_digits(num):
    sum = 0
    while num != 0:
        sum += num % 10  # Get last digit and add to sum
        num //= 10       # Remove last digit
    return sum

num = 12345  # Example input
print("Sum of digits:", sum_digits(num))
