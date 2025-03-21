# Problem: Implement a Ternary Search Tree (TST)
# 
# Theory:
# - A Ternary Search Tree is a type of trie where nodes have three children:
#   - Left: for characters less than the current node's character.
#   - Middle: for characters equal to the current node's character.
#   - Right: for characters greater than the current node's character.
# - Used for dictionary-like storage and auto-complete functionalities.

class TSTNode:
    def __init__(self, char):
        self.char = char
        self.is_end_of_word = False
        self.left = self.middle = self.right = None

class TernarySearchTree:
    def __init__(self):
        self.root = None

    def insert(self, word):
        self.root = self._insert(self.root, word, 0)

    def _insert(self, node, word, index):
        char = word[index]

        if node is None:
            node = TSTNode(char)

        if char < node.char:
            node.left = self._insert(node.left, word, index)
        elif char > node.char:
            node.right = self._insert(node.right, word, index)
        else:
            if index + 1 == len(word):
                node.is_end_of_word = True
            else:
                node.middle = self._insert(node.middle, word, index + 1)

        return node

    def search(self, word):
        return self._search(self.root, word, 0)

    def _search(self, node, word, index):
        if node is None:
            return False

        char = word[index]

        if char < node.char:
            return self._search(node.left, word, index)
        elif char > node.char:
            return self._search(node.right, word, index)
        else:
            if index + 1 == len(word):
                return node.is_end_of_word
            return self._search(node.middle, word, index + 1)

# Example Usage:
tst = TernarySearchTree()
tst.insert("cat")
tst.insert("bat")
tst.insert("rat")

# Output:
print(tst.search("cat"))  # True
print(tst.search("bat"))  # True
print(tst.search("rat"))  # True
print(tst.search("dog"))  # False
