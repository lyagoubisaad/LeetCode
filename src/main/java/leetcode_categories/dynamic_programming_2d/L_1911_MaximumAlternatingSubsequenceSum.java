package leetcode_categories.dynamic_programming_2d;

public class L_1911_MaximumAlternatingSubsequenceSum {
    public long maxAlternatingSum(int[] nums) {
        long[][] dp = new long[nums.length+1][2];
        for (int i=nums.length-1;i>=0;i--) {
            dp[i][0] = Math.min(nums[i]-dp[i+1][1], dp[i+1][0]);
            dp[i][1] = Math.max(nums[i]-dp[i+1][0], dp[i+1][1]);
        }
        return Math.max(dp[0][0], dp[0][1]);
    }

    long result = 0;

    private long dfs(int i, int[] nums, long[][] dp, int sum) {
        if (i < 0) return 0;
        if (dp[i][sum] != 0) return dp[i][sum];
        long take = nums[i] - dfs(i - 1, nums, dp, 1 - sum);
        long skip = dfs(i - 1, nums, dp, sum);
        if (sum == 1) dp[i][sum] = Math.max(take, skip);
        else dp[i][sum] = Math.min(take, skip);
        result = Math.max(result, dp[i][sum]);
        return dp[i][sum];
    }
}
