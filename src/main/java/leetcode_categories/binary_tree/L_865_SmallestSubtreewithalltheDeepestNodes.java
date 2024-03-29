package leetcode_categories.binary_tree;

import utils.TreeNode;

public class L_865_SmallestSubtreewithalltheDeepestNodes {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root == null) return null;
        int left = height(root.left);
        int right = height(root.right);
        if(left == right) return root;
        return subtreeWithAllDeepest(left>right? root.left:root.right);
    }

    private int height(TreeNode node) {
        if(node == null) return 0;
        int left = height(node.left);
        int right = height(node.right);
        if(left == 0 || right == 0) return 1+height(node.left)+height(node.right);
        return 1+Math.max(left,right);
    }

}
