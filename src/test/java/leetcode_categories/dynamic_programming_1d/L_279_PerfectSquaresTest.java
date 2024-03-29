package leetcode_categories.dynamic_programming_1d;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_279_PerfectSquaresTest {

    L_279_PerfectSquares myClass = new L_279_PerfectSquares();

    @Test
    public void firstTest() {
        assertEquals(3, myClass.numSquares(12));
    }

    @Test
    public void secondTest() {
        assertEquals(2, myClass.numSquares(13));
    }
}