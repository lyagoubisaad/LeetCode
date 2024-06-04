package leetcode_categories.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L242Valid_AnagramTest {

    L242Valid_Anagram myClass;

    @BeforeEach
    void setUp() {
        myClass = new L242Valid_Anagram();
    }

    @Test
    public void testFirst() {
        assertTrue(myClass.isAnagram("anagram","nagaram"));
    }

    @Test
    public void testSecond() {
        assertFalse(myClass.isAnagram("rat","car"));
    }

}