package leetcode_categories.math_geometry;

import org.junit.Test;

import static leetcode_categories.math_geometry.L_2028_FindMissingObservations.missingRolls;
import static utils.TestUtils.assertArrayEquals;

public class L_2028_FindMissingObservationsTest {

    @Test
    public void firstTest() {
        int[] rolls = new int[] {3,2,4,3};
        assertArrayEquals(missingRolls(rolls, 4, 2), new int[] {6,6});
    }

    @Test
    public void secondTest() {
        int[] rolls = new int[] {1,5,6};
        assertArrayEquals(missingRolls(rolls, 3, 4), new int[] {2,3,2,2});
    }

    @Test
    public void thirdTest() {
        int[] rolls = new int[] {1,2,3,4};
        assertArrayEquals(missingRolls(rolls, 6, 4), new int[] {});
    }

    @Test
    public void forthTest() {
        int[] rolls = new int[] {6,1,6,2,4,4,5};
        assertArrayEquals(missingRolls(rolls, 5, 16), new int[] {});
    }



}