package leetcode_categories.advanced_graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.*;

public class L_1584_Min_CostConnectAllPointsTest {

    L_1584_Min_CostConnectAllPoints myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L_1584_Min_CostConnectAllPoints();
        convertor = new Convertor();
    }

    @Test
    @Disabled
    void convert() {
        convertor.convert("[[0,0],[2,2],[3,10],[5,2],[7,0]]");
        convertor.convert("[[3,12],[-2,5],[-4,1]]");
        convertor.convert("[[2,-3],[-17,-8],[13,8],[-17,-15]]");
        convertor.convert("[[0,0],[1,1],[1,0],[-1,1]]");
        convertor.convert("[[-14,-14],[-18,5],[18,-10],[18,18],[10,-2]]");
    }

    @Test
    public void testFirst() {
        //Given
        int[][] points = new int[][] {{0,0},{2,2},{3,10},{5,2},{7,0}};
        int expected = 20;
        //When
        int actual = myClass.minCostConnectPoints(points);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[][] points = new int[][] {{3,12},{-2,5},{-4,1}};
        int expected = 18;
        //When
        int actual = myClass.minCostConnectPoints(points);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[][] points = new int[][] {{2,-3},{-17,-8},{13,8},{-17,-15}};
        int expected = 53;
        //When
        int actual = myClass.minCostConnectPoints(points);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testForth() {
        //Given
        int[][] points = new int[][] {{-14,-14},{-18,5},{18,-10},{18,18},{10,-2}};
        int expected = 102;
        //When
        int actual = myClass.minCostConnectPoints(points);
        //Then
        assertEquals(expected, actual);
    }

}