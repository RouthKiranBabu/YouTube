// Problem: Implement a Ternary Search Tree (TST)
// 
// Theory:
// - A Ternary Search Tree (TST) is a trie-like structure where each node has three pointers:
//   - Left: points to characters smaller than current node.
//   - Middle: points to the next character in the same word.
//   - Right: points to characters greater than the current node.
// - Used for efficient dictionary lookups and auto-suggestions.

class TSTNode {
    char character;
    boolean isEndOfWord;
    TSTNode left, middle, right;

    public TSTNode(char character) {
        this.character = character;
        this.isEndOfWord = false;
        this.left = this.middle = this.right = null;
    }
}

class TernarySearchTree {
    private TSTNode root;

    public void insert(String word) {
        root = insert(root, word, 0);
    }

    private TSTNode insert(TSTNode node, String word, int index) {
        char ch = word.charAt(index);

        if (node == null) {
            node = new TSTNode(ch);
        }

        if (ch < node.character) {
            node.left = insert(node.left, word, index);
        } else if (ch > node.character) {
            node.right = insert(node.right, word, index);
        } else {
            if (index + 1 == word.length()) {
                node.isEndOfWord = true;
            } else {
                node.middle = insert(node.middle, word, index + 1);
            }
        }

        return node;
    }

    public boolean search(String word) {
        return search(root, word, 0);
    }

    private boolean search(TSTNode node, String word, int index) {
        if (node == null) return false;

        char ch = word.charAt(index);

        if (ch < node.character) {
            return search(node.left, word, index);
        } else if (ch > node.character) {
            return search(node.right, word, index);
        } else {
            if (index + 1 == word.length()) {
                return node.isEndOfWord;
            }
            return search(node.middle, word, index + 1);
        }
    }

    public static void main(String[] args) {
        TernarySearchTree tst = new TernarySearchTree();
        tst.insert("cat");
        tst.insert("bat");
        tst.insert("rat");

        // Output:
        System.out.println(tst.search("cat")); // true
        System.out.println(tst.search("bat")); // true
        System.out.println(tst.search("rat")); // true
        System.out.println(tst.search("dog")); // false
    }
}
