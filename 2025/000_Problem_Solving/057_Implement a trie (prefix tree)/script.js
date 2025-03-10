/*
 * Trie (Prefix Tree) Implementation in JavaScript
 * 
 * Explanation:
 * - A Trie is a data structure used for efficient word storage and retrieval.
 * - Each node has a `children` map and an `isEndOfWord` flag.
 * - The `insert` method adds words to the Trie.
 * - The `search` method checks if a word is in the Trie.
 * - The `startsWith` method checks if a prefix exists in the Trie.
 */

class script {
    constructor() {
        this.root = {};
    }

    insert(word) {
        let node = this.root;
        for (let char of word) {
            if (!node[char]) {
                node[char] = {};
            }
            node = node[char];
        }
        node.isEndOfWord = true;
    }

    search(word) {
        let node = this.root;
        for (let char of word) {
            if (!node[char]) {
                return false;
            }
            node = node[char];
        }
        return node.isEndOfWord === true;
    }

    startsWith(prefix) {
        let node = this.root;
        for (let char of prefix) {
            if (!node[char]) {
                return false;
            }
            node = node[char];
        }
        return true;
    }
}

// Usage
const trie = new script();
trie.insert("apple");
trie.insert("app");

console.log(trie.search("apple"));  // Output: true
console.log(trie.search("app"));    // Output: true
console.log(trie.search("appl"));   // Output: false
console.log(trie.startsWith("ap")); // Output: true
console.log(trie.startsWith("bat")); // Output: false

/*
 * Output:
 * true
 * true
 * false
 * true
 * false
 *
 * Explanation:
 * - "apple" and "app" are added.
 * - Searching "apple" and "app" returns true.
 * - Searching "appl" returns false as it's just a prefix.
 * - "ap" is a prefix, so `startsWith("ap")` returns true.
 * - "bat" is not in the Trie, so `startsWith("bat")` returns false.
 */
