package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

public class L_98_ValidateBinarySearchTree {
    public static boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        return helper(min, root.left, root.val) && helper(root.val, root.right, max);
    }

    private static boolean helper(long min, TreeNode node, long max) {
        if(node == null) return true;
        if(node.val >= max || node.val <= min) return false;
        return helper(min, node.left, node.val) && helper(node.val, node.right, max);
    }

}
