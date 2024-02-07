package LeetCodeCategories.Backtracking;

import org.junit.Test;

import static LeetCodeCategories.Backtracking.L_1980_FindUniqueBinaryString.findDifferentBinaryString;
import static org.junit.jupiter.api.Assertions.*;

public class L_1980_FindUniqueBinaryStringTest {

    @Test
    public void firstTest() {
        String[] nums = new String[] {"01","10"};
        assertEquals("11", findDifferentBinaryString(nums));
    }

    @Test
    public void secondTest() {
        String[] nums = new String[] {"00","01"};
        assertEquals("11", findDifferentBinaryString(nums));
    }

    @Test
    public void thirdTest() {
        String[] nums = new String[] {"111","011","001"};
        assertEquals("101", findDifferentBinaryString(nums));
    }


}