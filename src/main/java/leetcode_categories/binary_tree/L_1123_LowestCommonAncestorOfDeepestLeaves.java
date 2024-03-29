package leetcode_categories.binary_tree;

import utils.TreeNode;

public class L_1123_LowestCommonAncestorOfDeepestLeaves {

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int left = height(root.left);
        int right = height(root.right);
        if(left == right) return root;
        return lcaDeepestLeaves(left>right? root.left:root.right);
    }

    public int height(TreeNode root) {
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        if(left == 0 || right == 0) return 1+left+right;
        return 1+Math.max(left,right);
    }
}
