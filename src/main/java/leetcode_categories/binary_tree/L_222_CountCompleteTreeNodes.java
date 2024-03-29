package leetcode_categories.binary_tree;

import utils.TreeNode;

public class L_222_CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}
