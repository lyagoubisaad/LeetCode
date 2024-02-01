package LeetCodeCategories.oneD_DynamicProgramming;

import java.util.Arrays;

public class L_300_LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 0);
        int max = 0;
        for (int i=1;i<nums.length;i++) {
            for (int j=0;j<i;j++) {
                if(nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        lengthOfLIS(new int[] {10,9,2,5,3,9,8,10});
    }
}
