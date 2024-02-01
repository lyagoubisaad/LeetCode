package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

import java.util.*;

public class L_671_SecondMinimumNodeInABinaryTree {
    public int findSecondMinimumValue(TreeNode root) {
        int min = root.val;
        Queue<TreeNode> q = new ArrayDeque();
        Set<Integer> list = new TreeSet<>();
        q.add(root);
        while (!q.isEmpty()) {
            root = q.poll();
            list.add(root.val);
            if(root.left != null) q.add(root.left);
            if(root.right != null) q.add(root.right);
        }
        int idx = 0;
        for (int elem : list) {
            if(idx == 1) return elem;
            idx++;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
