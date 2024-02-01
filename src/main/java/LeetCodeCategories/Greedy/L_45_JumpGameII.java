package LeetCodeCategories.Greedy;

import java.util.Arrays;

public class L_45_JumpGameII {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, nums.length);
        dp[nums.length-1] = 0;
        for (int i=nums.length-2;i>=0;i--) {
            for (int j=nums[i];j>0;j--) {
                if(i+j>nums.length-1) dp[i] = 1;
                else dp[i] = Math.min(dp[i], dp[i+j]+1);
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        System.out.println(new L_45_JumpGameII().jump(new int[] {2,1}));
    }
}
