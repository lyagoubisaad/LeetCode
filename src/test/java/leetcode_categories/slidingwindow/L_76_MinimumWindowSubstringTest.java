package leetcode_categories.slidingwindow;

import org.junit.Test;

import static leetcode_categories.slidingwindow.L_76_MinimumWindowSubstring.minWindow;
import static org.junit.Assert.assertEquals;

public class L_76_MinimumWindowSubstringTest {
    @Test
    public void firstTest() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        assertEquals("BANC", minWindow(s, t));
    }

    @Test
    public void secondTest() {
        String s = "a";
        String t = "a";
        assertEquals("a", minWindow(s, t));
    }

    @Test
    public void thirdTest() {
        String s = "a";
        String t = "aa";
        assertEquals("", minWindow(s, t));
    }
}
