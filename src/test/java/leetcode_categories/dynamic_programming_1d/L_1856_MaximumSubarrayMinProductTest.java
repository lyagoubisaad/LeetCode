package leetcode_categories.dynamic_programming_1d;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_1856_MaximumSubarrayMinProductTest {

    L_1856_MaximumSubarrayMinProduct myClass = new L_1856_MaximumSubarrayMinProduct();

    @Test
    public void firstTest() {
        int[] nums = new int[] {1,2,3,2};
        assertEquals(14, myClass.maxSumMinProduct(nums));
    }

    @Test
    public void secondTest() {
        int[] nums = new int[] {2,3,3,1,2};
        assertEquals(18, myClass.maxSumMinProduct(nums));
    }

    @Test
    public void thirdTest() {
        int[] nums = new int[] {3,1,5,6,4,2};
        assertEquals(60, myClass.maxSumMinProduct(nums));
    }

    @Test
    public void forthTest() {
        int[] nums = new int[] {1,1,3,2,2,2,1,5,1,5};
        assertEquals(25, myClass.maxSumMinProduct(nums));
    }

}