// Problem Statement:
// Implement a Trie with methods to insert words and check if a given prefix exists.
// Tries help in search optimizations like autocomplete and spell checking.

class TrieNode {
    constructor() {
        this.children = {}; // Dictionary to store children nodes
        this.isEndOfWord = false; // Flag to mark the end of a word
    }
}

class Trie {
    constructor() {
        this.root = new TrieNode();
    }

    // Inserts a word into the Trie
    insert(word) {
        let node = this.root;
        for (let char of word) {
            if (!node.children[char]) {
                node.children[char] = new TrieNode();
            }
            node = node.children[char];
        }
        node.isEndOfWord = true;
    }

    // Checks if a prefix exists in the Trie
    searchPrefix(prefix) {
        let node = this.root;
        for (let char of prefix) {
            if (!node.children[char]) {
                return false;
            }
            node = node.children[char];
        }
        return true;
    }
}

// Testing the Trie
const trie = new Trie();
trie.insert("apple");
trie.insert("app");
trie.insert("bat");

console.log(trie.searchPrefix("app")); // true (Prefix exists)
console.log(trie.searchPrefix("bat")); // true (Prefix exists)
console.log(trie.searchPrefix("cat")); // false (Prefix does not exist)

// Explanation:
// 1. We inserted "apple", "app", and "bat".
// 2. Checking "app" returns true since it is a valid prefix.
// 3. Checking "bat" returns true since it was inserted.
// 4. Checking "cat" returns false because it was never inserted.
