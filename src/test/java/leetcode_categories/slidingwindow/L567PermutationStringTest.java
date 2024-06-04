package leetcode_categories.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L567PermutationStringTest {

    L567PermutationString myClass;

    @BeforeEach
    void setUp() {
        myClass = new L567PermutationString();
    }

    @Test
    public void testFirst() {
        //When
        boolean actual = myClass.checkInclusion("ab", "eidbaooo");
        //Then
        assertTrue(actual);
    }

    @Test
    public void testSecond() {
        //When
        boolean actual = myClass.checkInclusion("adc", "dcda");
        //Then
        assertTrue(actual);
    }

    @Test
    public void testThird() {
        //When
        boolean actual = myClass.checkInclusion("abc", "ccccbbbbaaaa");
        //Then
        assertFalse(actual);
    }

}