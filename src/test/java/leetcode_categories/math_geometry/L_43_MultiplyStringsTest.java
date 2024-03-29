package leetcode_categories.math_geometry;

import org.junit.Test;

import static leetcode_categories.math_geometry.L_43_MultiplyStrings.multiply;
import static org.junit.Assert.assertEquals;

public class L_43_MultiplyStringsTest {
    @Test
    public void firstTest() {
        String num1= "123456789";
        String num2= "987654321";
        assertEquals("121932631112635269", multiply(num1, num2));
    }
}