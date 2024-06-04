package leetcode_categories.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L424LongestRepeatingCharacterReplacementTest {

    L424LongestRepeatingCharacterReplacement myClass;

    @BeforeEach
    void setUp() {
        myClass = new L424LongestRepeatingCharacterReplacement();
    }

    @Test
    public void testFirst() {
        //When
        int actual = myClass.characterReplacement("AABABBA", 1);
        //Then
        assertEquals(4, actual);
    }

    @Test
    public void testSecond() {
        //When
        int actual = myClass.characterReplacement("BBBB", 1);
        //Then
        assertEquals(4, actual);
    }


    @Test
    public void testThird() {
        //When
        int actual = myClass.characterReplacement("SDSSMESSTR", 2);
        //Then
        assertEquals(6, actual);
    }

    @Test
    public void testForth() {
        //When
        int actual = myClass.characterReplacement("BAAAB", 2);
        //Then
        assertEquals(5, actual);
    }

}