package leetcode_categories.slidingwindow;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static utils.TestUtils.assertArrayEquals;

public class L239SlidingWindowMaximumTest {

    L239SlidingWindowMaximum myClass;

    @BeforeEach
    void setUp() {
        myClass = new L239SlidingWindowMaximum();
    }

    @Test
    public void firstTest() {
        int[] nums = new int[] {1,3,-1,-3,5,3,6,7};
        int k=3;
        assertArrayEquals(new int[] {3,3,5,5,6,7}, myClass.maxSlidingWindow(nums, k));
    }



    @Test
    public void secondTest() {
        int[] nums = new int[] {1};
        int k=1;
        assertArrayEquals(new int[] {1}, myClass.maxSlidingWindow(nums, k));
    }
}
