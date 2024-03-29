package leetcode_categories.dynamic_programming_2d;

import java.util.HashMap;
import java.util.Map;

public class L_309_BestTimetoBuyandSellStockwithCooldown {
    public int maxProfit(int[] prices) {
        Map<String, Integer> store = new HashMap<>();
        return helper(prices, 0, true, store);
    }

    private int helper(int[] prices, int start, boolean canBuy, Map<String, Integer> store) {
        if (start >= prices.length) return 0;
        String key = start + "-" + canBuy;
        if(store.containsKey(key)) {
            return store.get(key);
        }
        int canBuySell = Integer.MIN_VALUE;
        int cooldown = helper(prices, start + 1, canBuy, store);
        if (canBuy) {
            //can buy
            canBuySell = helper(prices, start + 1, !canBuy, store) - prices[start];
        } else {
            //can sell
            canBuySell = helper(prices, start + 2, !canBuy, store) + prices[start];
        }
        store.put(key, Math.max(canBuySell, cooldown));
        return store.get(key);
    }

    public static void main(String[] args) {
        int result = new L_309_BestTimetoBuyandSellStockwithCooldown().maxProfit(new int[]{2, 1, 2, 0, 1});
        System.out.println(result);
    }

}
