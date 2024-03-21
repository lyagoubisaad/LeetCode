package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

public class L_1026_MaximumDifferenceBetweenNodeandAncestor {
    public int maxAncestorDiff(TreeNode root) {
        return helper(root,root.val,root.val);
    }

    public int helper(TreeNode root, int min, int max) {
        if(root == null) return max-min;
        min = Math.min(root.val,min);
        max = Math.max(root.val,max);
        return Math.max((helper(root.left, min, max)),(helper(root.right, min, max)));
    }
}
