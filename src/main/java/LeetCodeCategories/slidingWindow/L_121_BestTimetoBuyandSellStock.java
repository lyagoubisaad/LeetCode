package LeetCodeCategories.slidingWindow;

public class L_121_BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int min = prices[0];
        int diff = 0;
        for (int i=1;i<prices.length;i++) {
            if(prices[i] < min) {
                max = Integer.MIN_VALUE;
                min = prices[i];
            } else {
                if(prices[i] > max) {
                    max = prices[i];
                    diff = Math.max(diff, max-min);
                }
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{2, 4, 1};
        System.out.println(maxProfit(prices));
    }

}
