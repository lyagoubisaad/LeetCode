package LeetCodeCategories.Tries;

public class L_211_DesignAddandSearchWordsDataStructure {
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

    public L_211_DesignAddandSearchWordsDataStructure() {
        root = new Node('\0');
    }

    public void addWord(String word) {
        Node current = this.root;
        for (int i=0;i<word.length();i++) {
            if(current.children[word.charAt(i) - 'a'] == null) {
                current.children[word.charAt(i) - 'a'] = new Node(word.charAt(i));
            }
            current = current.children[word.charAt(i) - 'a'];
        }
        current.endWith = true;
    }

    public boolean search(String word) {
        Node current = this.root;
        return dfs(current, word);
    }

    private boolean dfs(Node current, String word) {
        if(current == null) return false;
        if(word.length() == 0) return current.endWith;
        if(word.charAt(0) == '.') {
            Node[] nodes = current.children;
            for (int i=0;i<nodes.length;i++) {
                if(dfs(nodes[i], word.substring(1))) return true;
            }
        } else {
            if(current.children[word.charAt(0) - 'a'] == null) return false;
            return dfs(current.children[word.charAt(0)-'a'], word.substring(1));
        }
        return false;
    }

    public static void main(String[] args) {
        L_211_DesignAddandSearchWordsDataStructure trie = new L_211_DesignAddandSearchWordsDataStructure();
        trie.addWord("app");
        System.out.println(trie.search("a.."));
        System.out.println(trie.search("app"));
        System.out.println(trie.search("..p"));
        System.out.println(trie.search(".."));
    }
}
