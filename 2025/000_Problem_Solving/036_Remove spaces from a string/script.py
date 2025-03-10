input_string = "Hello World, Welcome to Programming!"
output_string = input_string.replace(" ", "")  # Remove all spaces
print("Output:", output_string)
"""Explanation:
The replace(" ", "") method replaces all spaces with an empty string.
The modified string is printed.
Summary
Java uses replaceAll("\\s", "") with regex to remove spaces.
JavaScript uses replace(/\s/g, "") with regex for the same purpose.
Python uses replace(" ", ""), which is simpler but does not handle other whitespace characters like tabs and newlines (for that, we can use re.sub(r"\s", "", input_string)).
All three approaches effectively remove spaces from the input string and return a clean output."""