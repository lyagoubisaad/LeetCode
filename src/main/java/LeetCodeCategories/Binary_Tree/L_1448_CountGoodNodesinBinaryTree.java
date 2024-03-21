package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

public class L_1448_CountGoodNodesinBinaryTree {
    public int goodNodes(TreeNode root) {
        return helper(root, Integer.MIN_VALUE);
    }

    private int helper(TreeNode root, int max) {
        if(root == null) return 0;
        if(root.val >= max) {
            max = root.val;
            return 1 + helper(root.left, max) + helper(root.right, max);
        } else {
            return 0 + helper(root.left, max) + helper(root.right, max);
        }
    }
}
