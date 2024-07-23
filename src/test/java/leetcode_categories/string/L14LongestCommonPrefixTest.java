package leetcode_categories.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L14LongestCommonPrefixTest {

    L14LongestCommonPrefix myClass;

    @BeforeEach
    void setUp() {
        myClass = new L14LongestCommonPrefix();
    }

    @Test
    public void testFirst() {
        //Given
        String[] strs = new String[] {"flower","flow","flight"};
        //When
        String actual = myClass.longestCommonPrefix(strs);
        //Then
        assertEquals("fl", actual);
    }

    @Test
    public void testSecond() {
        //Given
        String[] strs = new String[] {"dog","racecar","car"};
        //When
        String actual = myClass.longestCommonPrefix(strs);
        //Then
        assertEquals("", actual);
    }

}