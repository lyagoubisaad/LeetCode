package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TestUtils;

public class L75SortColorsTest {
    L75SortColors myClass;

    @BeforeEach
    void setUp() {
        myClass = new L75SortColors();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int [] {2,0,2,1,1,0};
        int[] expected = new int [] {0,0,1,1,2,2};
        //When
        myClass.sortColors(nums);
        //Then
        TestUtils.assertArrayEquals(expected, nums);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int [] {2,0,1};
        int[] expected = new int [] {0,1,2};
        //When
        myClass.sortColors(nums);
        //Then
        TestUtils.assertArrayEquals(expected, nums);
    }


}