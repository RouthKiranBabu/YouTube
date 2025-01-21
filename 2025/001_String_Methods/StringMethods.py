text = "Name\tAge\tLocation"
expanded_text = text.expandtabs(6)  # Set tab size to 6
print(repr(expanded_text)) # 'Name  Age   Location'
print(expanded_text) # Name  Age   Location

translation = str.maketrans({'a': '1', 'b': '2', 'c': '3'})
result = "abc cab".translate(translation); print(result) # 123 312

# Create a translation table to replace and delete characters 'bc'
translation = str.maketrans("aeiou", "12345", "bc")
result = "abcde iou".translate(translation);print(result) #1d2 345

emp = {'name': "routh", 'skills': {'Programming': ['Python', 'javascript', 'java'], 'body': ['Workout', 'Speaking', 'Reading']}}
print("My name is {name}, Programming languages I know {skills[Programming]} programming languages and I do {skills[body][0]} everyday.".format_map(emp))
# My name is routh, Programming languages I know ['Python', 'javascript', 'java'] programming languages and I do Workout everyday.
class employee:
    def __getitem__(self, key):
        em = {"name": "kiran", "age": 23}
        return em.get(key, "Unknown")
emp = employee()
print("My name is {name}, I am {age} years old. Do you know {you}.".format_map(emp))
# My name is kiran, I am 23 years old. Do you know Unknown.

print("Hello, {} count up to {}.".format("kiran", 7)) # Hello, kiran count up to 7.
print("one = {one}, two = {two}.".format(one = 1, two = 2)) # one = 1, two = 2.
print("one = {}, two = {two}.".format(1, two = 2)) # one = 1, two = 2.
print("Pi = {:.3f}.".format(3.14159265359)) # Pi = 3.142.
print("one = {1}, two = {0}.".format(2, 1)) # one = 1, two = 2.
formatted = "'{:<10} | {:^10} | {:>10}'".format("Left", "Center", "Right")
print(formatted) # 'Left       |   Center   |      Right'
data = {"name": "Alice", "age": 30}
greeting = "Hello, my name is {name} and I am {age} years old.".format(**data)
print(greeting) # Hello, my name is Alice and I am 30 years old.

s = " hello world  "
print("'" + s.strip() + "'") # 'hello world'
print("'" + s.rstrip() + "'") # ' hello world'
print("'" + s.lstrip() + "'") # 'hello world  '
s1 = "--hello--"
print("'" + s1.rstrip("-") + "'") # '--hello'
print("'" + s1.lstrip("-") + "'") # 'hello--'
s2 = "xxxyyhelloxy"
print("'" + s2.rstrip("xy") + "'") # 'xxxyyhello'
print("'" + s2.lstrip("xy") + "'") # 'helloxy'

s = " hello world  "
print("'" + s.strip() + "'") # 'hello world'
s = "--hello--"; print(s.strip("-")) # hello
s = "xxxyyhelloxy"; print(s.strip("xy")) # hello

words, intl = ['Hello', 'world', 'from', 'Python'], [1, 2, 3]
print(" ".join(words), "".join(words), "_".join(map(str, intl))) # Hello world from Python HelloworldfromPython 1_2_3

s = "h:el:lo"
print(s.rpartition(":"), s[2:].rpartition(":")) # ('h:el', ':', 'lo') ('el', ':', 'lo')

s = "h:el:lo"
print(s.partition(":"), s[2:].partition(":")) # ('h', ':', 'el:lo') ('el', ':', 'lo')

s = """Hello,
How are you, 
hope you are good!"""
print(s.splitlines()) # ['Hello,', 'How are you, ', 'hope you are good!']
print(s.splitlines(keepends=True)) # ['Hello,\n', 'How are you, \n', 'hope you are good!']
s = "who\n\nare\n\nyou"
print(s.splitlines(keepends=True)) # ['who\n', '\n', 'are\n', '\n', 'you']
print(s.splitlines()) # ['who', '', 'are', '', 'you']

s = "hello world hello.hello world"
print(s.split()) # ['hello', 'world', 'hello.hello', 'world']
print(s.split(".")) # ['hello world hello', 'hello world']
print(s.split(" ", 2)) # ['hello', 'world', 'hello.hello world']
print(s.rsplit()) # ['hello', 'world', 'hello.hello', 'world']
print(s.rsplit(".")) # ['hello world hello', 'hello world']
print(s.rsplit(" ", 2)) # ['hello world', 'hello.hello', 'world']

s = "hello world hello hello"
print(s.replace("hello", "new")) # new world new new
print(s.replace("hello", "new", 2)) # new world new hello

