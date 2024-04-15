package leetcode_categories.dynamic_programming_1d;

public class L122BestTimeBuySellStockII {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i=1;i<prices.length;i++) {
            if(prices[i] <= prices[i-1]) continue;
            maxProfit += prices[i]-prices[i-1];
        }
        return maxProfit;
    }
}
