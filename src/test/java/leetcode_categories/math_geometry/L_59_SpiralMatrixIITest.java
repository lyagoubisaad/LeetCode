package leetcode_categories.math_geometry;

import org.junit.Test;

import static leetcode_categories.math_geometry.L_59_SpiralMatrixII.generateMatrix;
import static utils.TestUtils.assertArrayEquals;

public class L_59_SpiralMatrixIITest {

    @Test
    public void firstTest() {
        int[][] result = new int[][] {{1,2,3}, {8,9,4}, {7,6,5}};
        assertArrayEquals(result, generateMatrix(3));
    }

}