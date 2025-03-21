// Problem Statement:
// Implement a Trie with methods to insert words and check if a given prefix exists.
// Tries are useful for dictionary-based searches, autocomplete, and prefix matching.

import java.util.HashMap;

class TrieNode {
    // Each TrieNode contains a HashMap for child nodes and a flag to mark word endings.
    HashMap<Character, TrieNode> children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new HashMap<>();
        isEndOfWord = false;
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the Trie
    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            node.children.putIfAbsent(ch, new TrieNode());
            node = node.children.get(ch);
        }
        node.isEndOfWord = true;
    }

    // Checks if a prefix exists in the Trie
    public boolean searchPrefix(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            if (!node.children.containsKey(ch)) {
                return false;
            }
            node = node.children.get(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("bat");

        // Output results
        System.out.println(trie.searchPrefix("app"));  // True (Prefix exists)
        System.out.println(trie.searchPrefix("bat"));  // True (Prefix exists)
        System.out.println(trie.searchPrefix("cat"));  // False (Prefix does not exist)
    }
}

// Explanation:
// 1. We inserted "apple", "app", and "bat".
// 2. Checking "app" returns true since it is a valid prefix.
// 3. Checking "bat" returns true since it was inserted.
// 4. Checking "cat" returns false because it was never inserted.
