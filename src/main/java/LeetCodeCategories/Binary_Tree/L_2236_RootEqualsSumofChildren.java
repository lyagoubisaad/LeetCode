package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

public class L_2236_RootEqualsSumofChildren {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
