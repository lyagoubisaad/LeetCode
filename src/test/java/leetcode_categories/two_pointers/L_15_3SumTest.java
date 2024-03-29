package leetcode_categories.two_pointers;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_15_3SumTest {

    L_15_3Sum myClass = new L_15_3Sum();

    @Test
    public void firstTest() {
        int[] nums = new int[] {-1,0,1,2,-1,-4};
        assertEquals(List.of(List.of(-1,-1,2), List.of(-1,0,1)), myClass.threeSum(nums));
    }

    @Test
    public void secondTest() {
        int[] nums = new int[] {0,1,1};
        assertEquals(List.of(), myClass.threeSum(nums));
    }

    @Test
    public void thirdTest() {
        int[] nums = new int[] {0,0,0};
        assertEquals(List.of(List.of(0,0,0)), myClass.threeSum(nums));
    }

    @Test
    public void forthTest() {
        int[] nums = new int[] {0,0,0,0};
        assertEquals(List.of(List.of(0,0,0)), myClass.threeSum(nums));
    }
}