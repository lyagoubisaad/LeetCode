package leetcode_contests.c_31_03_24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_100263_HarshadNumberTest {

    L_100263_HarshadNumber myClass = new L_100263_HarshadNumber();

    @Test
    void firstTest() {
        assertEquals(9, myClass.sumOfTheDigitsOfHarshadNumber(18));
    }

    @Test
    void secondTest() {
        assertEquals(-1, myClass.sumOfTheDigitsOfHarshadNumber(23));
    }

    @Test
    void thirdTest() {
        assertEquals(-1, myClass.sumOfTheDigitsOfHarshadNumber(19));
    }

    @Test
    void forthTest() {
        assertEquals(1, myClass.sumOfTheDigitsOfHarshadNumber(10));
    }


}