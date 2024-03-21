package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class L_1261_FindElementsInAContaminatedBinaryTree {

    TreeNode root;

    public L_1261_FindElementsInAContaminatedBinaryTree(TreeNode root) {
        this.root = root;
        if(root == null) return;
        root.val = 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if(curr.left != null) {
                curr.left.val = 2 * curr.val + 1;
                q.add(curr.left);
            }
            if(curr.right != null) {
                curr.right.val = 2 * curr.val + 2;
                q.add(curr.right);
            }
        }
    }

    public boolean find(int target) {
        TreeNode root = this.root;
        if(root == null) return false;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if(curr.val == target) return true;
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
        return false;
    }


}
