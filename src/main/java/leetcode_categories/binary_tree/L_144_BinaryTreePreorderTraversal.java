package leetcode_categories.binary_tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L_144_BinaryTreePreorderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stk = new Stack();
        ArrayList<Integer> result = new ArrayList();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.push(root);
                result.add(root.val);
                root = root.left;
            }
            root = stk.pop();
            root = root.right;
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode node = TreeNode.formTree(new Integer[] {3,9,20,1,2,15,7});
        System.out.println(preorderTraversal(node));
    }
}
