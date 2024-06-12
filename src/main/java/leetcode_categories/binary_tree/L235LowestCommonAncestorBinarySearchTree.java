package leetcode_categories.binary_tree;

import utils.TreeNode;

public class L235LowestCommonAncestorBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(isSubTree(root.left, p, q)) return lowestCommonAncestor(root.left, p, q);
        if(isSubTree(root.right, p, q)) return lowestCommonAncestor(root.right, p, q);
        return root;
    }

    private boolean isSubTree(TreeNode root, TreeNode p, TreeNode q) {
        return isSubTree(root, p) && isSubTree(root, q);
    }

    private boolean isSubTree(TreeNode root, TreeNode subTree) {
        if(root == null) return false;
        if(root.val == subTree.val) return true;
        return isSubTree(root.left, subTree) || isSubTree(root.right, subTree);
    }
}
