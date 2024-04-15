package leetcode_categories.graphs_advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        convertor.toBracesAndSingleQuotes("[[0,0],[2,2],[3,10],[5,2],[7,0]]");
        convertor.toBracesAndSingleQuotes("[[3,12],[-2,5],[-4,1]]");
        convertor.toBracesAndSingleQuotes("[[2,-3],[-17,-8],[13,8],[-17,-15]]");
        convertor.toBracesAndSingleQuotes("[[0,0],[1,1],[1,0],[-1,1]]");
        convertor.toBracesAndSingleQuotes("[[-14,-14],[-18,5],[18,-10],[18,18],[10,-2]]");
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