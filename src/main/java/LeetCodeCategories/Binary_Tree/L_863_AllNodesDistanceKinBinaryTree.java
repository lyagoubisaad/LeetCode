package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class L_863_AllNodesDistanceKinBinaryTree {
    static List<Integer> list = new ArrayList<>();

    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> list1 = helper(find(root,target),k);
        list1.addAll(helper(root,dist(root,target)));
        return list1;
    }

    private static TreeNode find(TreeNode root, TreeNode target) {
        if(root == null) return null;
        if(root.val == target.val) return root;
        TreeNode left = find(root.left, target);
        if(left != null) return left;
        return find(root.right, target);
    }

    private static int dist(TreeNode root, TreeNode target) {
        if(root == null || root.val == target.val) return 0;
        return 1+dist(root.left,target)+dist(root.right,target);
    }

    private static int height(TreeNode root) {
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        if(left == 0 || right == 0) return height(root.left)+height(root.right);
        return 1+Math.max(left,right);
    }

    private static List<Integer> helper(TreeNode root, int k) {
        if(root == null) return null;
        if(height(root) == k) list.add(root.val);
        else {
            if(root.left != null) list = helper(root.left,k-1);
            if(root.right != null) list = helper(root.right,k-1);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode target = new TreeNode(5);
        distanceK(new TreeNode().formTree(new Integer[] {3,5,1,6,2,0,8,null,null,7,4}),target,2);
    }

}
