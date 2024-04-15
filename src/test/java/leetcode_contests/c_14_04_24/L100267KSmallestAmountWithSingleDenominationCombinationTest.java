package leetcode_contests.c_14_04_24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L100267KSmallestAmountWithSingleDenominationCombinationTest {
    L100267KSmallestAmountWithSingleDenominationCombination myClass = new L100267KSmallestAmountWithSingleDenominationCombination();

    @Test
    public void testFirst() {
        //Given
        int[] coins = new int[] {3,6,9};
        //When
        long actual = myClass.findKthSmallest(coins, 3);
        //Then
        assertEquals(9, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] coins = new int[] {5};
        //When
        long actual = myClass.findKthSmallest(coins, 7);
        //Then
        assertEquals(35, actual);
    }

    @Test
    public void testForth() {
        //Given
        int[] coins = new int[] {7,2};
        //When
        long actual = myClass.findKthSmallest(coins, 2);
        //Then
        assertEquals(4, actual);
    }

    @Test
    public void testFifth() {
        //Given
        int[] coins = new int[] {6,3};
        //When
        long actual = myClass.findKthSmallest(coins, 8);
        //Then
        assertEquals(24, actual);
    }

    @Test
    public void testSixth() {
        //Given
        int[] coins = new int[] {4,1,7,6};
        //When
        long actual = myClass.findKthSmallest(coins, 7);
        //Then
        assertEquals(7, actual);
    }

    @Test
    public void testSeventh() {
        //Given
        int[] coins = new int[] {10,7,9};
        //When
        long actual = myClass.findKthSmallest(coins, 3);
        //Then
        assertEquals(10, actual);
    }

}