package leetcode_categories.dynamic_programming_1d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L322CoinChangeTest {

    L322CoinChange myClass;

    @BeforeEach
    void setUp() {
        myClass = new L322CoinChange();
    }

    @Test
    public void testFirst() {
        //Given
        int[] coins = new int[] {1,2,5};
        //When & Then
        assertEquals(3, myClass.coinChange(coins, 11));
    }

    @Test
    public void testSecond() {
        //Given
        int[] coins = new int[] {2};
        //When & Then
        assertEquals(-1, myClass.coinChange(coins, 3));
    }

    @Test
    public void testThird() {
        //Given
        int[] coins = new int[] {1};
        //When & Then
        assertEquals(0, myClass.coinChange(coins, 0));
    }

}