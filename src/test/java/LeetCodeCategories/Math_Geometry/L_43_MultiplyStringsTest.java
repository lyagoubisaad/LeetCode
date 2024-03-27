package LeetCodeCategories.Math_Geometry;

import org.junit.Test;

import static LeetCodeCategories.Math_Geometry.L_43_MultiplyStrings.multiply;
import static org.junit.Assert.assertEquals;

public class L_43_MultiplyStringsTest {
    @Test
    public void firstTest() {
        String num1= "123456789";
        String num2= "987654321";
        assertEquals("121932631112635269", multiply(num1, num2));
    }
}