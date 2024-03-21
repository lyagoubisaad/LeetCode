package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

public class L_110_BalancedBinaryTree {

    public static boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(depth(root.left)-depth(root.right)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private static int depth(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(depth(root.left),depth(root.right));
    }

    public static void main(String[] args) {
        isBalanced(new TreeNode().formTree(new Integer[] {3,9,20,null,null,15,7}));
    }
}
