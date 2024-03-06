package LeetCodeCategories.Graphs;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L_1254_NumberClosedIslandsTest {

    L_1254_NumberClosedIslands myClass = new L_1254_NumberClosedIslands();

    @Test
    public void firstTest() {
        int[][] grid = new int[][] {{1,1,1,1,1,1,1,0},{1,0,0,0,0,1,1,0},{1,0,1,0,1,1,1,0},{1,0,0,0,0,1,0,1},{1,1,1,1,1,1,1,0}};
        assertEquals(2, myClass.closedIsland(grid));
    }

    @Test
    public void secondTest() {
        int[][] grid = new int[][] {{0,0,1,0,0},{0,1,0,1,0},{0,1,1,1,0}};
        assertEquals(1, myClass.closedIsland(grid));
    }

    @Test
    public void thirdTest() {
        int[][] grid = new int[][] {{1,1,1,1,1,1,1},{1,0,0,0,0,0,1},{1,0,1,1,1,0,1},{1,0,1,0,1,0,1},{1,0,1,1,1,0,1},{1,0,0,0,0,0,1},{1,1,1,1,1,1,1}};
        assertEquals(2, myClass.closedIsland(grid));
    }
}