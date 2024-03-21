package LeetCodeCategories.Binary_Tree;

import utils.TreeNode;

import java.util.Stack;

public class L_1028_RecoveraTreeFromPreorderTraversal {
    public TreeNode recoverFromPreorder(String traversal) {
        if(traversal.length() == 0) return null;
        TreeNode curr = new TreeNode(traversal.charAt(0));
        TreeNode root = curr;
        Stack<TreeNode> stk = new Stack<>();
        int[] arr = new int[traversal.length()];
        stk.push(curr);
        int cpt = 0;
        for(int i=1;i<traversal.length();i++) {
            if(traversal.charAt(i) == '-') {
                cpt++;
            } else {
                for (int j=0;j<cpt-1;j++) {
                    if(arr[cpt] == 1) {

                    }
                }
            }
        }
        return root;
    }
}
