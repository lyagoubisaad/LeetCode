package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L1866NumberWaysRearrangeSticksWithKSticksVisibleTest {
    L1866NumberWaysRearrangeSticksWithKSticksVisible myClass;
    @BeforeEach
    void setUp() {
        myClass = new L1866NumberWaysRearrangeSticksWithKSticksVisible();
    }

    @Test
    public void testFirst() {
        //Given & When
        int result = myClass.rearrangeSticks(3,2);
        //Then
        assertEquals(3, result);
    }

    @Test
    public void testSecond() {
        //Given & When
        int result = myClass.rearrangeSticks(5,5);
        //Then
        assertEquals(1, result);
    }

    @Test
    public void testThird() {
        //Given & When
        int result = myClass.rearrangeSticks(20,11);
        //Then
        assertEquals(647427950, result);
    }

}