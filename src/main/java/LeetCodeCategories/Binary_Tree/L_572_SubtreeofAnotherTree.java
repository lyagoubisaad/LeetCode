package LeetCodeCategories.Binary_Tree;


import Utils.TreeNode;

public class L_572_SubtreeofAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        //if(root.equals(subRoot)) return true; works only here since the equal method has been overrided
        // for Leetcode or any external platform use the line below
        if(compare(root, subRoot)) return true;
        return (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
    }



    public boolean compare(TreeNode treeNode1, TreeNode treeNode2) {
        if(treeNode1 == null && treeNode2 == null) return true;
        if(treeNode1 == null || treeNode2 == null) return false;
        if(treeNode1.val != treeNode2.val) return false;
        return (compare(treeNode1.left, treeNode2.left) && compare(treeNode1.right, treeNode2.right));
    }

    public void main(String[] args) {
        TreeNode node1 = TreeNode.formTree(new Integer[] {3,4,5,1,2});
        TreeNode node2 = TreeNode.formTree(new Integer[] {4,1,2});
    }
}
