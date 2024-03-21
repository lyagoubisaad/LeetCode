package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

import java.util.*;

public class L_102_BinaryTreeLevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        Queue<TreeNode> q1 = new ArrayDeque();
        Queue<TreeNode> q2 = new ArrayDeque();
        if(root == null) return list;
        q1.add(root);
        list.add(Collections.singletonList(root.val));
        while (!q1.isEmpty() || !q2.isEmpty()) {
            List<Integer> tmp = new ArrayList();
            while (!q1.isEmpty()) {
                root = q1.poll();
                if(root.left != null) {
                    q2.add(root.left);
                    tmp.add(root.left.val);
                }
                if(root.right != null) {
                    q2.add(root.right);
                    tmp.add(root.right.val);
                }
            }
            if(!tmp.isEmpty()) {
                list.add(tmp);
            }
            List<Integer> tmp1 = new ArrayList();
            while (!q2.isEmpty()){
                root = q2.poll();
                if(root.left != null) {
                    q1.add(root.left);
                    tmp1.add(root.left.val);
                }
                if(root.right != null) {
                    q1.add(root.right);
                    tmp1.add(root.right.val);
                }
            }
            if(!tmp1.isEmpty()) {
                list.add(tmp1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        list = levelOrder(root);
        for (List<Integer> listElem : list) {
            for (int elem : listElem) {
                System.out.println(elem);
            }
        }
    }
}
