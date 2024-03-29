package leetcode_categories.binary_tree;


import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class L_102_newone {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        list.add(BFS(queue));
        return list;
    }

    public static List<Integer> BFS(Queue<TreeNode> queueOfNodes) {
        List<Integer> list = new ArrayList<>();
        if(queueOfNodes.isEmpty()) return list;
        Queue<TreeNode> secondQueeue = new ArrayDeque<>();
        while (!queueOfNodes.isEmpty()) {
            TreeNode node = queueOfNodes.poll();
            list.add(node.val);
            if(node.left != null) secondQueeue.add(node.left);
            if(node.right != null) secondQueeue.add(node.right);
        }
        BFS(secondQueeue);
        return list;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = levelOrder(new TreeNode().formTree(new Integer[] {3,9,20,null,null,15,7}));
        for (int i=0;i<list.size();i++) {
            System.out.println("i is : " + i );
            for (int j=0;j<list.get(i).size();j++) {
                System.out.println(list.get(i).get(j));
            }
        }
    }
}