package leetCodeCategories.slidingWindow;

import LeetCodeCategories.slidingWindow.L_121_BestTimetoBuyandSellStock;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L_121_BestTimetoBuyandSellStockTest {

    L_121_BestTimetoBuyandSellStock myClass = new L_121_BestTimetoBuyandSellStock();

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