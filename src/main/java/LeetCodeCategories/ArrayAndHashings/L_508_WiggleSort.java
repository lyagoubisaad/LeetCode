package LeetCodeCategories.ArrayAndHashings;

import java.util.Arrays;

public class L_508_WiggleSort {
    public static void wiggleSort(int[] nums) {
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

        for (int i=0;i<nums.length;i++) {
            nums[i] = wigleSortedArray[i];
        }
    }
}
