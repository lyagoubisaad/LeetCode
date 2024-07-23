package leetcode_categories.binary_tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L144BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stk = new Stack<>();
        List<Integer> result = new ArrayList<>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.add(root);
                result.add(root.val);
                root = root.left;
            }
            root = stk.pop();
            root = root.right;
        }
        return result;
    }
}
