package LeetCodeCategories.slidingWindow;

import org.junit.Test;

import static Utils.TestUtils.assertArrayEquals;
import static LeetCodeCategories.slidingWindow.L_239_SlidingWindowMaximum.maxSlidingWindow;

public class L_239_SlidingWindowMaximumTest {

    @Test
    public void firstTest() {
        int[] nums = new int[] {1,3,-1,-3,5,3,6,7};
        int k=3;
        assertArrayEquals(maxSlidingWindow(nums, k), new int[] {3,3,5,5,6,7});
    }



    @Test
    public void secondTest() {
        int[] nums = new int[] {1};
        int k=1;
        assertArrayEquals(maxSlidingWindow(nums, k), new int[] {1});
    }
}
