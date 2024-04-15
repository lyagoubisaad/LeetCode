package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class L665NonDecreasingArrayTest {

    L665NonDecreasingArray myClass;

    @BeforeEach
    void setUp() {
        myClass = new L665NonDecreasingArray();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {4,2,3};
        //When
        boolean actual = myClass.checkPossibility(nums);
        //Then
        assertTrue(actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {4,2,1};
        //When
        boolean actual = myClass.checkPossibility(nums);
        //Then
        assertFalse(actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {3,4,2,3};
        //When
        boolean actual = myClass.checkPossibility(nums);
        //Then
        assertFalse(actual);
    }

    @Test
    public void testForth() {
        //Given
        int[] nums = new int[] {-1,4,2,3};
        //When
        boolean actual = myClass.checkPossibility(nums);
        //Then
        assertTrue(actual);
    }

}