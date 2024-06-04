package leetcode_categories.binary_tree;

import utils.TreeNode;

public class L988SmallestStringStartingFromLeaf {
    public String smallestFromLeaf(TreeNode root) {
        return helper(root, "");
    }
    
    public String helper(TreeNode root, String val) {
        val = (char) (root.val + 'a')+ val;
        if(root.left == null && root.right == null) {
            return val;
        }
        if(root.left == null) return helper(root.right, val);
        if(root.right == null) return helper(root.left,val);
        String leftString = helper(root.left,val);
        String rightString = helper(root.right,val);
        return (leftString.compareTo(rightString) < 0 ? leftString:rightString);
    }
}
