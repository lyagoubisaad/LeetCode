package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

public class L_1325_DeleteLeavesWithaGivenValue {
    public static TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null) return root;
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        if(root.left == null && root.right == null && root.val == target) {
            return null;
        }
        return root;
    }

    public static void main(String[] args) {
        removeLeafNodes(new TreeNode().formTree(new Integer[] {1,2,3,2,null,2,4 }), 2);
    }

}
