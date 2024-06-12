package leetcode_categories.dynamic_programming_1d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L152MaximumProductSubarrayTest {

    L152MaximumProductSubarray myClass;

    @BeforeEach
    void setUp() {
        myClass = new L152MaximumProductSubarray();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {2,3,-2,4};
        //When & Then
        assertEquals(6, myClass.maxProduct(nums));
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {-2,0,-1};
        //When & Then
        assertEquals(0, myClass.maxProduct(nums));
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        //When & Then
        assertEquals(1000000000, myClass.maxProduct(nums));
    }


}