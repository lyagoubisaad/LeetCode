package leetcode_categories.binary_tree;

import utils.TreeNode;

public class L_226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode helper = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(helper);
        return root;
    }
}
