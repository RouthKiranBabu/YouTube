def reverse_words(sentence):
    return " ".join(sentence.split()[::-1])

sentence = "I love programming"
print(reverse_words(sentence))  # Output: "programming love I"
