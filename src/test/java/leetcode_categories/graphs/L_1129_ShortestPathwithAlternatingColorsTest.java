package leetcode_categories.graphs;

import org.junit.Test;

import static utils.TestUtils.assertArrayEquals;

public class L_1129_ShortestPathwithAlternatingColorsTest {
    L_1129_ShortestPathwithAlternatingColors myClass = new L_1129_ShortestPathwithAlternatingColors();

    @Test
    public void firstTest() {
        int[][] redEdges = new int[][] { {0,1}, {1,2} };
        int[][] blueEdges = new int[][] {};
        assertArrayEquals(new int[] {0,1,-1}, myClass.shortestAlternatingPaths(3, redEdges, blueEdges));
    }

    @Test
    public void secondTest() {
        int[][] redEdges = new int[][] { {0,1}};
        int[][] blueEdges = new int[][] {{2,1}};
        assertArrayEquals(new int[] {0,1,-1}, myClass.shortestAlternatingPaths(3, redEdges, blueEdges));
    }

    @Test
    public void thirdTest() {
        int[][] redEdges = new int[][] { {0,1}, {1,2}, {2,3}, {3,4}};
        int[][] blueEdges = new int[][] {{1,2}, {2,3}, {3,1}};
        assertArrayEquals(new int[] {0,1,2,3,7}, myClass.shortestAlternatingPaths(5, redEdges, blueEdges));
    }

    @Test
    public void forthTest() {
        int[][] redEdges = new int[][] {{0,1}, {0,2}};
        int[][] blueEdges = new int[][] {{1,0}};
        assertArrayEquals(new int[] {0,1,1}, myClass.shortestAlternatingPaths(3, redEdges, blueEdges));
    }

    @Test
    public void fifthTest() {
        int[][] redEdges = new int[][] {};
        int[][] blueEdges = new int[][] {};
        assertArrayEquals(new int[] {0}, myClass.shortestAlternatingPaths(1, redEdges, blueEdges));
    }

    @Test
    public void sixthTest() {
        int[][] redEdges = new int[][] {{1,4}, {0,3}};
        int[][] blueEdges = new int[][] {{3,1}, {3,4}};
        assertArrayEquals(new int[] {0,2,-1,1,2}, myClass.shortestAlternatingPaths(5, redEdges, blueEdges));
    }

    @Test
    public void seventhTest() {
        int[][] redEdges = new int[][] {{3,2}, {4,1}, {1,4}, {2,4}};
        int[][] blueEdges = new int[][] {{2,3}, {0,4}, {4,3}, {4,4}, {4,0}, {1,0}};
        assertArrayEquals(new int[] {0,2,-1,-1,1}, myClass.shortestAlternatingPaths(5, redEdges, blueEdges));
    }

    @Test
    public void eighthTest() {
        int[][] redEdges = new int[][] {{2,2},{0,1},{0,3},{0,0},{0,4},{2,1},{2,0},{1,4},{3,4}};
        int[][] blueEdges = new int[][] {{1,3},{0,0},{0,3},{4,2},{1,0}};
        assertArrayEquals(new int[] {0,1,2,1,1}, myClass.shortestAlternatingPaths(5, redEdges, blueEdges));
    }

    @Test
    public void ninthTest() {
        int[][] redEdges = new int[][] {{2,2},{0,4},{4,2},{4,3},{2,4},{0,0},{0,1},{2,3},{1,3}};
        int[][] blueEdges = new int[][] {{0,4},{1,0},{1,4},{0,0},{4,0}};
        assertArrayEquals(new int[] {0,1,2,2,1}, myClass.shortestAlternatingPaths(5, redEdges, blueEdges));
    }

    @Test
    public void tenthText() {
        int[][] redEdges = new int[][] {{1,8},{5,7},{1,2},{2,2},{7,4},{7,2},{3,8},{7,0},{1,5},{2,7},{2,3},{6,3},{3,0},{4,8},{7,5},{1,6},{3,7}};
        int[][] blueEdges = new int[][] {{2,1},{1,4},{0,3},{0,5},{1,5},{8,2},{5,8},{2,6},{5,3},{6,7},{4,0},{2,2}};
        assertArrayEquals(new int[] {0,5,3,1,8,1,5,2,2}, myClass.shortestAlternatingPaths(9, redEdges, blueEdges));
    }
}