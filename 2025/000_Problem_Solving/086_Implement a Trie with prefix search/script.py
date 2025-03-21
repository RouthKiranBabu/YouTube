# Problem Statement:
# Implement a Trie (Prefix Tree) with methods to insert words and check if a given prefix exists.
# Tries are efficient for prefix-based searching and auto-completion.

class TrieNode:
    """Each node in the Trie contains children (dictionary) and a flag to mark end of word."""
    def __init__(self):
        self.children = {}
        self.is_end_of_word = False

class Trie:
    """Trie Data Structure"""
    def __init__(self):
        self.root = TrieNode()

    def insert(self, word):
        """Inserts a word into the Trie."""
        node = self.root
        for char in word:
            if char not in node.children:
                node.children[char] = TrieNode()
            node = node.children[char]
        node.is_end_of_word = True

    def search_prefix(self, prefix):
        """Checks if a prefix exists in the Trie."""
        node = self.root
        for char in prefix:
            if char not in node.children:
                return False
            node = node.children[char]
        return True

# Testing the Trie
trie = Trie()
trie.insert("apple")
trie.insert("app")
trie.insert("bat")

# Output results
print(trie.search_prefix("app"))  # True (Prefix exists)
print(trie.search_prefix("bat"))  # True (Prefix exists)
print(trie.search_prefix("cat"))  # False (Prefix does not exist)

# Explanation:
# 1. We inserted "apple", "app", and "bat".
# 2. Checking "app" returns True since it is a valid prefix.
# 3. Checking "bat" returns True since it is fully inserted.
# 4. Checking "cat" returns False because it was never inserted.
