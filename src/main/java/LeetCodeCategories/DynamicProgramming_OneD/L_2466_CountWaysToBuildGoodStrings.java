package LeetCodeCategories.DynamicProgramming_OneD;

import java.util.Arrays;

public class L_2466_CountWaysToBuildGoodStrings {
    int mod = 1_000_000_007;
    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp = new int[high+1];
        Arrays.fill(dp,-1);
        dp[0] = 1;
        int answer = 0;
        for (int end = low; end <= high; ++end) {
            answer += helper(end, zero, one, dp);
            answer %= mod;
        }
        return answer;
    }

    private int helper(int idx, int zero, int one, int[] dp) {
        if(dp[idx] != -1) return dp[idx];
        dp[idx] = 0;
        if(idx >= zero) dp[idx] += helper(idx-zero, zero, one, dp);
        if(idx >= one) dp[idx] += helper(idx-one, zero, one, dp);
        return dp[idx] %= mod;
    }
}
