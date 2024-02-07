package LeetCodeCategories.Backtracking;

import org.junit.Test;

import static LeetCodeCategories.Backtracking.L_1849_SplittingAStringIntoDescendingConsecutiveValues.splitString;
import static org.junit.jupiter.api.Assertions.*;

public class L_1849_SplittingAStringIntoDescendingConsecutiveValuesTest {

    @Test
    public void firstTest() {
        assertEquals(false, splitString("1234"));
    }

    @Test
    public void secondTest() {
        assertEquals(true, splitString("050043"));
    }

    @Test
    public void thirdTest() {
        assertEquals(false, splitString("9080701"));
    }

    @Test
    public void forthTest() {
        assertEquals(false, splitString("3202872336"));
    }

    @Test
    public void fifthTest() {
        assertEquals(false, splitString("427920473282"));
    }

    @Test
    public void sixthTest() {
        assertEquals(true, splitString("10"));
    }

    @Test
    public void seventhTest() {
        assertEquals(true, splitString("20000000000000000001"));
    }

    @Test
    public void eightTest() {
        assertEquals(false, splitString("64424509442147483647"));
    }

    @Test
    public void nineTest() {
        assertEquals(true, splitString("109"));
    }
}