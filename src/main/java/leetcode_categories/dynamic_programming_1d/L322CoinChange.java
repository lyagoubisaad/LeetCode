package leetcode_categories.dynamic_programming_1d;

import java.util.Arrays;

public class L322CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for (int i=1;i<=amount;i++) {
            for (int coin: coins) {
                if(coin > i) continue;
                dp[i] = Math.min(dp[i], dp[i-coin]+1);
            }
        }
        return dp[amount] == amount+1 ? -1: dp[amount];
    }
}
