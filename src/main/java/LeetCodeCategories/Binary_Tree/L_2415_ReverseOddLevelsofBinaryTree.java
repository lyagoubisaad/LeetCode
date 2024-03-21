package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class L_2415_ReverseOddLevelsofBinaryTree {
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root == null) return root;
        Queue<TreeNode> q = new ArrayDeque<>();
        Stack<Integer> stk = new Stack<>();
        q.add(root);
        int idx = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i=0;i<size;i++) {
                TreeNode curr = q.poll();
                if (idx % 2 != 0) {
                    curr.val = stk.pop();
                }
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            if(idx % 2 == 0) {
             for (TreeNode elem : q) {
                 stk.add(elem.val);
             }
            }
            idx++;
        }
        return root;
    }
}
