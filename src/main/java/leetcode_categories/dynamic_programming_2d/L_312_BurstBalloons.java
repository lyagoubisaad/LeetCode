package leetcode_categories.dynamic_programming_2d;

public class L_312_BurstBalloons {
    int maxCoins(int[] nums) {
        int[] newNums = new int[nums.length+2];
        System.arraycopy(nums, 0, newNums, 1, nums.length);
        newNums[0] = newNums[newNums.length-1] = 1;

        int[][] dp = new int[newNums.length][newNums.length];
        for (int left = nums.length;left>=1;left--) {
            for (int right = left;right<=nums.length;right++) {
                for (int k=left;k<=right;k++) {
                    dp[left][right] = Math.max(dp[left][right],
                            newNums[left-1]*newNums[k]*newNums[right+1]+dp[left][k-1]+dp[k+1][right]);
                }
            }
        }
        return dp[1][nums.length];
    }
}
