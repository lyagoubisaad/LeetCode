package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

public class L_572_SubtreeofAnotherTree {
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        if(subRoot == null) return false;
        return compare(root, subRoot) || compare(root.left, subRoot) || compare(root.right, subRoot);
    }

    private static boolean compare(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null || root.val != subRoot.val) return false;
        return compare(root.left, subRoot.left) && compare(root.right, subRoot.right);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode();
        node1.formTree(new Integer[] {3,4,5,1,2});
        TreeNode node2 = new TreeNode();
        node2.formTree(new Integer[] {4,1,2});
        System.out.println(isSubtree(node1, node2));
    }
}
