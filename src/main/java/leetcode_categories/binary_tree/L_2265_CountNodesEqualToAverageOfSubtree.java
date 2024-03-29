package leetcode_categories.binary_tree;

import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class L_2265_CountNodesEqualToAverageOfSubtree {
    public int averageOfSubtree(TreeNode root) {
        if(root == null) return 0;
        int sum = 0;
        Queue<TreeNode> q = new ArrayDeque();
        q.add(root);
        while (!q.isEmpty()) {
            root = q.poll();
            if(root.val == count(root)) sum ++;
            if(root.left !=null) q.add(root.left);
            if(root.right !=null) q.add(root.right);
        }
        return sum;
    }

    public int count (TreeNode root) {
        int sum = 0;
        int nbr = 0;
        Queue<TreeNode> q = new ArrayDeque();
        q.add(root);
        while (!q.isEmpty()) {
            nbr++;
            root = q.poll();
            sum += root.val;
            if(root.left !=null) q.add(root.left);
            if(root.right !=null) q.add(root.right);
        }
        return sum/nbr;
    }

}
