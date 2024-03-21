package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

import java.util.*;

public class L_1457_PseudoPalindromicPathsinaBinaryTree {

    public int pseudoPalindromicPaths (TreeNode root) {
        return 0;
    }

    private List<List<TreeNode>> getPath(TreeNode root) {
        List<List<TreeNode>> paths = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        int size;
        q.add(root);
        while (!q.isEmpty()) {
            size = q.size();
            for (int i=0;i<q.size();i++) {
                root = q.poll();
                if(root.left != null) q.add(root.left);
                if(root.right != null) q.add(root.right);
            }
        }
        return paths;
    }
}
