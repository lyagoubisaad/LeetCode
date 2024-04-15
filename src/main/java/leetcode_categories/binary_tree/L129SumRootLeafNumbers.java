package leetcode_categories.binary_tree;

import utils.TreeNode;

public class L129SumRootLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return helper(0, root);
    }

    private int helper(int value, TreeNode root) {
        if(root == null) return 0;
        int sum = (value*10) + root.val;
        if(root.left == null && root.right == null) return sum;
        return helper(sum, root.left) + helper(sum, root.right);
    }
}
