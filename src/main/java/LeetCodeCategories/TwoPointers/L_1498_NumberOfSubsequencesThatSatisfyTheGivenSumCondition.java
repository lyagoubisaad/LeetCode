package LeetCodeCategories.TwoPointers;

import java.util.Arrays;

public class L_1498_NumberOfSubsequencesThatSatisfyTheGivenSumCondition {
    public static int numSubseq(int[] nums, int target) {
        int mod = 1000000007;
        Arrays.sort(nums);
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 1;
        int result = 0;

        //The line dp[i] = (dp[i - 1] * 2) % mod; is used to calculate the number of subsequences that can be formed by adding nums[i] to the existing subsequences while ensuring that each subsequence remains valid
        for (int i = 1; i < n; i++) {
            dp[i] = (dp[i - 1] * 2) % mod;
        }

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else {
                result += dp[right - left];
                left++;
            }
        }

        return result%mod;
    }

    public static void main(String[] args) {
        numSubseq(new int[]{3, 5, 6, 7}, 9);
    }
}
