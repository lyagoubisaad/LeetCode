package leetcode_categories.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L55JumpGameTest {

    L55JumpGame myClass;

    @BeforeEach
    void setUp() {
        myClass = new L55JumpGame();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {2,3,1,1,4};
        //When & Then
        assertTrue(myClass.canJump(nums));
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {3,2,1,0,4};
        //When & Then
        assertFalse(myClass.canJump(nums));
    }

}