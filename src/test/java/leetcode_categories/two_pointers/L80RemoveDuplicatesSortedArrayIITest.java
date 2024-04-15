package leetcode_categories.two_pointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TestUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L80RemoveDuplicatesSortedArrayIITest {

    L80RemoveDuplicatesSortedArrayII myClass;

    @BeforeEach
    void setUp() {
        myClass = new L80RemoveDuplicatesSortedArrayII();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {1,1,1,2,2,3};
        int[] expectedNums = new int[] {1,1,2,2,3,0};
        int expected = 5;
        //When
        int actual = myClass.removeDuplicates(nums);
        //Then
        assertEquals(expected, actual);
        TestUtils.assertArrayEquals(expectedNums, nums, expected);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {0,0,1,1,1,1,2,3,3};
        int[] expectedNums = new int[] {0,0,1,1,2,3,3,3,3};
        int expected = 7;
        //When
        int actual = myClass.removeDuplicates(nums);
        //Then
        assertEquals(expected, actual);
        TestUtils.assertArrayEquals(expectedNums, nums, expected);
    }

}