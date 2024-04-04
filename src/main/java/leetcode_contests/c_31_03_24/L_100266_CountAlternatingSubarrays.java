package leetcode_contests.c_31_03_24;

public class L_100266_CountAlternatingSubarrays {
    public long countAlternatingSubarrays(int[] nums) {
        int n = nums.length;
        long result = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) dp[i] = dp[i - 1] + 1;
            else dp[i] = 1;
        }
        for (int i = 0; i < n; i++) result += dp[i];
        return result;
    }

}
