package LeetCodeCategories.Graphs;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L_1020_NumberEnclavesTest {

    L_1020_NumberEnclaves myClass = new L_1020_NumberEnclaves();

    @Test
    public void firstTest() {
        int[][] grid = new int[][] {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        assertEquals(3, myClass.numEnclaves(grid));
    }

    @Test
    public void secondTest() {
        int[][] grid = new int[][] {{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};
        assertEquals(0, myClass.numEnclaves(grid));
    }

}