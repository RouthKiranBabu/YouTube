// Problem: Implement a Ternary Search Tree (TST)
// 
// Theory:
// - A TST is a hybrid between a binary search tree and a trie.
// - Each node has three children:
//   - Left: Stores characters less than the node's character.
//   - Middle: Stores the next character in the same word.
//   - Right: Stores characters greater than the node's character.
// - Used in auto-suggestions and dictionary-like applications.

class TSTNode {
    constructor(char) {
        this.char = char;
        this.isEndOfWord = false;
        this.left = this.middle = this.right = null;
    }
}

class TernarySearchTree {
    constructor() {
        this.root = null;
    }

    insert(word) {
        this.root = this._insert(this.root, word, 0);
    }

    _insert(node, word, index) {
        let char = word[index];

        if (!node) {
            node = new TSTNode(char);
        }

        if (char < node.char) {
            node.left = this._insert(node.left, word, index);
        } else if (char > node.char) {
            node.right = this._insert(node.right, word, index);
        } else {
            if (index + 1 === word.length) {
                node.isEndOfWord = true;
            } else {
                node.middle = this._insert(node.middle, word, index + 1);
            }
        }

        return node;
    }

    search(word) {
        return this._search(this.root, word, 0);
    }

    _search(node, word, index) {
        if (!node) return false;

        let char = word[index];

        if (char < node.char) {
            return this._search(node.left, word, index);
        } else if (char > node.char) {
            return this._search(node.right, word, index);
        } else {
            if (index + 1 === word.length) {
                return node.isEndOfWord;
            }
            return this._search(node.middle, word, index + 1);
        }
    }
}

// Example Usage:
const tst = new TernarySearchTree();
tst.insert("cat");
tst.insert("bat");
tst.insert("rat");

console.log(tst.search("cat")); // true
console.log(tst.search("bat")); // true
console.log(tst.search("rat")); // true
console.log(tst.search("dog")); // false
