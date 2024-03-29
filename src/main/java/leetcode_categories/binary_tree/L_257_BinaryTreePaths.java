package leetcode_categories.binary_tree;

import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class L_257_BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root == null) return list;

        Queue<TreeNode> q = new ArrayDeque();
        while (!q.isEmpty()) {
            root = q.poll();
            if(root.left != null) q.add(root.left);
            if(root.right != null) q.add(root.right);
        }
        return list;
    }
}
