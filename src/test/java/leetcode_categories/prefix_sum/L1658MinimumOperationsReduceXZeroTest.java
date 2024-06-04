package leetcode_categories.prefix_sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L1658MinimumOperationsReduceXZeroTest {

    L1658MinimumOperationsReduceXZero myClass;

    @BeforeEach
    void setUp() {
        myClass = new L1658MinimumOperationsReduceXZero();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {8828,9581,49,9818,9974,9869,9991,10000,10000,10000,9999,9993,9904,8819,1231,6309};
        //When
        int actual = myClass.minOperations(nums, 134365);
        //Then
        assertEquals(16, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {1,1};
        //When
        int actual = myClass.minOperations(nums, 3);
        //Then
        assertEquals(-1, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {3,2,20,1,1,3};
        //When
        int actual = myClass.minOperations(nums, 10);
        //Then
        assertEquals(5, actual);
    }



}