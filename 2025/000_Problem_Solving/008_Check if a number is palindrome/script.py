def is_palindrome(num):
    return str(num) == str(num)[::-1]

num = 121
print(f"{num} is palindrome? {is_palindrome(num)}")
