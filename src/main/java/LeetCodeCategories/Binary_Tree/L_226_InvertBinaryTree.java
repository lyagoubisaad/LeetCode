package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

public class L_226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode helper = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(helper);
        return root;
    }
}
