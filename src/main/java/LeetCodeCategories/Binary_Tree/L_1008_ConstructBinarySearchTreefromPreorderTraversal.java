package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

public class L_1008_ConstructBinarySearchTreefromPreorderTraversal {
    public static TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode();
        if (preorder.length == 0) return root;
        root.val = preorder[0];
        int idx = 1;
        TreeNode currNode = root;
        while (idx != preorder.length) {
            if (preorder[idx] > currNode.val) {
                if (currNode.right == null) {
                    TreeNode nodeElem = new TreeNode(preorder[idx]);
                    currNode.right = nodeElem;
                    idx++;
                    currNode = root;
                } else currNode = currNode.right;
            }
            if (idx == preorder.length) break;
            if (preorder[idx] < currNode.val) {
                if (currNode.left == null) {
                    TreeNode nodeElem = new TreeNode(preorder[idx]);
                    currNode.left = nodeElem;
                    idx++;
                    currNode = root;
                }
                else currNode = currNode.left;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        bstFromPreorder(new int[]{8, 5, 1, 7, 10, 12});
    }
}
