package leetcode_categories.greedy;

import org.junit.Test;

import static leetcode_categories.greedy.L_918_Maximum_Sum_Circular_Subarray.maxSubarraySumCircular;
import static org.junit.Assert.assertEquals;

public class L_918_Maximum_Sum_Circular_SubarrayTest {

    @Test
    public void firstTest() {
        int[] input = new int[] {1,-2,3,-2};
        assertEquals(3, maxSubarraySumCircular(input));
    }

    @Test
    public void secondTest() {
        int[] input = new int[] {5,-3,5};
        assertEquals(10, maxSubarraySumCircular(input));
    }

    @Test
    public void thirdTest() {
        int[] input = new int[] {-3,-2,-3};
        assertEquals(-2, maxSubarraySumCircular(input));
    }

    @Test
    public void forthTest() {
        int[] input = new int[] {3,1,3,2,6};
        assertEquals(15, maxSubarraySumCircular(input));
    }
}