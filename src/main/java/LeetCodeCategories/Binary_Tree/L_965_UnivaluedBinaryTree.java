package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

public class L_965_UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        boolean tmp = true;
        if(root == null) return tmp;
        if(root.left != null) {
            if(root.val != root.left.val) {
                tmp = false;
            }
        }
        if(root.right != null) {
            if(root.val != root.right.val) {
                tmp = false;
            }
        }
        return tmp && isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}
