package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L392IsSubsequenceTest {

    L392IsSubsequence myClass;

    @BeforeEach
    void setUp() {
        myClass = new L392IsSubsequence();
    }

    @Test
    public void testFirst() {
        assertTrue(myClass.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void testSecond() {
        assertFalse(myClass.isSubsequence("axc", "ahbgdc"));
    }

    @Test
    public void testThird() {
        assertTrue(myClass.isSubsequence("", "ahbgdc"));
    }

}