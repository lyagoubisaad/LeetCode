package leetcode_categories.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class L53MaximumSubarrayTest {

    L53MaximumSubarray myClass;

    @BeforeEach
    void setUp() {
        myClass = new L53MaximumSubarray();
    }
    @Test
    public void firstTest() {
        int[] nums = new int[] {1,2,-1,-2,2,1,-2,1,4,-5,4};
       assertEquals(6, myClass.maxSubArray(nums));
    }

    @Test
    public void secondTest() {
        int[] nums = new int[] {1};
        assertEquals(1, myClass.maxSubArray(nums));
    }

    @Test
    public void thirdTest() {
        int[] nums = new int[] {5,4,-1,7,8};
        assertEquals(23, myClass.maxSubArray(nums));
    }
}