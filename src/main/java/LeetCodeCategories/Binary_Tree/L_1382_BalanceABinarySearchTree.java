package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

import java.util.*;

public class L_1382_BalanceABinarySearchTree {
    public static TreeNode balanceBST(TreeNode root) {
        if(root == null) return new TreeNode();
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stk = new Stack();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.add(root);
                root = root.left;
            }
            root = stk.pop();
            list.add(root.val);
            root = root.right;
        }
        return helper(list);
    }

    private static TreeNode helper(List<Integer> list) {
        if(list.size() == 0) return null;
        TreeNode root = new TreeNode();
        List<Integer> left = new ArrayList();
        List<Integer> right = new ArrayList();
        for (int i=0;i<list.size();i++) {
            if(i<list.size()/2) left.add(list.get(i));
            if(i == list.size()/2) root = new TreeNode(list.get(i));
            if(i>list.size()/2) right.add(list.get(i));
        }
        root.left = helper(left);
        root.right = helper(right);
        return root;
    }

    public static void main(String[] args) {
        balanceBST(new TreeNode().formTree(new Integer[] {1,null,2,null,3,null,4}));
    }
}
