package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TestUtils;

public class L1TwoSumTest {

    L1TwoSum myClass;

    @BeforeEach
    void setUp() {
        myClass = new L1TwoSum();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {2,7,11,15};
        int[] expected = new int[] {0,1};
        //When
        int[] result = myClass.twoSum(nums, 9);
        //Then
        TestUtils.assertArrayEquals(expected, result);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {3,2,4};
        int[] expected = new int[] {1,2};
        //When
        int[] result = myClass.twoSum(nums, 6);
        //Then
        TestUtils.assertArrayEquals(expected, result);
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {3,3};
        int[] expected = new int[] {0,1};
        //When
        int[] result = myClass.twoSum(nums, 6);
        //Then
        TestUtils.assertArrayEquals(expected, result);
    }

}