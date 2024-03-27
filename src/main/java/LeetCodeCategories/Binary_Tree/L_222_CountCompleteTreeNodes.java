package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

public class L_222_CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}
