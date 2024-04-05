package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L10RegularExpressionMatchingTest {

    L10RegularExpressionMatching myClass;

    @BeforeEach
    void setUp() {
        myClass = new L10RegularExpressionMatching();
    }

    @Test
    public void testFirst() {
        //When
        boolean actual = myClass.isMatch("aa","a");
        //Then
        assertFalse(actual);
    }

    @Test
    public void testSecond() {
        //When
        boolean actual = myClass.isMatch("aa","a*");
        //Then
        assertTrue(actual);
    }

    @Test
    public void testThird() {
        //When
        boolean actual = myClass.isMatch("ab",".*");
        //Then
        assertTrue(actual);
    }

    @Test
    public void testForth() {
        //When
        boolean actual = myClass.isMatch("aab","c*a*b");
        //Then
        assertTrue(actual);
    }

    @Test
    public void testFifth() {
        //When
        boolean actual = myClass.isMatch("mississippi","mis*is*ip*.");
        //Then
        assertTrue(actual);
    }

    @Test
    public void testSixth() {
        //When
        boolean actual = myClass.isMatch("ab","a*b");
        //Then
        assertTrue(actual);
    }

}