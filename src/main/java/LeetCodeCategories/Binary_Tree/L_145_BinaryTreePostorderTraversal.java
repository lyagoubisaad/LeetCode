package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

import java.util.*;

public class L_145_BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList();
        Stack<TreeNode> stack = new Stack();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                result.addFirst(root.val);
                root = root.right;
            } else {
                root = stack.pop();
                root = root.left;
            }
        }
        return result;
    }
}
