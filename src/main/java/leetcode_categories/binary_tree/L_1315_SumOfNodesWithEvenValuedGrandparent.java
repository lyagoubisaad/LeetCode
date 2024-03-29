package leetcode_categories.binary_tree;

import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class L_1315_SumOfNodesWithEvenValuedGrandparent {
    public int sumEvenGrandparent(TreeNode root) {
        int sum = 0;
        if(root == null) return sum;
        Queue<TreeNode> q = new ArrayDeque();
        q.add(root);
        while (!q.isEmpty()) {
            root = q.poll();
            if(root.val % 2 == 0) {
                if(root.left != null) {
                    if(root.left.left != null) sum += root.left.left.val;
                    if(root.left.right != null) sum += root.left.right.val;
                }
                if(root.right != null) {
                    if(root.right.left != null) sum += root.right.left.val;
                    if(root.right.right != null) sum += root.right.right.val;
                }
            }
            if(root.left != null) q.add(root.left);
            if(root.right != null) q.add(root.right);
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
