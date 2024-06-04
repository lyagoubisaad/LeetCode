package leetcode_categories.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L20ValidParenthesesTest {

    L20ValidParentheses myClass;

    @BeforeEach
    void setUp() {
        myClass = new L20ValidParentheses();
    }

    @Test
    public void testFirst() {
        assertTrue(myClass.isValid("()"));
    }

    @Test
    public void testSecond() {
        assertTrue(myClass.isValid("()[]{}"));
    }

    @Test
    public void testThird() {
        assertFalse(myClass.isValid("(]"));
    }
}