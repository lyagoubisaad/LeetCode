package leetcode_categories.binary_tree;

import utils.TreeNode;

import java.util.Stack;

public class L_1379_FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Stack<TreeNode> stkOrg = new Stack();
        Stack<TreeNode> stkCurr = new Stack();
        TreeNode currOrg = original;
        TreeNode currCln = cloned;
        while (currOrg != null | !stkOrg.isEmpty()) {
            while (currOrg!= null) {
                if(currOrg == target) {
                    return currCln;
                }
                stkOrg.add(currOrg);
                stkCurr.add(currCln);
                currCln = currCln.left;
                currOrg = currOrg.left;
            }
            currOrg = stkOrg.pop();
            currCln = stkCurr.pop();
            if(currOrg == target) {
                return currCln;
            }
            currOrg = currOrg.right;
            currCln = currCln.right;

        }
        return target;
    }

    public static void main(String[] args) {

    }
}
