package leetcode_categories.binary_tree;

import utils.TreeNode;

public class L98ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return helper(root.left, Long.MIN_VALUE, root.val) && helper(root.right, root.val, Long.MAX_VALUE);
    }
    private boolean helper(TreeNode root, long min, long max) {
        if(root == null) return true;
        if(root.val < min || root.val > max) return false;
        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
}
