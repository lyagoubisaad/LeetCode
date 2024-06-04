package leetcode_categories.arrays_hashings;

import leetcode_categories.arrays_hashings.L260SingleNumberIII;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TestUtils;

public class L260SingleNumberIIITest {

    L260SingleNumberIII myClass;

    @BeforeEach
    void setUp() {
        myClass = new L260SingleNumberIII();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {1,2,1,3,2,5};
        int[] expected = new int[] {3,5};
        //When
        int[] result = myClass.singleNumber(nums);
        //Then
        TestUtils.assertArrayEquals(expected, result);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {-1,0};
        int[] expected = new int[] {-1,0};
        //When
        int[] result = myClass.singleNumber(nums);
        //Then
        TestUtils.assertArrayEquals(expected, result);
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {-1,0};
        int[] expected = new int[] {-1,0};
        //When
        int[] result = myClass.singleNumber(nums);
        //Then
        TestUtils.assertArrayEquals(expected, result);
    }

}