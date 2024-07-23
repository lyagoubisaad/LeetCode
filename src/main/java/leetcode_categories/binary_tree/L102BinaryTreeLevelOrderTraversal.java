package leetcode_categories.binary_tree;

import utils.TreeNode;

import java.util.*;

public class L102BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root == null) return List.of();
        queue.add(root);
        List<List<Integer>> levelOrderList = new ArrayList<>();
        int size;
        while (!queue.isEmpty()) {
            size = queue.size();
            List<Integer> currList = new ArrayList<>();
            for (int i=0;i<size;i++) {
                root = queue.poll();
                currList.add(root.val);
                if(root.left != null) queue.add(root.left);
                if(root.right != null) queue.add(root.right);
            }
            levelOrderList.add(new ArrayList<>(currList));
            currList.clear();
        }
        return levelOrderList;
    }
}
