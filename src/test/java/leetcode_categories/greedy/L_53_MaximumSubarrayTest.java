package leetcode_categories.greedy;

import org.junit.Test;

import static leetcode_categories.greedy.L_53_MaximumSubarray.maxSubArray;
import static org.junit.Assert.assertEquals;

public class L_53_MaximumSubarrayTest {
    @Test
    public void firstTest() {
        int[] nums = new int[] {1,2,-1,-2,2,1,-2,1,4,-5,4};
       assertEquals(6, maxSubArray(nums));
    }

    @Test
    public void secondTest() {
        int[] nums = new int[] {1};
        assertEquals(1, maxSubArray(nums));
    }

    @Test
    public void thirdTest() {
        int[] nums = new int[] {5,4,-1,7,8};
        assertEquals(23, maxSubArray(nums));
    }
}