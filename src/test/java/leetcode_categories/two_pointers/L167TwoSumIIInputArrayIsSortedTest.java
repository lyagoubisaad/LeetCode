package leetcode_categories.two_pointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TestUtils;

public class L167TwoSumIIInputArrayIsSortedTest {

    L167TwoSumIIInputArrayIsSorted myClass;

    @BeforeEach
    void setUp() {
        myClass = new L167TwoSumIIInputArrayIsSorted();
    }

    @Test
    public void testFirst() {
        //Given
        int target = 9;
        int[] numbers = new int[] {2,7,11,15};
        int[] expected = new int[] {1,2};
        //When
        int[] actual = myClass.twoSum(numbers, target);
        //Then
        TestUtils.assertArrayEquals(actual, expected);
    }

    @Test
    public void testSecond() {
        //Given
        int target = 6;
        int[] numbers = new int[] {2,3,4};
        int[] expected = new int[] {1,3};
        //When
        int[] actual = myClass.twoSum(numbers, target);
        //Then
        TestUtils.assertArrayEquals(actual, expected);
    }

    @Test
    public void testThird() {
        //Given
        int target = -1;
        int[] numbers = new int[] {-1,0};
        int[] expected = new int[] {1,2};
        //When
        int[] actual = myClass.twoSum(numbers, target);
        //Then
        TestUtils.assertArrayEquals(actual, expected);
    }

}