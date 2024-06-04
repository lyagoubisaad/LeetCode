package leetcode_categories.two_pointers;

import java.util.Arrays;

public class L1968ArrayWithElementsNotEqualAverageNeighbors {

    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int[] rearranged = new int[nums.length];
        int old = 0;
        int half = nums.length/2;
        for (int i=0;i<half;i++) {
            rearranged[old] = nums[i+half];
            rearranged[old+1] = nums[i];
            old +=2;
        }
        if(nums.length % 2 != 0) rearranged[old] = nums[nums.length-1];
        return rearranged;
    }

}
