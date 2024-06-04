package leetcode_categories.two_pointers;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_125_ValidPalindromeTest {

    L125ValidPalindrome myClass = new L125ValidPalindrome();

    @Test
    public void firstTest() {
        assertEquals(true, myClass.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void secondTest() {
        assertEquals(false, myClass.isPalindrome("race a car"));
    }

    @Test
    public void thirdTest() {
        assertEquals(true, myClass.isPalindrome(" "));
    }

}