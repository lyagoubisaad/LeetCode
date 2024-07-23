package leetcode_categories.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L290WordPatternTest {

    L290WordPattern myClass;

    @BeforeEach
    void setUp() {
        myClass = new L290WordPattern();
    }

    @Test
    public void testFirst() {
        assertTrue(myClass.wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    public void testSecond() {
        assertFalse(myClass.wordPattern("abba", "dog cat cat fish"));
    }

    @Test
    public void testThird() {
        assertFalse(myClass.wordPattern("aaaa", "dog cat cat dog"));
    }

    @Test
    public void testForth() {
        assertFalse(myClass.wordPattern("abba", "dog dog dog dog"));
    }

}