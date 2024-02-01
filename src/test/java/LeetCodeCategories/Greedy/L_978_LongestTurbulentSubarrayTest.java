package LeetCodeCategories.Greedy;

import org.junit.Test;

import static LeetCodeCategories.Greedy.L_978_LongestTurbulentSubarray.maxTurbulenceSize;
import static org.junit.Assert.assertEquals;

public class L_978_LongestTurbulentSubarrayTest {

    @Test
    public void firstTest() {
        int[] input = new int[] {100};
        assertEquals(1,maxTurbulenceSize(input));
    }

    @Test
    public void secondTest() {
        int[] input = new int[] {4,8,12,16};
        assertEquals(2,maxTurbulenceSize(input));
    }

    @Test
    public void thirdTest() {
        int[] input = new int[] {9,4,2,10,7,8,8,1,9};
        assertEquals(5,maxTurbulenceSize(input));
    }
}