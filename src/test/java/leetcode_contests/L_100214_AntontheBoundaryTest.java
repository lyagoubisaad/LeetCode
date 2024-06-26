package leetcode_contests;

import org.junit.Test;

import static leetcode_contests.L_100214_AntontheBoundary.returnToBoundaryCount;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_100214_AntontheBoundaryTest {

    @Test
    public void firstTest() {
        int[] nums = new int[] {2,3,-5};
        assertEquals(1, returnToBoundaryCount(nums));
    }

    @Test
    public void secondTest() {
        int[] nums = new int[] {3,2,-3,-4};
        assertEquals(0, returnToBoundaryCount(nums));
    }
}