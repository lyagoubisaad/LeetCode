package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class L_1038_BinarySearchTreeToGreaterSumTree {
    public TreeNode bstToGst(TreeNode root) {
        List<Integer> myList = gather(root);
        if(root == null) return null;
        Queue<TreeNode> q = new ArrayDeque();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            int tmp = curr.val;
            for (Integer nodeVal : myList) {
                if(nodeVal > tmp) curr.val += nodeVal;
            }
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
        return root;
    }

    public List<Integer> gather(TreeNode root) {
        List<Integer> myList = new ArrayList();
        if(root == null) return myList;
        Queue<TreeNode> q = new ArrayDeque();
        q.add(root);
        while (!q.isEmpty()) {
            root = q.poll();
            myList.add(root.val);
            if(root.left != null) q.add(root.left);
            if(root.right != null) q.add(root.right);
        }
        return myList;
    }
}
