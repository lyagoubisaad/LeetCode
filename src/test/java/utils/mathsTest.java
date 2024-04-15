package utils;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.maths.gcd;

public class mathsTest {

    @Test
    public void firstTest() {
        assertEquals(10, gcd(50,60));
    }

    @Test
    public void secondTest() {
        assertEquals(4, gcd(12,8));
    }

    @Test
    public void thirdTest() {
        assertEquals(25, gcd(75,125));
    }

}