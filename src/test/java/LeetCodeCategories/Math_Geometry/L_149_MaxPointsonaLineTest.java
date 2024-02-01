package LeetCodeCategories.Math_Geometry;

import org.junit.Test;

import static LeetCodeCategories.Math_Geometry.L_149_MaxPointsonaLine.maxPoints;
import static org.junit.Assert.*;

public class L_149_MaxPointsonaLineTest {

    @Test
    public void firstTest() {
        int[][] points = new int[][] {{1,1}, {2,2}, {3,3}};
        assertEquals(3, maxPoints(points));
    }

    @Test
    public void secondTest() {
        int[][] points = new int[][] {{0,0}};
        assertEquals(1, maxPoints(points));
    }

    @Test
    public void thirdTest() {
        int[][] points = new int[][] {{0,0}, {2,2}, {-1,-1}};
        assertEquals(3, maxPoints(points));
    }

}