package LeetCodeCategories.Math_Geometry;

import org.junit.Test;

import static LeetCodeCategories.Math_Geometry.L_6_ZigzagConversion.convert;
import static org.junit.Assert.assertEquals;

public class L_6_ZigzagConversionTest {

    @Test
    public void firstTest() {
        String s = "PAYPALISHIRING";
        assertEquals("PAHNAPLSIIGYIR", convert(s,3));
    }

    @Test
    public void secondTest() {
        String s = "PAYPALISHIRING";
        assertEquals("PINALSIGYAHRPI", convert(s,4));
    }

    @Test
    public void thirdTest() {
        String s = "A";
        assertEquals("A", convert(s,1));
    }

    @Test
    public void forthTest() {
        String s = "AB";
        assertEquals("AB", convert(s,1));
    }

}