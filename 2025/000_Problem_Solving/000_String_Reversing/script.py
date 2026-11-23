def rev_string(s: str | None) -> str | None:
    if s is None or len(s) == 0:
        return s

    chars = list(s)
    left = 0
    right = len(chars) - 1

    while left < right:
        chars[left], chars[right] = chars[right], chars[left]
        left += 1
        right -= 1

    return "".join(chars)


if __name__ == "__main__":
    text = "hello world!"
    rev = rev_string(text)
    print(rev)

def reverse_string(s):
    return s[::-1]

print(reverse_string("hello"))  # Output: "olleh"

def reverse_string(s):
    return ''.join(reversed(s))

print(reverse_string("hello"))  # Output: "olleh"

def reverse_string(s):
    result = ""
    for char in s:
        result = char + result
    return result

print(reverse_string("hello"))  # Output: "olleh"
