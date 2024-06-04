package leetcode_categories.slidingwindow;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L3LongestSubstringWithoutRepeatingCharactersTest {

    L3LongestSubstringWithoutRepeatingCharacters myClass = new L3LongestSubstringWithoutRepeatingCharacters();

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