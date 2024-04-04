package leetcode_categories.dynamic_programming_2d;

import java.util.ArrayDeque;
import java.util.Queue;

public class L_1049_Last_Stone_Weight_II {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        int n = stones.length;
        boolean[][] dp = new boolean[n + 1][sum / 2 + 1];
        dp[0][0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum / 2; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= stones[i - 1]) {
                    dp[i][j] |= dp[i - 1][j - stones[i - 1]];
                }
            }
        }
        int minWeightDiff = Integer.MAX_VALUE;
        for (int j = 0; j <= sum / 2; j++) {
            if (dp[n][j]) {
                minWeightDiff = Math.min(minWeightDiff, sum - 2 * j);
            }
        }
        return minWeightDiff;
    }
}
