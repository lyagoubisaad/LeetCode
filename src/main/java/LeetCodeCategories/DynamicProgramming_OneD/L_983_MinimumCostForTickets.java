package LeetCodeCategories.DynamicProgramming_OneD;

import java.util.Arrays;

public class L_983_MinimumCostForTickets {
    public int mincostTickets(int[] days, int[] costs) {
        int[][] prices = new int[costs.length][2];
        prices[0][0] = 1;
        prices[1][0] = 7;
        prices[2][0] = 30;
        for (int i=0;i<costs.length;i++) {
            prices[i][1] = costs[i];
        }
        int maxDay = days[days.length-1];
        int[] dp = new int[maxDay+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        int i=0;
        for (int day=1;day<=maxDay;day++) {
            if(day < days[i]) {
                dp[day] = dp[day-1];
            } else {
                i++;
                for (int[] price: prices) {
                    dp[day] = Math.min(dp[Math.max(0,day-price[0])]+price[1], dp[day]);
                }
            }

        }
        return dp[maxDay];
    }
}
