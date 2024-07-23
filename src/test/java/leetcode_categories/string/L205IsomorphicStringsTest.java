package leetcode_categories.string;

import leetcode_categories.arrays_hashings.L205IsomorphicStrings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L205IsomorphicStringsTest {

    L205IsomorphicStrings myClass;

    @BeforeEach
    void setUp() {
        myClass = new L205IsomorphicStrings();
    }

    @Test
    public void testFirst() {
        assertTrue(myClass.isIsomorphic("egg", "add"));
    }

    @Test
    public void testSecond() {
        assertFalse(myClass.isIsomorphic("foo", "bar"));
    }

    @Test
    public void testThird() {
        assertTrue(myClass.isIsomorphic("paper", "title"));
    }

    @Test
    public void testForth() {
        assertFalse(myClass.isIsomorphic("badc", "baba"));
    }

}