"""
Trie (Prefix Tree) Implementation in Python

Explanation:
- A Trie is a tree structure that helps in word storage and lookup.
- Each node contains a dictionary for children and an `is_end_of_word` flag.
- The `insert` method adds words to the Trie.
- The `search` method checks if a word exists in the Trie.
- The `starts_with` method checks if any stored word starts with the given prefix.
"""

class script:
    class TrieNode:
        def __init__(self):
            self.children = {}
            self.is_end_of_word = False

    def __init__(self):
        self.root = self.TrieNode()

    def insert(self, word):
        node = self.root
        for char in word:
            if char not in node.children:
                node.children[char] = self.TrieNode()
            node = node.children[char]
        node.is_end_of_word = True

    def search(self, word):
        node = self.root
        for char in word:
            if char not in node.children:
                return False
            node = node.children[char]
        return node.is_end_of_word

    def starts_with(self, prefix):
        node = self.root
        for char in prefix:
            if char not in node.children:
                return False
            node = node.children[char]
        return True

# Usage
trie = script()
trie.insert("apple")
trie.insert("app")

print(trie.search("apple"))  # Output: True
print(trie.search("app"))    # Output: True
print(trie.search("appl"))   # Output: False
print(trie.starts_with("ap")) # Output: True
print(trie.starts_with("bat")) # Output: False

"""
Output:
True
True
False
True
False

Explanation:
- "apple" and "app" are inserted.
- Searching "apple" and "app" returns True.
- Searching "appl" returns False as it's just a prefix.
- "ap" exists as a prefix, so `starts_with("ap")` returns True.
- "bat" is not in the Trie, so `starts_with("bat")` returns False.
"""
