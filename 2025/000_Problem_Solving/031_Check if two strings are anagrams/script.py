def are_anagrams(str1, str2):
    return sorted(str1) == sorted(str2)

str1 = "listen"
str2 = "silent"
print(f"Are '{str1}' and '{str2}' anagrams? {are_anagrams(str1, str2)}")

#Are 'listen' and 'silent' anagrams? True
