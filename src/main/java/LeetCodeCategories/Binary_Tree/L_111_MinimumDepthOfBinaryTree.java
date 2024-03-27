package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

public class L_111_MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left != null && root.right != null) return 1+Math.min(minDepth(root.left),minDepth(root.right));
        else if(root.left != null) return 1+minDepth(root.left);
        return 1+minDepth(root.right);
    }

    public static void main(String[] args) {

    }
}
