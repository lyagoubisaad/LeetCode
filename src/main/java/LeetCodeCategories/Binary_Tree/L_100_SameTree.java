package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

public class L_100_SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null ) return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
