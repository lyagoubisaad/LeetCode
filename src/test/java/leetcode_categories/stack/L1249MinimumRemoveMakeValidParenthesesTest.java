package leetcode_categories.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class L1249MinimumRemoveMakeValidParenthesesTest {

    L1249MinimumRemoveMakeValidParentheses myClass;

    @BeforeEach
    void setUp() {
        myClass = new L1249MinimumRemoveMakeValidParentheses();
    }


    @Test
    void testFirst() {
        //Given & When
        String actual = myClass.minRemoveToMakeValid("lee(t(c)o)de)");
        //Then
        assertEquals("lee(t(c)o)de", actual);
    }

    @Test
    void testSecond() {
        //Given & When
        String actual = myClass.minRemoveToMakeValid("a)b(c)d");
        //Then
        assertEquals("ab(c)d", actual);
    }

    @Test
    void testThird() {
        //Given & When
        String actual = myClass.minRemoveToMakeValid("))((");
        //Then
        assertEquals("", actual);
    }
}