package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L_872_LeafSimilarTrees {
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return preOrder(root1).equals(preOrder(root2));
    }

    private static List<Integer> preOrder(TreeNode root) {
        Stack<TreeNode> stk = new Stack<>();
        List<Integer> list = new ArrayList<>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.add(root);
                if(root.left == null && root.right == null) {
                    list.add(root.val);
                }
                root = root.left;
            }
            root = stk.pop();
            root = root.right;
        }
        return list;
    }

    public static void main(String[] args) {
        leafSimilar(new TreeNode().formTree(new Integer[] {3,5,1,6,2,9,8,null,null,7,4}), new TreeNode().formTree(new Integer[] {3,5,1,6,7,4,2,null,null,null,null,null,null,9,8}));
    }
}
