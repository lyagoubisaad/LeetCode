package LeetCodeCategories.Backtracking;

import org.junit.Test;

import java.util.List;

import static LeetCodeCategories.Backtracking.L_46_Permutations.permute;
import static org.junit.Assert.assertEquals;

public class L_46_PermutationsTest {

    @Test
    public void firstTest() {
        int[] nums = new int[] {1,2,3};
        assertEquals(List.of(
                List.of(1,2,3), List.of(1,3,2), List.of(2,1,3), List.of(2,3,1), List.of(3,1,2), List.of(3,2,1)
        ), permute(nums));
    }

}