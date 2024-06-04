package leetcode_categories.dynamic_programming_1d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2370LongestIdealSubsequenceTest {

    L2370LongestIdealSubsequence myClass;

    @BeforeEach
    void setUp() {
        myClass = new L2370LongestIdealSubsequence();
    }

    @Test
    public void testFirst() {
        //When
        int actual = myClass.longestIdealString("acfgbd", 2);
        //Then
        assertEquals(4, actual);
    }

    @Test
    public void testSecond() {
        //When
        int actual = myClass.longestIdealString("abcd", 3);
        //Then
        assertEquals(4, actual);
    }

    @Test
    public void testThird() {
        //When
        int actual = myClass.longestIdealString("pvjcci", 4);
        //Then
        assertEquals(2, actual);
    }

}