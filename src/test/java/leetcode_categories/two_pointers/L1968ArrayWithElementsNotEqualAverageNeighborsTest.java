package leetcode_categories.two_pointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TestUtils;

import static org.junit.jupiter.api.Assertions.*;

public class L1968ArrayWithElementsNotEqualAverageNeighborsTest {

    L1968ArrayWithElementsNotEqualAverageNeighbors myClass;

    @BeforeEach
    void setUp() {
        myClass = new L1968ArrayWithElementsNotEqualAverageNeighbors();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {1,2,3,4,5};
        int[] expected = new int[] {1,2,4,5,3};
        //When
        int[] actual = myClass.rearrangeArray(nums);
        //Then
        TestUtils.assertArrayEquals(expected, actual);
    }

}