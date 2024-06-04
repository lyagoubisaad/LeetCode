package leetcode_categories.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class L76MinimumWindowSubstringTest {

    L76MinimumWindowSubstring myClass;

    @BeforeEach
    void setUp() {
        myClass = new L76MinimumWindowSubstring();
    }
    @Test
    public void firstTest() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        assertEquals("BANC", myClass.minWindow(s, t));
    }

    @Test
    public void secondTest() {
        String s = "a";
        String t = "a";
        assertEquals("a", myClass.minWindow(s, t));
    }

    @Test
    public void thirdTest() {
        String s = "a";
        String t = "aa";
        assertEquals("", myClass.minWindow(s, t));
    }
}
