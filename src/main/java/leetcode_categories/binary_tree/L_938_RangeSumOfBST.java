package leetcode_categories.binary_tree;

import utils.TreeNode;

import java.util.Stack;

public class L_938_RangeSumOfBST {

    public int rangeSumBST(TreeNode root, int low, int high) {
        Stack<TreeNode> stk = new Stack();
        int sum = 0;
        while (root != null | !stk.isEmpty()) {
            while (root !=null) {
                stk.add(root);
                root = root.left;
            }
            root = stk.pop();
            if(root.val >= low && root.val <= high) {
                sum += root.val;
            }
            root = root.right;
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
