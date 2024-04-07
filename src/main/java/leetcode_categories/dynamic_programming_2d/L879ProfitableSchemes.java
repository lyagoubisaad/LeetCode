package leetcode_categories.dynamic_programming_2d;

public class L879ProfitableSchemes {

    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int[][] dp = new int[n + 1][minProfit + 1];
        dp[0][0] = 1;
        int MOD = (int) 1e9 + 7;

        for (int k = 0; k < group.length; k++) {
            int g = group[k], p = profit[k];
            for (int i = n; i >= g; i--) {
                for (int j = minProfit; j >= 0; j--) {
                    int newProfit = Math.min(j + p, minProfit);
                    dp[i][newProfit] += dp[i - g][j];
                    dp[i][newProfit] %= MOD;
                }
            }
        }

        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += dp[i][minProfit];
            total %= MOD;
        }

        return total;
    }
}
