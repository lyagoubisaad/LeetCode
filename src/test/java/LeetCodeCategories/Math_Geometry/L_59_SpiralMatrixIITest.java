package LeetCodeCategories.Math_Geometry;

import org.junit.Test;

import static LeetCodeCategories.Math_Geometry.L_59_SpiralMatrixII.generateMatrix;
import static Utils.TestUtils.assertArrayEquals;

public class L_59_SpiralMatrixIITest {

    @Test
    public void firstTest() {
        int[][] result = new int[][] {{1,2,3}, {8,9,4}, {7,6,5}};
        assertArrayEquals(result, generateMatrix(3));
    }

}