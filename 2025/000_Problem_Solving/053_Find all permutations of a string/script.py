"""
This Python program generates all permutations of a given string.
It uses recursion, where a character is fixed at each step and the remaining string is permuted.
"""

class script:
    @staticmethod
    def permute(string, prefix="", results=None):
        if results is None:
            results = []
        if len(string) == 0:
            results.append(prefix)
        else:
            for i in range(len(string)):
                remaining = string[:i] + string[i+1:]
                script.permute(remaining, prefix + string[i], results)
        return results

# Example usage
input_str = "abc"
result = script.permute(input_str)
print("Permutations of", input_str, ":", result)

"""
Output:
Permutations of abc : ['abc', 'acb', 'bac', 'bca', 'cab', 'cba']

Explanation:
- The function recursively picks one character and finds permutations of the rest.
- When the input string is empty, it appends the formed permutation to the results list.
- Finally, all generated permutations are printed.
"""
