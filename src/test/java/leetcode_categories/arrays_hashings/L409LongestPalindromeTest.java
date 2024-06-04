package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L409LongestPalindromeTest {

    L409LongestPalindrome myClass;

    @BeforeEach
    void setUp() {
        myClass = new L409LongestPalindrome();
    }

    @Test
    public void testFirst() {
        //Given & When
        int result = myClass.longestPalindrome("abccccdd");
        //Then
        assertEquals(7, result);
    }

    @Test
    public void testSecond() {
        //Given & When
        int result = myClass.longestPalindrome("a");
        //Then
        assertEquals(1, result);
    }

}