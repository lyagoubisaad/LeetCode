package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L_94_BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stk = new Stack();
        ArrayList<Integer> result = new ArrayList();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.add(root);
                root = root.left;
            }
            root = stk.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode node = TreeNode.formTree(new Integer[] {3,9,20,1,2,15,7});
        System.out.println(inorderTraversal(node));
    }
}
