package leetcode_categories.dynamic_programming_1d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L647PalindromicSubstringsTest {

    L647PalindromicSubstrings myClass;

    @BeforeEach
    void setUp() {
        myClass = new L647PalindromicSubstrings();
    }

    @Test
    public void testFirst() {
        assertEquals(3, myClass.countSubstrings("abc"));
    }

    @Test
    public void testSecond() {
        assertEquals(6, myClass.countSubstrings("aaa"));
    }

}