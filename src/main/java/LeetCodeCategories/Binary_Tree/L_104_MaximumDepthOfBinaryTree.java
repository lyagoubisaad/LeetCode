package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

public class L_104_MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(9);
        root.left.left = null;
        root.left.right = null;
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(17);
        System.out.println(new L_104_MaximumDepthOfBinaryTree().maxDepth(root));
    }
}
