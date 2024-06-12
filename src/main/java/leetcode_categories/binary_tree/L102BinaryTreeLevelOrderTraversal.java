package leetcode_categories.binary_tree;

import utils.TreeNode;

import java.util.*;

public class L102BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root == null) return List.of();
        queue.add(root);
        TreeNode curr;
        List<List<Integer>> levelOrderList = new ArrayList<>();
        levelOrderList.add(List.of(root.val));
        int size;
        while (!queue.isEmpty()) {
            size = queue.size();
            List<Integer> currList = new ArrayList<>();
            for (int i=0;i<size;i++) {
                curr = queue.poll();
                if(curr.left != null) {
                    currList.add(curr.left.val);
                    queue.add(curr.left);
                }
                if(curr.right != null) {
                    currList.add(curr.right.val);
                    queue.add(curr.right);
                }
            }
            if(!currList.isEmpty()) levelOrderList.add(new ArrayList<>(currList));
            currList.clear();
        }
        return levelOrderList;
    }
}
