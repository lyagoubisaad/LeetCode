package LeetCodeCategories.Graphs;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L_785_IsGraphBipartiteTest {

    L_785_IsGraphBipartite myClass = new L_785_IsGraphBipartite();

    @Test
    public void firstTest() {
        int[][] graph = new int[][] {{1,2,3},{0,2},{0,1,3},{0,2}};
        assertEquals(false, myClass.isBipartite(graph));
    }

    @Test
    public void secondTest() {
        int[][] graph = new int[][] {{1,3},{0,2},{1,3},{0,2}};
        assertEquals(true, myClass.isBipartite(graph));
    }

    @Test
    public void thirdTest() {
        int[][] graph = new int[][] {{4,1},{0,2},{1,3},{2,4}, {3,0}};
        assertEquals(false, myClass.isBipartite(graph));
    }

    @Test
    public void forthTest() {
        int[][] graph = new int[][]  {{},{2,4,6},{1,4,8,9},{7,8},{1,2,8,9},{6,9},{1,5,7,8,9},{3,6,9},{2,3,4,6,9},{2,4,5,6,7,8}};
        assertEquals(false, myClass.isBipartite(graph));
    }

    @Test
    public void fifthTest() {
        int[][] graph = new int[][]  {{1},{0,3},{3},{1,2}};
        assertEquals(true, myClass.isBipartite(graph));
    }

}