package leetcode_categories.prefix_sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class L523ContinuousSubarraySumTest {

    L523ContinuousSubarraySum myClass;

    @BeforeEach
    void setUp() {
        myClass = new L523ContinuousSubarraySum();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {23,2,4,6,7};
        //When
        boolean actual = myClass.checkSubarraySum(nums, 6);
        //Then
        assertTrue(actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {23,2,6,4,7};
        //When
        boolean actual = myClass.checkSubarraySum(nums, 6);
        //Then
        assertTrue(actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {23,2,6,4,7};
        //When
        boolean actual = myClass.checkSubarraySum(nums, 13);
        //Then
        assertFalse(actual);
    }


    @Test
    public void testForth() {
        //Given
        int[] nums = new int[] {23,2,4,6,6};
        //When
        boolean actual = myClass.checkSubarraySum(nums, 7);
        //Then
        assertTrue(actual);
    }

    @Test
    public void testFifth() {
        //Given
        int[] nums = new int[] {5,0,0,0};
        //When
        boolean actual = myClass.checkSubarraySum(nums, 3);
        //Then
        assertTrue(actual);
    }
}