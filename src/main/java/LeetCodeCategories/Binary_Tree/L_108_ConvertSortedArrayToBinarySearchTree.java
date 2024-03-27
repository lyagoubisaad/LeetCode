package LeetCodeCategories.Binary_Tree;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class L_108_ConvertSortedArrayToBinarySearchTree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        if(nums.length == 1) return new TreeNode(nums[0]);
        TreeNode root = new TreeNode(nums[nums.length/2]);
        int[] left = new int[nums.length/2];
        System.arraycopy(nums, 0, left, 0, nums.length/2);
        root.left = sortedArrayToBST(left);
        int[] right = new int[nums.length-(nums.length/2)-1];
        List<Integer> list = new ArrayList<>();
        for(int i=nums.length/2+1;i<nums.length;i++) {
            list.add(nums[i]);
        }
        for (int i=0;i< right.length;i++) {
            right[i] = list.get(i);
        }
        root.right = sortedArrayToBST(right);
        return root;
    }
    public static void main(String[] args) {
        sortedArrayToBST(new int[] {-1,0,1,2});
    }
}
