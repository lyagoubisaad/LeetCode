package leetcode_categories.dynamic_programming_1d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class L139WordBreakTest {

    L139WordBreak myClass;

    @BeforeEach
    void setUp() {
        myClass = new L139WordBreak();
    }

    @Test
    public void testFirst() {
        assertTrue(myClass.wordBreak("leetcode", List.of("leet","code")));
    }

    @Test
    public void testSecond() {
        assertTrue(myClass.wordBreak("applepenapple", List.of("apple","pen")));
    }

    @Test
    public void testThird() {
        assertFalse(myClass.wordBreak("catsandog", List.of("cats","dog","sand","and","cat")));
    }

}