s = "hello world hello"
print(s.rindex("hello")) # 12
print(s.rindex("hello")) # 12
# Finding right most 'hello' from index 0 to half of length
print(s.rindex("hello", 0, len(s)//2)) # 0

s = "hello world hello"
print(s.rfind("hello")) # 12
print(s.rfind("hello")) # 12
# Finding right most 'hello' from index 0 to half of length
print(s.rfind("hello", 0, len(s)//2)) # 0

s = "hello world"
print(s.index("world")) # 6
print(s.index("o")) # 4
# Find 'o' from index 5
print(s.index("o", 5, len(s))) # 7

s = "hello world"
print(s.find("world")) # 6
print(s.find("o")) # 4
# Find 'o' from index 5
print(s.find("o", 5, len(s))) # 7

ls = ["test1", "test2", "3tesT", "342sT"]
for s in ls:
    print("\n[" + s + "]:")
    print("Count of t: " + str(s.count("t")))
    print("Count of t from index 2: " + str(s.count("t", 2, len(s))))
    if (s.endswith("sT")): print("Element ends with 'sT': " + s)
    if (s.endswith("st", 0, 4)): print("Element ends with 'st' from index [0 to 3]: " + s)
    if (s.startswith("te")): print("Starts with 'te'.")
    if (s.startswith("sT", 3, 5)): print("Element has 'sT' which starts from index 3.")
"""Output

[test1]:
Count of t: 2
Count of t from index 2: 1
Element ends with 'st' from index [0 to 3]: test1
Starts with 'te'.

[test2]:
Count of t: 2
Count of t from index 2: 1
Element ends with 'st' from index [0 to 3]: test2
Starts with 'te'.

[3tesT]:
Count of t: 1
Count of t from index 2: 0
Element ends with 'sT': 3tesT
Element has 'sT' which starts from index 3.

[342sT]:
Count of t: 0
Count of t from index 2: 0
Element ends with 'sT': 342sT
Element has 'sT' which starts from index 3.

"""

s = "hello"
print("['" + s.rjust(10) + "'", "'" + s.rjust(10, "*") + "'" + "]", sep = "") # ['     hello''*****hello']

s = "hello"
print("['" + s.ljust(10) + "'", "'" + s.ljust(10, "*") + "'" + "]", sep = "") # ['hello     ''hello*****']

s = "hello"
print("[" + s.center(10), s.center(10, "*") + "]", sep = "<->") # [  hello   <->**hello***]

s = "hh"
print(s.zfill(5), "4".zfill(3)) # 000hh 004

s = "hello world"
print(s.title()) # Hello World

s = "HeLlO"
print(s.swapcase()) # hElLo

s = "HeLlO"
print(s.lower()) # hello
print(s.upper()) # HELLO

s1, s2 = "HeLLo", "hEllO"
print(s1.casefold()) # hello
print(s1.casefold() == s2.casefold()) #True

s = "hello world"
print(s.capitalize()) # Hello world

# Use of String Query Methods to know about string.
strlist = ["132", "def", "as12", "s 1", "d@1", "1.2", "\t", " ", "", " \t \n ", "Array", "ASCII"]
for x in strlist:
    print("\n[" + x + "] :")
    if x.isalnum(): print("1. Contains alphabet numeric.")
    if x.isalpha(): print("2. Contains only alphabet.")
    # ASCII characters (i.e., characters with Unicode code points between 0 and 127)
    if x.isascii(): print("3. Contains ASCII characters.")
    if x.isdecimal(): print("4. It is decimal.")
    if x.isdigit(): print("5. It is a digit.")
    # identifier is a name used to identify variables, functions, classes, or other objects in Python
    if x.isidentifier(): print("5. It is a identifier.")
    if x.islower(): print("6. It is lower.")
    if x.isnumeric(): print("7. It is numeric.")
    # Printable characters include letters, digits, punctuation, and whitespace, but exclude control characters like \n or \t.
    if x.isprintable(): print("8. It is printable.")
    if x.isspace(): print("9. It is Space.")
    if x.istitle(): print("10. It is title.")
    if x.isupper(): print("11. It is upper.")
"""
Output:

[132] :
1. Contains alphabet numeric.
3. Contains ASCII characters.
4. It is decimal.
5. It is a digit.
7. It is numeric.
8. It is printable.

[def] :
1. Contains alphabet numeric.
2. Contains only alphabet.
3. Contains ASCII characters.
5. It is a identifier.
6. It is lower.
8. It is printable.

[as12] :
1. Contains alphabet numeric.
3. Contains ASCII characters.
5. It is a identifier.
6. It is lower.
8. It is printable.

[s 1] :
3. Contains ASCII characters.
6. It is lower.
8. It is printable.

[d@1] :
3. Contains ASCII characters.
6. It is lower.
8. It is printable.

[1.2] :
3. Contains ASCII characters.
8. It is printable.

[	] :
3. Contains ASCII characters.
9. It is Space.

[ ] :
3. Contains ASCII characters.
8. It is printable.
9. It is Space.

[] :
3. Contains ASCII characters.
8. It is printable.

[ 	 
 ] :
3. Contains ASCII characters.
9. It is Space.

[Array] :
1. Contains alphabet numeric.
2. Contains only alphabet.
3. Contains ASCII characters.
5. It is a identifier.
8. It is printable.
10. It is title.

[ASCII] :
1. Contains alphabet numeric.
2. Contains only alphabet.
3. Contains ASCII characters.
5. It is a identifier.
8. It is printable.
11. It is upper.
"""