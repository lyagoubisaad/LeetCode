package leetcode_categories.dynamic_programming_1d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L122BestTimeBuySellStockIITest {

    L122BestTimeBuySellStockII myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L122BestTimeBuySellStockII();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [7,1,5,3,6,4]
                [1,2,3,4,5]
                [7,6,4,3,1]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[] prices = new int[] {7,1,5,3,6,4};
        //When
        int actual = myClass.maxProfit(prices);
        //Then
        assertEquals(7, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] prices = new int[] {1,2,3,4,5};
        //When
        int actual = myClass.maxProfit(prices);
        //Then
        assertEquals(4, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] prices = new int[] {7,6,4,3,1};
        //When
        int actual = myClass.maxProfit(prices);
        //Then
        assertEquals(0, actual);
    }




}