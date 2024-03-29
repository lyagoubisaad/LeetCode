package leetcode_categories.arrays_hashings;

import java.util.Arrays;

public class L_508_WiggleSort {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] wigleSortedArray = new int[nums.length];
        for (int i=0;i<nums.length/2;i++) {
            wigleSortedArray[i*2] = nums[i];
        }
        int cpt = nums.length/2;
        for (int i=nums.length-1;i>=0;i--) {
            if(wigleSortedArray[i] == 0) {
                wigleSortedArray[i] = nums[cpt++];
            }
        }

        System.arraycopy(wigleSortedArray, 0, nums, 0, nums.length);
    }
}
