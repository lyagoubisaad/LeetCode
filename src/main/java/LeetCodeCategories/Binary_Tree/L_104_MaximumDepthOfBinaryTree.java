package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

public class L_104_MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
