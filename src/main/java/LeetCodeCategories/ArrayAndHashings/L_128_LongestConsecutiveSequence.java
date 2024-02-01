package LeetCodeCategories.ArrayAndHashings;

import java.util.Arrays;

public class L_128_LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int seq = 1;
        int max = seq;
        for (int i=1;i<nums.length;i++) {
            if(nums[i] == nums[i-1]) continue;
            if(nums[i] == nums[i-1]+1) {
                seq++;
            } else {
                max = Math.max(max, seq);
                seq = 1;
            }
        }
        return Math.max(max, seq);
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[] {1,2,0,1}));
    }
}
