package LeetCodeCategories.Graphs;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L_2477_MinimumFuelCostReportCapitalTest {

    L_2477_MinimumFuelCostReportCapital myClass = new L_2477_MinimumFuelCostReportCapital();

    @Test
    public void firstTest() {
        int[][] roads = new int[][] {{0,1}, {0,2}, {0,3}};
        assertEquals(3, myClass.minimumFuelCost(roads, 5));
    }

    @Test
    public void secondTest() {
        int[][] roads = new int[][] {{3,1}, {3,2}, {1,0}, {0,4}, {0,5}, {4,6}};
        assertEquals(7, myClass.minimumFuelCost(roads, 2));
    }

    @Test
    public void thirdTest() {
        int[][] roads = new int[][] {};
        assertEquals(0, myClass.minimumFuelCost(roads, 1));
    }

    @Test
    public void forthTest() {
        int[][] roads = new int[][] {{0,1},{2,1},{3,2},{4,2},{4,5},{6,0},{5,7},{8,4},{9,2}};
        assertEquals(16, myClass.minimumFuelCost(roads, 2));
    }

    @Test
    public void fifthTest() {
        int[][] roads = new int[][] {{0,1},{1,2},{1,3},{4,2},{5,3},{6,3},{6,7},{8,6},{9,0},{5,10},{11,9},{12,5},{5,13},{8,14},{11,15},{8,16},{17,0},{18,7}};
        assertEquals(19, myClass.minimumFuelCost(roads, 13));
    }

    @Test
    public void sixthTest() {
        int[][] roads = new int[][] {{0,1},{2,0},{3,2},{3,4},{2,5},{6,4},{6,7},{8,2},{9,0},{3,10},{1,11},{5,12},{6,13},{6,14},{15,10},{16,0},{14,17},{12,18},{19,6},{20,17},{14,21},{12,22},{23,20},{24,11},{25,15},{26,7},{17,27},{15,28},{5,29},{30,8},{31,1},{32,12},{33,29},{34,5},{35,27},{36,30},{37,31},{20,38},{16,39},{40,6},{28,41},{42,30},{43,2},{12,44},{45,17},{5,46},{47,6}};
        assertEquals(48, myClass.minimumFuelCost(roads, 26));
    }

    @Test
    public void seventhTest() {
        int[][] roads = new int[][] {{1,0},{1,2},{3,2},{4,1},{0,5},{1,6},{6,7},{0,8},{9,2},{0,10},{5,11},{12,1},{8,13},{14,1},{15,9},{4,16},{3,17},{18,10},{19,13},{20,0},{7,21},{8,22},{23,9},{24,8},{25,20},{21,26},{23,27}};
        assertEquals(30, myClass.minimumFuelCost(roads, 6));
    }

}