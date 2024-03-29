package leetcode_categories.graphs;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_1466_ReorderRoutesMakeAllPathsLeadCityZeroTest {

    L_1466_ReorderRoutesMakeAllPathsLeadCityZero myClass = new L_1466_ReorderRoutesMakeAllPathsLeadCityZero();

    @Test
    public void firstTest() {
        int[][] connections = new int[][] {{0,1},{1,3},{2,3},{4,0},{4,5}};
        assertEquals(3, myClass.minReorder(6, connections));
    }

    @Test
    public void secondTest() {
        int[][] connections = new int[][] {{1,0},{1,2},{3,2},{3,4}};
        assertEquals(2, myClass.minReorder(5, connections));
    }

    @Test
    public void thirdTest() {
        int[][] connections = new int[][] {{1,0},{2,0}};
        assertEquals(0, myClass.minReorder(3, connections));
    }

}