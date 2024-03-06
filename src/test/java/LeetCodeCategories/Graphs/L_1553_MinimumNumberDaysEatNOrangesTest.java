package LeetCodeCategories.Graphs;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L_1553_MinimumNumberDaysEatNOrangesTest {

    L_1553_MinimumNumberDaysEatNOranges myClass = new L_1553_MinimumNumberDaysEatNOranges();

    @Test
    public void firstTest() {
        assertEquals(4, myClass.minDays(10));
    }

    @Test
    public void secondTest() {
        assertEquals(3, myClass.minDays(6));
    }

    @Test
    public void thirdTest() {
        assertEquals(23, myClass.minDays(9209408));
    }

    @Test
    public void forthTest() {
        assertEquals(29, myClass.minDays(61455274));
    }

}