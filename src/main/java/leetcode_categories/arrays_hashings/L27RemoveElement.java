package leetcode_categories.arrays_hashings;

import java.util.Arrays;

public class L27RemoveElement {
    public int removeElement(int[] nums, int val) {
        int result = nums.length;
        for (int i=0;i<nums.length;i++) {
            if(nums[i] == val) {
                nums[i] = 51;
                result--;
            }
        }
        Arrays.sort(nums);
        return result;
    }
}
