package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

import java.util.*;

public class L_1305_AllElementsInTwoBinarySearchTrees {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque();
        if(root1 != null) q.add(root1);
        while (!q.isEmpty()) {
            root1 = q.poll();
            list.add(root1.val);
            if(root1.left != null) q.add(root1.left);
            if(root1.right != null) q.add(root1.right);
        }
        if(root2 != null) q.add(root2);
        while (!q.isEmpty()) {
            root2 = q.poll();
            list.add(root2.val);
            if(root2.left != null) q.add(root2.left);
            if(root2.right != null) q.add(root2.right);
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {

    }
}
