package leetcode_categories.dynamic_programming_1d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L5LongestPalindromicSubstringTest {

    L5LongestPalindromicSubstring myClass;

    @BeforeEach
    void setUp() {
        myClass = new L5LongestPalindromicSubstring();
    }

    @Test
    public void testFirst() {
        assertEquals("bab", myClass.longestPalindrome("babad"));
    }

    @Test
    public void testSecond() {
        assertEquals("bb", myClass.longestPalindrome("cbbd"));
    }

}