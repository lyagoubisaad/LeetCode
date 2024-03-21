package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class L_1302_DeepestLeavesSum {
    public static int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque();
        int sum = 0;
        if (root == null) return sum;
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            sum = 0;
            for (int i = 0; i < size; i++) {
                root = q.poll();
                sum += root.val;
                if (root.left != null) q.add(root.left);
                if (root.right != null) q.add(root.right);
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(7);
        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(8);
        deepestLeavesSum(root);

    }
}
