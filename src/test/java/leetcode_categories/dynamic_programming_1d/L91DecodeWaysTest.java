package leetcode_categories.dynamic_programming_1d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L91DecodeWaysTest {

    L91DecodeWays myClass;

    @BeforeEach
    void setUp() {
        myClass = new L91DecodeWays();
    }

    @Test
    public void testFirst() {
        assertEquals(2, myClass.numDecodings("12"));
    }

    @Test
    public void testSecond() {
        assertEquals(3, myClass.numDecodings("226"));
    }

    @Test
    public void testThird() {
        assertEquals(0, myClass.numDecodings("06"));
    }

}