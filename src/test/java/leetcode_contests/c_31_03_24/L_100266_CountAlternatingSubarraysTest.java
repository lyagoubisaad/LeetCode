package leetcode_contests.c_31_03_24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_100266_CountAlternatingSubarraysTest {

    L_100266_CountAlternatingSubarrays myClass = new L_100266_CountAlternatingSubarrays();

    @Test
    public void testFirst() {
        //Given

        int[] nums = new int[] {0,1,1,1};
        //When
        long result = myClass.countAlternatingSubarrays(nums);
        //Then
        assertEquals(5, result);
    }

    @Test
    public void testSecond() {
        //Given

        int[] nums = new int[] {1,0,1,0};
        //When
        long result = myClass.countAlternatingSubarrays(nums);
        //Then
        assertEquals(10, result);
    }

}