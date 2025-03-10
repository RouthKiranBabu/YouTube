def contains_only_digits(s):
    return s.isdigit()

print(contains_only_digits("123456"))  # Output: True
print(contains_only_digits("abc123"))  # Output: False

"""Explanation (Python)
The .isdigit() method in Python directly checks if a string consists only of digits.
It returns True if all characters are digits, else False.
Summary
Java: Used matches("\\d+") with regex to check for digits.
JavaScript: Used regex /^\d+$/ with test() to validate the string.
Python: Used .isdigit() method, which is a built-in function for this check.
All three solutions effectively check if a string contains only digits using different approaches suited to each language. 🚀"""