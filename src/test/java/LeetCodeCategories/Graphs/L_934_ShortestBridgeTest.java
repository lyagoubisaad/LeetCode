package LeetCodeCategories.Graphs;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_934_ShortestBridgeTest {

    L_934_ShortestBridge myClass = new L_934_ShortestBridge();
    
    @Test
    public void firstTest() {
        int[][] grid = new int[][] {
                {0,1},{1,0}
        };
        assertEquals(1, myClass.shortestBridge(grid));
    }

    @Test
    public void secondTest() {
        int[][] grid = new int[][] {
                {0,1,0},{0,0,0},{0,0,1}
        };
        assertEquals(2, myClass.shortestBridge(grid));
    }

    @Test
    public void thirdTest() {
        int[][] grid = new int[][] {
                {1,1,1,1,1},{1,0,0,0,1}, {1,0,1,0,1}, {1,0,0,0,1}, {1,1,1,1,1}
        };
        assertEquals(1, myClass.shortestBridge(grid));
    }

}