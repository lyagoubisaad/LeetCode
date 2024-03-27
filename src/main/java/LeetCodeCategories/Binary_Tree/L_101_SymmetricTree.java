package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

public class L_101_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return same(root.left, root.right);
    }

    private boolean same(TreeNode roo1, TreeNode root2) {
        if(roo1 == null && root2 == null) return true;
        if(roo1 == null || root2 == null) return false;
        return roo1.val == root2.val && same(roo1.right, root2.left) && same(roo1.left, root2.right);
    }
}
