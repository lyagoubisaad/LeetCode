package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L1963MinimumNumberSwapsMakeStringBalancedTest {

    L1963MinimumNumberSwapsMakeStringBalanced myClass;

    @BeforeEach
    void setUp() {
        myClass = new L1963MinimumNumberSwapsMakeStringBalanced();
    }

    @Test
    public void testFirst() {
        //When
        int actual = myClass.minSwaps("][][");
        //Then
        assertEquals(1, actual);
    }

    @Test
    public void testSecond() {
        //When
        int actual = myClass.minSwaps("]]][[[");
        //Then
        assertEquals(2, actual);
    }

    @Test
    public void testThird() {
        //When
        int actual = myClass.minSwaps("[]");
        //Then
        assertEquals(0, actual);
    }

}