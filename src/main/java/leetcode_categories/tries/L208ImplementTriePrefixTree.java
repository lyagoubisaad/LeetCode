package leetcode_categories.tries;

public class L208ImplementTriePrefixTree {

    class Node {
        boolean endWith;
        Node[] children;
        char value;
        Node(char value) {
            this.value = value;
            this.endWith = false;
            this.children = new Node[26];
        }
    }
    Node root;
    public L208ImplementTriePrefixTree() {
        root = new Node('\0');
    }

    public void insert(String word) {
        Node current = this.root;
        for (int i=0;i<word.length();i++) {
            if(current.children[word.charAt(i) - 'a'] == null) {
                current.children[word.charAt(i) - 'a'] = new Node(word.charAt(i));
            }
            current = current.children[word.charAt(i) - 'a'];
        }
        current.endWith = true;
    }

    public Node helper(String word) {
        Node current = this.root;
        for (int i=0;i<word.length();i++) {
            if(current.children[word.charAt(i) - 'a'] == null) return null;
            current = current.children[word.charAt(i) - 'a'];
        }
        return current;
    }

    public boolean search(String word) {
        Node current = helper(word);
        return current != null && current.endWith;
    }

    public boolean startsWith(String prefix) {
        Node current = helper(prefix);
        return current != null;
    }

    public static void main(String[] args) {
        L208ImplementTriePrefixTree trie = new L208ImplementTriePrefixTree();
        trie.insert("app");
        System.out.println(trie.search("a"));
        System.out.println(trie.startsWith("a"));
        System.out.println(trie.search("app"));
        System.out.println(trie.search("appe"));
    }
}
