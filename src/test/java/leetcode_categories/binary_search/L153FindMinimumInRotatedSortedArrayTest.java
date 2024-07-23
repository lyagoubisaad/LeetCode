package leetcode_categories.binary_search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L153FindMinimumInRotatedSortedArrayTest {
    L153FindMinimumInRotatedSortedArray myClass;
    @BeforeEach
    void setUp() {
        myClass = new L153FindMinimumInRotatedSortedArray();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {3,4,5,1,2};
        //When
        int result = myClass.findMin(nums);
        //Then
        assertEquals(1, result);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {4,5,6,7,0,1,2};
        //When
        int result = myClass.findMin(nums);
        //Then
        assertEquals(0, result);
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {11,13,15,17};
        //When
        int result = myClass.findMin(nums);
        //Then
        assertEquals(11, result);
    }

}