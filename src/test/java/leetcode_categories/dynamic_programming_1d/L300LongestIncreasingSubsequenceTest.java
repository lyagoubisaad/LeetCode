package leetcode_categories.dynamic_programming_1d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L300LongestIncreasingSubsequenceTest {

    L300LongestIncreasingSubsequence myClass;

    @BeforeEach
    void setUp() {
        myClass = new L300LongestIncreasingSubsequence();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {10,9,2,5,3,7,101,18};
        //When & Then
        assertEquals(4, myClass.lengthOfLIS(nums));
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {0,1,0,3,2,3};
        //When & Then
        assertEquals(4, myClass.lengthOfLIS(nums));
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {7,7,7,7,7,7,7};
        //When & Then
        assertEquals(1, myClass.lengthOfLIS(nums));
    }


}