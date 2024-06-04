package leetcode_categories.binary_tree;

import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class L623AddOneRowTree {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1) {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int size;
        while (depth > 0) {
            depth--;
            size = queue.size();
            if(depth == 1) {
                for (int i=0;i<size;i++) {
                    TreeNode node = queue.poll();
                    TreeNode leftNode = new TreeNode(val);
                    TreeNode rightNode = new TreeNode(val);
                    leftNode.left = node.left;
                    rightNode.right = node.right;
                    node.left = leftNode;
                    node.right = rightNode;
                }
                break;
            }
            for (int i=0;i<size;i++) {
                TreeNode node = queue.poll();
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }
        return root;
    }
}
