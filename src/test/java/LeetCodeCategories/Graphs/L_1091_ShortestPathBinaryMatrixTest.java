package LeetCodeCategories.Graphs;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L_1091_ShortestPathBinaryMatrixTest {

    L_1091_ShortestPathBinaryMatrix myClass = new L_1091_ShortestPathBinaryMatrix();

    @Test
    public void firstTest() {
        int[][] grid = new int[][] {
                {0,1},{1,0}
        };
        assertEquals(2, myClass.shortestPathBinaryMatrix(grid));
    }

    @Test
    public void secondTest() {
        int[][] grid = new int[][] {
                {0,0,0}, {1,1,0}, {1,1,0}
        };
        assertEquals(4, myClass.shortestPathBinaryMatrix(grid));
    }

    @Test
    public void thirdTest() {
        int[][] grid = new int[][] {
                {1,0,0}, {1,1,0}, {1,1,0}
        };
        assertEquals(-1, myClass.shortestPathBinaryMatrix(grid));
    }

    @Test
    public void forthTest() {
        int[][] grid = new int[][] {
                {0,0,0}, {1,1,0}, {1,1,1}
        };
        assertEquals(-1, myClass.shortestPathBinaryMatrix(grid));
    }

    @Test
    public void fifthTest() {
        int[][] grid = new int[][] {{0}};
        assertEquals(1, myClass.shortestPathBinaryMatrix(grid));
    }

}