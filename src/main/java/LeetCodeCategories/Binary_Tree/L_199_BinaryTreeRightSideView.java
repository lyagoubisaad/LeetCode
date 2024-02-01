package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

import java.util.*;

public class L_199_BinaryTreeRightSideView {
    //faire un breadth first search et prendre le dernier element et l'ajouter à la liste
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root != null) queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode curr = null;
            int size = queue.size();
            for (int i=0;i<size;i++) {
                curr = queue.poll();
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }
            list.add(curr.val);
        }
        return list;
    }
}
