package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

public class L_226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if(root.left != null) invertTree(root.left);
        if(root.right != null) invertTree(root.right);
        return root;
    }
}
