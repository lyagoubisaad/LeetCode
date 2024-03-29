package leetcode_categories.dynamic_programming_1d;

public class L_122_BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i=1;i<prices.length;i++) {
            if(prices[i] > prices[i-1]) {
                profit += prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}