package LeetCodeCategories.Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class L_133_CloneGraph {

    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    HashMap<Node,Node> store = new HashMap<>();

    public Node cloneGraph(Node node) {
        if(node == null) return null;
        return dfs(node);
    }

    private Node dfs(Node node) {
        if(store.containsKey(node)) return store.get(node);
        Node res = new Node(node.val);
        store.put(node, res);
        for (int i=0;i<node.neighbors.size();i++) {
            res.neighbors.add(dfs(node.neighbors.get(i)));
        }
        return res;
    }
}
