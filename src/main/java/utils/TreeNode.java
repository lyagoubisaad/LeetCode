package utils;

import java.util.ArrayList;
import java.util.Stack;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode formTree(Integer[] data) {
        if (data == null || data.length == 0) {
            return null; // Handle invalid input
        }
        return form(data, 0);
    }

    private static TreeNode form(Integer[] data, int index) {
        if (index >= data.length || data[index] == null) {
            return null; // Handle empty nodes
        }

        TreeNode root = new TreeNode(data[index]);
        root.left = form(data, 2 * index + 1);
        root.right = form(data, 2 * index + 2);

        return root;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // If the references are the same, return true
        if (obj == null || getClass() != obj.getClass()) return false;
        return compare(this, (TreeNode) obj);
    }

    public static boolean compare(TreeNode treeNode1, TreeNode treeNode2) {
        if(treeNode1 == null && treeNode2 == null) return true;
        if(treeNode1 == null || treeNode2 == null) return false;
        if(treeNode1.val != treeNode2.val) return false;
        return (compare(treeNode1.left, treeNode2.left) && compare(treeNode1.right, treeNode2.right));
    }
    public static Integer[] inorderTraversal(TreeNode root) {
        Stack<TreeNode> stk = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            result.add(root.val);
            root = root.right;
        }
        return result.toArray(new Integer[0]);
    }
}

