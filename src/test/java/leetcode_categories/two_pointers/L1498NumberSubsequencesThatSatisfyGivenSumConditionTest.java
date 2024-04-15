package leetcode_categories.two_pointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L1498NumberSubsequencesThatSatisfyGivenSumConditionTest {

    L1498NumberSubsequencesThatSatisfyGivenSumCondition myClass;

    @BeforeEach
    void setUp() {
        myClass = new L1498NumberSubsequencesThatSatisfyGivenSumCondition();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {3,5,6,7};
        //When
        int actual = myClass.numSubseq(nums, 9);
        //Then
        assertEquals(4, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {3,3,6,8};
        //When
        int actual = myClass.numSubseq(nums, 10);
        //Then
        assertEquals(6, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {2,3,3,4,6,7};
        //When
        int actual = myClass.numSubseq(nums, 12);
        //Then
        assertEquals(61, actual);
    }

    @Test
    public void testForth() {
        //Given
        int[] nums = new int[] {7,10,7,3,7,5,4};
        //When
        int actual = myClass.numSubseq(nums, 12);
        //Then
        assertEquals(56, actual);
    }



}