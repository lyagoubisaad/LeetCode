package LeetCodeCategories.DynamicProgramming_OneD;

import java.util.Arrays;

public class L_673_Number_of_Longest_Increasing_Subsequence {

    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n];
        int[] count = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);

        int max_len = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[i] == dp[j] + 1) {
                        count[i] += count[j];
                    }
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        count[i] = count[j];
                    }
                }
            }
            max_len = Math.max(max_len, dp[i]);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == max_len) {
                res += count[i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        new L_673_Number_of_Longest_Increasing_Subsequence().findNumberOfLIS(new int[] {1,3,5,4,7});
    }
}
