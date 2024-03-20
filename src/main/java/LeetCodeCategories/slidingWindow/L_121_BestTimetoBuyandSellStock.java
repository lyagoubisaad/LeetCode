package LeetCodeCategories.slidingWindow;

public class L_121_BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
                max = Integer.MIN_VALUE;
            } else if (price > max) {
                max = price;
                maxProfit = Math.max(maxProfit, max - min);
            }
        }
        return maxProfit;
    }
}
