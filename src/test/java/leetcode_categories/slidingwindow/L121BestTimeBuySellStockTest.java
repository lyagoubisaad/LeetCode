package leetcode_categories.slidingwindow;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L121BestTimeBuySellStockTest {

    L121BestTimeBuySellStock myClass = new L121BestTimeBuySellStock();

    @Test
    public void firstTest() {
        int[] prices = new int[] {7,1,5,3,6,4};
        assertEquals(5, myClass.maxProfit(prices));
    }

    @Test
    public void secondTest() {
        int[] prices = new int[] {7,6,4,3,1};
        assertEquals(0, myClass.maxProfit(prices));
    }

    @Test
    public void thirdTest() {
        int[] prices = new int[] {3,2,6,5,0,3};
        assertEquals(4, myClass.maxProfit(prices));
    }


}