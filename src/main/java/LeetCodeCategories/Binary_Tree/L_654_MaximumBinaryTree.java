package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class L_654_MaximumBinaryTree {
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0) return null;
        if(nums.length == 1) return new TreeNode(nums[0]);
        int idx = 0;
        int elem = 0;
        for (int i=0;i<nums.length;i++) {
            if(nums[i] > elem) {
                elem = nums[i];
                idx = i;
            }
        }
        TreeNode root = new TreeNode(elem);
        if(idx == 0) root.left = null;
        else {
            int[] numsLeft = new int[idx];
            for (int i=0;i<idx;i++) {
                numsLeft[i] = nums[i];
            }
            root.left = constructMaximumBinaryTree(numsLeft);
        }
        if(idx == nums.length) root.right = null;
        else {
            int[] numsRight = new int[nums.length-idx-1];
            List<Integer> list = new ArrayList();
            int deb = idx+1;
            for (int i=deb;i<nums.length;i++) {
                list.add(nums[i]);
            }
            for (int i=0;i<list.size();i++) {
                numsRight[i] = list.get(i);
            }
            root.right = constructMaximumBinaryTree(numsRight);
        }
        return root;
    }

    public static void main(String[] args) {
        constructMaximumBinaryTree(new int[] {3,2,1,6,0,5});
    }
}
