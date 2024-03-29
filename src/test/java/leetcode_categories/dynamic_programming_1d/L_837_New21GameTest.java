package leetcode_categories.dynamic_programming_1d;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_837_New21GameTest {

    L_837_New21Game myClass = new L_837_New21Game();

    @Test
    public void firstTest() {
        assertEquals(1d, myClass.new21Game(10,1,10));
    }

    @Test
    public void secondTest() {
        assertEquals(0.6d, myClass.new21Game(6,1,10));
    }

    @Test
    public void thirdTest() {
        assertEquals(0.73278d, myClass.new21Game(21,17,10));
    }
}