package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TestUtils;

import static org.junit.jupiter.api.Assertions.*;

public class L1929ConcatenationArrayTest {

    L1929ConcatenationArray myClass;

    @BeforeEach
    void setUp() {
        myClass = new L1929ConcatenationArray();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {1,2,1};
        int[] expected = new int[] {1,2,1,1,2,1};
        //When
        int[] result = myClass.getConcatenation(nums);
        //Then
        TestUtils.assertArrayEquals(expected, result);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {1,3,2,1};
        int[] expected = new int[] {1,3,2,1,1,3,2,1};
        //When
        int[] result = myClass.getConcatenation(nums);
        //Then
        TestUtils.assertArrayEquals(expected, result);
    }

}