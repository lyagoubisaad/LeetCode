package leetCodeCategories.slidingWindow;

import LeetCodeCategories.slidingWindow.L_3_LongestSubstringWithoutRepeatingCharacters;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L_3_LongestSubstringWithoutRepeatingCharactersTest {

    L_3_LongestSubstringWithoutRepeatingCharacters myClass = new L_3_LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void firstTest() {
        assertEquals(3, myClass.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void secondTest() {
        assertEquals(1, myClass.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void thirdTest() {
        assertEquals(3, myClass.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void forthTest() {
        assertEquals(2, myClass.lengthOfLongestSubstring("aab"));
    }

    @Test
    public void fifthTest() {
        assertEquals(3, myClass.lengthOfLongestSubstring("dvdf"));
    }



}