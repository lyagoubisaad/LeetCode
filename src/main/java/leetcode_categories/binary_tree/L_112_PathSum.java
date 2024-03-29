package leetcode_categories.binary_tree;

import utils.TreeNode;

public class L_112_PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if (root.val == targetSum && root.right == null && root.left == null) {
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) ||  hasPathSum(root.right, targetSum - root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        L_112_PathSum l = new L_112_PathSum();
        System.out.println(l.hasPathSum(root, 5));
    }
}
