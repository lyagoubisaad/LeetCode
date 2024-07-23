package leetcode_categories.binary_tree;

import utils.TreeNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class L230KthSmallestElementBST {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.naturalOrder());
        roam(root, queue);
        int value = -1;
        while (k > 0) {
            value = queue.poll();
            k--;
        }
        return value;
    }

    private void roam(TreeNode root, PriorityQueue<Integer> queue) {
        if(root == null) return;
        queue.add(root.val);
        roam(root.left, queue);
        roam(root.right, queue);
    }
}
