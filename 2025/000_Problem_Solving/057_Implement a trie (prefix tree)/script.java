/*
 * Trie (Prefix Tree) Implementation in Java
 * 
 * Explanation:
 * - A Trie is a tree-like data structure used for efficient retrieval of words based on prefixes.
 * - Each node contains a map of child nodes and a boolean flag to mark the end of a word.
 * - The `insert` method adds words to the Trie.
 * - The `search` method checks if a word exists in the Trie.
 * - The `startsWith` method checks if any word in the Trie starts with a given prefix.
 */

 import java.util.HashMap;
 import java.util.Map;
 
 class script {
     static class TrieNode {
         Map<Character, TrieNode> children = new HashMap<>();
         boolean isEndOfWord = false;
     }
 
     private final TrieNode root;
 
     public script() {
         root = new TrieNode();
     }
 
     public void insert(String word) {
         TrieNode node = root;
         for (char ch : word.toCharArray()) {
             node.children.putIfAbsent(ch, new TrieNode());
             node = node.children.get(ch);
         }
         node.isEndOfWord = true;
     }
 
     public boolean search(String word) {
         TrieNode node = root;
         for (char ch : word.toCharArray()) {
             if (!node.children.containsKey(ch)) {
                 return false;
             }
             node = node.children.get(ch);
         }
         return node.isEndOfWord;
     }
 
     public boolean startsWith(String prefix) {
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
         script trie = new script();
         trie.insert("apple");
         trie.insert("app");
         
         System.out.println(trie.search("apple"));  // Output: true
         System.out.println(trie.search("app"));    // Output: true
         System.out.println(trie.search("appl"));   // Output: false
         System.out.println(trie.startsWith("ap")); // Output: true
         System.out.println(trie.startsWith("bat")); // Output: false
     }
 }
 
 /*
  * Output:
  * true
  * true
  * false
  * true
  * false
  *
  * Explanation:
  * - "apple" and "app" are inserted.
  * - Searching "apple" and "app" returns true.
  * - Searching "appl" returns false as it's only a prefix, not a word.
  * - "ap" exists as a prefix, so `startsWith("ap")` returns true.
  * - "bat" is not in the Trie, so `startsWith("bat")` returns false.
  */
 