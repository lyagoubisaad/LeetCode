package leetcode_categories.binary_tree;

import utils.TreeNode;

public class L_543_DiameterofBinaryTree {
    public int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        traversePostOrder(root);
        return maxDiameter;
    }
    public void traversePostOrder(TreeNode node) {
        if (node == null) return;
        if (node.left != null) {
            traversePostOrder(node.left);
        }
        if (node.right != null) {
            traversePostOrder(node.right);
        }
        maxDiameter = Math.max(maxDiameter, cptDiameter(node));
    }
    public int cptDiameter(TreeNode root) {
        return 2+cptHeight(root.left)+cptHeight(root.right);
    }

    public int cptHeight(TreeNode root) {
        if(root == null) return -1;
        return 1+Math.max(cptHeight(root.left), cptHeight(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.formTree(new Integer[] {1,2});
        System.out.println(new L_543_DiameterofBinaryTree().diameterOfBinaryTree(root));
    }
}
