package leetcode_categories.backtracking;

import org.junit.Test;

import java.util.List;

import static leetcode_categories.backtracking.L_47_PermutationsII.permuteUnique;
import static org.junit.Assert.assertEquals;

public class L_47_PermutationsIITest {

    @Test
    public void firstTest() {
        int[] nums = new int[] {1,1,2};
        List<List<Integer>> result = List.of(
                List.of(1,1,2), List.of(1,2,1), List.of(2,1,1)
        );
        assertEquals(result, permuteUnique(nums));
    }

}