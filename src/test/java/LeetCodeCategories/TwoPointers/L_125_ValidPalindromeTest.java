package leetCodeCategories.TwoPointers;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L_125_ValidPalindromeTest {

    L_125_ValidPalindrome myClass = new L_125_ValidPalindrome();

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