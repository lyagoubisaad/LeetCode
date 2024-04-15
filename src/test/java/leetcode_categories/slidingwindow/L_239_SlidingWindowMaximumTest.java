package leetcode_categories.slidingwindow;

import org.junit.Test;

import static leetcode_categories.slidingwindow.L_239_SlidingWindowMaximum.maxSlidingWindow;
import static utils.TestUtils.assertArrayEquals;

public class L_239_SlidingWindowMaximumTest {

    @Test
    public void firstTest() {
        int[] nums = new int[] {1,3,-1,-3,5,3,6,7};
        int k=3;
        assertArrayEquals(new int[] {3,3,5,5,6,7}, maxSlidingWindow(nums, k));
    }



    @Test
    public void secondTest() {
        int[] nums = new int[] {1};
        int k=1;
        assertArrayEquals(new int[] {1}, maxSlidingWindow(nums, k));
    }
}
