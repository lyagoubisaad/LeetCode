package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

import java.util.Stack;

public class L_404_SumOfLeftLeaves {
    public static int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        TreeNode current = root;
        Stack<TreeNode> stk = new Stack();
        while (!stk.empty() || current != null) {
            while (current != null) {
                stk.push(current);
                current = current.left;
            }
            current = stk.pop();
            if (current.left == null && current.right == null && stk.peek().left == current) {
                sum += current.val;
            }
            current = current.right;
        }
        return sum;
    }
}
