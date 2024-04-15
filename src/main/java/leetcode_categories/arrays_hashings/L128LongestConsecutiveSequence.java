package leetcode_categories.arrays_hashings;

import java.util.Arrays;

public class L128LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int lcSq = 1;
        int glbSq = 1;
        for (int i=1;i<nums.length;i++) {
            if(nums[i] == nums[i-1]) continue;
            if(nums[i] == nums[i-1]+1) lcSq++;
            else {
                glbSq = Math.max(glbSq, lcSq);
                lcSq = 1;
            }
        }
        return Math.max(glbSq, lcSq);
    }
}
