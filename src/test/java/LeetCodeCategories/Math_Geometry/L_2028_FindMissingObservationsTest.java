package LeetCodeCategories.Math_Geometry;

import org.junit.Test;

import static LeetCodeCategories.Math_Geometry.L_2028_FindMissingObservations.missingRolls;
import static Utils.TestUtils.assertArrayEquals;

public class L_2028_FindMissingObservationsTest {

    @Test
    public void firstTest() {
        int[] rolls = new int[] {3,2,4,3};
        assertArrayEquals(new int[] {6,6}, missingRolls(rolls, 4, 2));
    }

    @Test
    public void secondTest() {
        int[] rolls = new int[] {1,5,6};
        assertArrayEquals(new int[] {2,3,2,2}, missingRolls(rolls, 3, 4));
    }

    @Test
    public void thirdTest() {
        int[] rolls = new int[] {1,2,3,4};
        assertArrayEquals(new int[] {}, missingRolls(rolls, 6, 4));
    }

    @Test
    public void forthTest() {
        int[] rolls = new int[] {6,1,6,2,4,4,5};
        assertArrayEquals(new int[] {}, missingRolls(rolls, 5, 16));
    }



}