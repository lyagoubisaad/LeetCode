package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

public class L_701_InsertintoaBinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(val < root.val) {
            if(root.left == null) {
                root.left = new TreeNode(val);
                return root;
            } else {
                insertIntoBST(root.left, val);
            }
        }
        else if(val > root.val) {
            if(root.right == null) {
                root.right = new TreeNode(val);
                return root;
            } else {
                insertIntoBST(root.right, val);
            }
        }
        return root;
    }
}
