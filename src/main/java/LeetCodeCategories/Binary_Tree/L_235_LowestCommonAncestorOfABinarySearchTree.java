package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

public class L_235_LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
            else if(root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
            return root;
    }
}
