package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L128LongestConsecutiveSequenceTest {

    L128LongestConsecutiveSequence myClass;

    @BeforeEach
    void setUp() {
        myClass = new L128LongestConsecutiveSequence();
    }

    @Test
    public void testFirst() {
        //When
        int actual = myClass.longestConsecutive(new int[] {100,4,200,1,3,2});
        //Then
        assertEquals(4, actual);
    }

    @Test
    public void testSecond() {
        //When
        int actual = myClass.longestConsecutive(new int[] {0,3,7,2,5,8,4,6,0,1});
        //Then
        assertEquals(9, actual);
    }

    @Test
    public void testThird() {
        //When
        int actual = myClass.longestConsecutive(new int[] {1,2,0,1});
        //Then
        assertEquals(3, actual);
    }

}