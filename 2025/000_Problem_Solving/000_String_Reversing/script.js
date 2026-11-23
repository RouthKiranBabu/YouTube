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

function reverseString(str) {
    return str.split('').reverse().join('');
}

console.log(reverseString("hello")); // Output: "olleh"

function reverseString(str) {
    let reversed = "";
    for (let char of str) {
        reversed = char + reversed;
    }
    return reversed;
}

console.log(reverseString("hello")); // Output: "olleh"

function reverseString(str) {
    return str === "" ? "" : reverseString(str.substr(1)) + str[0];
}

console.log(reverseString("hello")); // Output: "olleh"
