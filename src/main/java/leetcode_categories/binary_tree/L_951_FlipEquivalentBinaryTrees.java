package leetcode_categories.binary_tree;

import utils.TreeNode;

public class L_951_FlipEquivalentBinaryTrees {
    public static boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return true;
        else if(root1 != null && root2 == null) return false;
        else if(root1 == null && root2 != null) return false;
        if(root1.val != root2.val) return false;
        return true;
    }

    public static void main(String[] args) {
        flipEquiv(new TreeNode().formTree(new Integer[] {1,2,3,4,5,6,null,null,null,7,8}), new TreeNode().formTree(new Integer[] {1,3,2,null,6,4,5,null,null,null,null,8,7}));
    }
}
