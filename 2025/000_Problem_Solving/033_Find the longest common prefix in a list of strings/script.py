def longest_common_prefix(strs):
    if not strs:
        return ""

    prefix = strs[0]

    for string in strs[1:]:
        while not string.startswith(prefix):
            prefix = prefix[:-1]
            if not prefix:
                return ""

    return prefix

# Example usage
words = ["flower", "flow", "flight"]
print("Longest Common Prefix:", longest_common_prefix(words))

# Longest Common Prefix: fl