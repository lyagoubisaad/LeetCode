package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

import java.util.Arrays;

public class L_105_ConstructBinaryTreefromPreorderandInorderTraversal {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode(preorder[0]);
        if(inorder.length == 1) return root;
        int j = -1;
        for (int i=0;i<inorder.length;i++) {
            if(inorder[i] == preorder[0]) {
                j=i;
                break;
            }
        }
        if(j != -1 ) root.left = buildTree(Arrays.copyOfRange(preorder,1,j+1), Arrays.copyOfRange(inorder, 0, j));
        if(j != -1 ) root.right = buildTree(Arrays.copyOfRange(preorder,j+1,preorder.length), Arrays.copyOfRange(inorder, j+1, inorder.length));
        return  root;
    }

    public static void main(String[] args) {
        TreeNode node = buildTree(new int[] {3,9,20,15,7}, new int[] {9,3,15,20,7});
    }
}
