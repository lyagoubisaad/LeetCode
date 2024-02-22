package LeetCodeCategories.Graphs;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L_1162_AsFarfromLandPossibleTest {

    L_1162_AsFarfromLandPossible myClass = new L_1162_AsFarfromLandPossible();

    @Test
    public void firstTest() {
        int[][] grid = new int[][] {{1,0,1}, {0,0,0}, {1,0,1}};
        assertEquals(2, myClass.maxDistance(grid));
    }

    @Test
    public void secondTest() {
        int[][] grid = new int[][] {{1,0,0}, {0,0,0}, {0,0,0}};
        assertEquals(4, myClass.maxDistance(grid));
    }

}