package leetcode_categories.dynamic_programming_1d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L70ClimbingStairsTest {

    L70ClimbingStairs myClass;

    @BeforeEach
    void setUp() {
        myClass = new L70ClimbingStairs();
    }

    @Test
    public void testFirst() {
        assertEquals(2, myClass.climbStairs(2));
    }

    @Test
    public void testSecond() {
        assertEquals(3, myClass.climbStairs(3));
    }

}