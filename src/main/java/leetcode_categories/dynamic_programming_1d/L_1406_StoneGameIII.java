package leetcode_categories.dynamic_programming_1d;

public class L_1406_StoneGameIII {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n + 1]; // Using an array for dp values
        for (int i = n - 1; i >= 0; i--) {
            int res = Integer.MIN_VALUE;
            int sum = 0;
            for (int j = i; j < Math.min(n, i + 3); j++) {
                sum += stoneValue[j];
                res = Math.max(res, sum - dp[j + 1]);
            }
            dp[i] = res;
        }
        return dp[0] > 0 ? "Alice" : dp[0] < 0 ? "Bob" : "Tie";
    }
}
