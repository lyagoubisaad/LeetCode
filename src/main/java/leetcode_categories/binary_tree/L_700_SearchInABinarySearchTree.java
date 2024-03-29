package leetcode_categories.binary_tree;

import utils.TreeNode;

import java.util.Stack;

public class L_700_SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        Stack<TreeNode> stk = new Stack();
        while (root!=null || !stk.isEmpty()) {
            while (root != null) {
                if(root.val == val) return root;
                stk.add(root);
                root = root.left;
            }
            root = stk.pop();
            if(root.val == val) return root;
            root = root.right;
        }
        return root;
    }

    public static void main(String[] args) {

    }
}
