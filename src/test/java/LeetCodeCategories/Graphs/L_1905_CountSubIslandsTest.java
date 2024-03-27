package LeetCodeCategories.Graphs;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_1905_CountSubIslandsTest {
    L_1905_CountSubIslands myClass = new L_1905_CountSubIslands();
    @Test
    public void firstTest() {
        int[][] grid1 = new int[][] {{1,1,1,0,0},{0,1,1,1,1},{0,0,0,0,0},{1,0,0,0,0},{1,1,0,1,1}};
        int[][] grid2 = new int[][] {{1,1,1,0,0},{0,0,1,1,1},{0,1,0,0,0},{1,0,1,1,0},{0,1,0,1,0}};
        assertEquals(3, myClass.countSubIslands(grid1, grid2));
    }
    @Test
    public void secondTest() {
        int[][] grid1 = new int[][] {{1,0,1,0,1},{1,1,1,1,1},{0,0,0,0,0},{1,1,1,1,1},{1,0,1,0,1}};
        int[][] grid2 = new int[][] {{0,0,0,0,0},{1,1,1,1,1},{0,1,0,1,0},{0,1,0,1,0},{1,0,0,0,1}};
        assertEquals(2, myClass.countSubIslands(grid1, grid2));
    }
}