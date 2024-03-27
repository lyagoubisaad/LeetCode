package LeetCodeCategories.Backtracking;

import org.junit.Test;

import static LeetCodeCategories.Backtracking.L_698_PartitionKEqualSumSubsets.canPartitionKSubsets;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_698_PartitionKEqualSumSubsetsTest {
    @Test
    public void firstTest() {
        int[] nums = new int[] {4,3,2,3,5,2,1};
        int k = 4;
        assertEquals(true, canPartitionKSubsets(nums, k));
    }

    @Test
    public void secondTest() {
        int[] nums = new int[] {1,2,3,4};
        int k = 3;
        assertEquals(false, canPartitionKSubsets(nums, k));
    }

}