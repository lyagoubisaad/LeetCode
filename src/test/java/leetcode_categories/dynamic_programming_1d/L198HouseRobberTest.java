package leetcode_categories.dynamic_programming_1d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L198HouseRobberTest {

    L198HouseRobber myClass;

    @BeforeEach
    void setUp() {
        myClass = new L198HouseRobber();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {1,2,3,1};
        //When & Then
        assertEquals(4, myClass.rob(nums));
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {2,7,9,3,1};
        //When & Then
        assertEquals(12, myClass.rob(nums));
    }

}