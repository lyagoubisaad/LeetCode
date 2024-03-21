package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class L_637_AverageOfLevelsInBinaryTree {
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            double size = q.size();
            double tot = 0;
            for (int i=0;i<size;i++) {
                root = q.poll();
                tot += root.val;
                if(root.left != null) q.add(root.left);
                if(root.right != null) q.add(root.right);
            }
            list.add(tot/size);
        }
        return list;
    }

    public static void main(String[] args) {
        averageOfLevels(new TreeNode().formTree(new Integer[] {2147483647,2147483647,2147483647}));
    }

}
