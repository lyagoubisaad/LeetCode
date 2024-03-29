package leetcode_categories.dynamic_programming_2d;

public class L_518_CoinChangeII {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for (int coin: coins) {
            for (int i=coin;i<=amount;i++) {
                dp[i] += dp[i-coin];
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int nbrTimes = new L_518_CoinChangeII().change(5, new int[] {1,2,5});
        System.out.println(nbrTimes);
    }
}
