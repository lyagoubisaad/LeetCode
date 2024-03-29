package leetcode_categories.dynamic_programming_1d;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_343_IntegerBreakTest {

    L_343_IntegerBreak myClass = new L_343_IntegerBreak();

    @Test
    public void firstTest() {
        assertEquals(1, myClass.integerBreak(2));
    }

    @Test
    public void secondTest() {
        assertEquals(36, myClass.integerBreak(10));
    }

    @Test
    public void thirdTest() {
        assertEquals(12, myClass.integerBreak(7));
    }

}