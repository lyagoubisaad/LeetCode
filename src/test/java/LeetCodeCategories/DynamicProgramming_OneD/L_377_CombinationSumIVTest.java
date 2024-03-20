package leetCodeCategories.DynamicProgramming_OneD;

import LeetCodeCategories.DynamicProgramming_OneD.L_377_CombinationSumIV;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L_377_CombinationSumIVTest {

    L_377_CombinationSumIV myClass = new L_377_CombinationSumIV();

    @Test
    public void firstTest() {
        assertEquals(7, myClass.combinationSum4(new int[] {1,2,3}, 4));
    }

    @Test
    public void secondTest() {
        assertEquals(0, myClass.combinationSum4(new int[] {9}, 3));
    }

}