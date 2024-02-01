package LeetCodeCategories.Greedy;

import org.junit.Test;

import static LeetCodeCategories.Greedy.L_2439_MinimizeMaximumOfArray.minimizeArrayValue;
import static org.junit.Assert.assertEquals;

public class L_2439_MinimizeMaximumOfArrayTest {
    @Test
    public void firstTest() {
        int[] nums = new int[] {3,7,1,6};
        assertEquals(5, minimizeArrayValue(nums));
    }

    @Test
    public void secondTest() {
        int[] nums = new int[] {10,1};
        assertEquals(10, minimizeArrayValue(nums));
    }

    @Test
    public void thirdTest() {
        int[] nums = new int[] {13,13,20,0,8,9,9};
        assertEquals(16, minimizeArrayValue(nums));
    }

    @Test
    public void forthTest() {
        int[] nums = new int[] {6,9,3,8,14};
        assertEquals(8, minimizeArrayValue(nums));
    }

}