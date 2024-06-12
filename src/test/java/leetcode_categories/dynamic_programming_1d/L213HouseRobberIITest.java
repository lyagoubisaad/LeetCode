package leetcode_categories.dynamic_programming_1d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L213HouseRobberIITest {

    L213HouseRobberII myClass;

    @BeforeEach
    void setUp() {
        myClass = new L213HouseRobberII();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {2,3,2};
        //When & Then
        assertEquals(3, myClass.rob(nums));
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {1,2,3,1};
        //When & Then
        assertEquals(4, myClass.rob(nums));
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {1,2,3};
        //When & Then
        assertEquals(3, myClass.rob(nums));
    }

    @Test
    public void testForth() {
        //Given
        int[] nums = new int[] {1};
        //When & Then
        assertEquals(1, myClass.rob(nums));
    }

    @Test
    public void testFifth() {
        //Given
        int[] nums = new int[] {200,3,140,20,10};
        //When & Then
        assertEquals(340, myClass.rob(nums));

    }


}