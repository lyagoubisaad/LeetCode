package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class L_897_IncreasingOrderSearchTree {
    public static TreeNode increasingBST(TreeNode root) {
        Stack<TreeNode> stk = new Stack();
        ArrayList<Integer> list = new ArrayList();
        while (root != null || !stk.empty()) {
            while (root != null) {
                stk.add(root);
                root = root.left;
            }
            root = stk.pop();
            list.add(root.val);
            root = root.right;
        }
        TreeNode current;
        if(!list.isEmpty()) current = new TreeNode(list.get(0));
        else return null;
        root = current;
        for (int i=1;i<list.size();i++) {
            current.right = new TreeNode(list.get(i));
            current = current.right;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(5);
        node.right = new TreeNode(7);
        increasingBST(node);
    }

}
