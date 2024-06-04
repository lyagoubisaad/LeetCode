package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class L217ContainsDuplicateTest {

    L217ContainsDuplicate myClass;

    @BeforeEach
    void setUp() {
        myClass = new L217ContainsDuplicate();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {1,2,3,1};
        //When & Then
        assertTrue(myClass.containsDuplicate(nums));
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {1,2,3,4};
        //When & Then
        assertFalse(myClass.containsDuplicate(nums));
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {1,1,1,3,3,4,3,2,4,2};
        //When & Then
        assertTrue(myClass.containsDuplicate(nums));
    }

}