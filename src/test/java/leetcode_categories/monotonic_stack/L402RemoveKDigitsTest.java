package leetcode_categories.monotonic_stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L402RemoveKDigitsTest {

    L402RemoveKDigits myClass;

    @BeforeEach
    void setUp() {
        myClass = new L402RemoveKDigits();
    }

    @Test
    public void testFirst() {
        //Given
        String num = "1432219";
        String expected = "1219";
        //When
        String actual = myClass.removeKdigits(num, 3);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        //Given
        String num = "10200";
        String expected = "200";
        //When
        String actual = myClass.removeKdigits(num, 1);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testThird() {
        //Given
        String num = "10001";
        String expected = "0";
        //When
        String actual = myClass.removeKdigits(num, 4);
        //Then
        assertEquals(expected, actual);
    }

}