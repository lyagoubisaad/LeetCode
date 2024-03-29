package leetcode_categories.backtracking;

import org.junit.Test;

import java.util.List;

import static leetcode_categories.backtracking.L_78_Subsets.subsets;
import static org.junit.Assert.assertEquals;

public class L_78_SubsetsTest {

    @Test
    public void firstTest() {
        int[] nums = new int[] {1,2,3};
        assertEquals(List.of(
                List.of(), List.of(1),List.of(1,2), List.of(1,3), List.of(2), List.of(2,3), List.of(3), List.of(1,2,3)
                ), subsets(nums)
        );
    }

}