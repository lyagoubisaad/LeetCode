package leetcode_categories.slidingwindow;

public class L121BestTimeBuySellStock {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for (int i=1;i<prices.length;i++) {
            if(prices[i] > min) {
                maxProfit = Math.max(maxProfit, prices[i]-min);
            } else {
                min = prices[i];
            }
        }
        return maxProfit;
    }
}
