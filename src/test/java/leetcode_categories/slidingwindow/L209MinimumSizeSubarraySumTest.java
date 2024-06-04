package leetcode_categories.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L209MinimumSizeSubarraySumTest {

    L209MinimumSizeSubarraySum myClass;

    @BeforeEach
    void setUp() {
        myClass = new L209MinimumSizeSubarraySum();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {2,3,1,2,4,3};
        //When
        int actual = myClass.minSubArrayLen(7, nums);
        //Then
        assertEquals(2, actual);
    }

}