package leetcode_categories.arrays_hashings;

import java.util.Arrays;

public class L128LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int longestConsecutive = 0;
        int localMax = 1;
        for (int i=1;i<nums.length;i++) {
            if(nums[i-1] == nums[i]) continue;
            if(nums[i-1]+1 == nums[i]) {
                localMax++;
            } else {
                longestConsecutive = Math.max(longestConsecutive, localMax);
                localMax = 1;
            }
        }
        return Math.max(longestConsecutive, localMax);
    }
}
