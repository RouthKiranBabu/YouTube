def count_vowels_and_consonants(s):
    s = s.lower()  # Convert to lowercase
    vowels = consonants = 0
    vowels_set = {'a', 'e', 'i', 'o', 'u'}

    for char in s:
        if char.isalpha():  # Check if it's a letter
            if char in vowels_set:
                vowels += 1
            else:
                consonants += 1

    print("Input:", s)
    print("Vowels:", vowels)
    print("Consonants:", consonants)

# Example usage
count_vowels_and_consonants("Hello World")

"""
Input: hello world
Vowels: 3
Consonants: 7

Explanation
Convert the input to lowercase.
Iterate through the characters and check if they are alphabetic.
If the character is in the set of vowels, increase the vowel count.
Otherwise, increase the consonant count.
"""