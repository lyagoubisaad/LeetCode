package leetcode_contests.c_31_03_24;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.*;

public class L_100240_MinimizeManhattanDistancesTest {

    L_100240_MinimizeManhattanDistances myClass = new L_100240_MinimizeManhattanDistances();
    Convertor convertor = new Convertor();

    @Disabled
    @Test
    void convert() {
        convertor.convert("[[3,10],[5,15],[10,2],[4,4]]");
        convertor.convert("[[1,1],[1,1],[1,1]]");
        convertor.convert("[[3,2],[3,9],[7,10],[4,4],[8,10],[2,7]]");
        convertor.convert("[[9,8],[1,8],[3,1],[9,1],[7,7],[3,6]]");
    }

    @Test
    public void testFirst() {
        //Given
        int[][] points = new int[][] {{3,10},{5,15},{10,2},{4,4}};
        //When
        int result = myClass.minimumDistance(points);
        //Then
        assertEquals(12, result);
    }

    @Test
    public void testSecond() {
        //Given
        int[][] points = new int[][] {{1,1},{1,1},{1,1}};
        //When
        int result = myClass.minimumDistance(points);
        //Then
        assertEquals(0, result);
    }

    @Test
    public void testThird() {
        //Given
        int[][] points = new int[][] {{3,2},{3,9},{7,10},{4,4},{8,10},{2,7}};
        //When
        int result = myClass.minimumDistance(points);
        //Then
        assertEquals(10, result);
    }

    @Test
    public void testForth() {
        //Given
        int[][] points = new int[][] {{9,8},{1,8},{3,1},{9,1},{7,7},{3,6}};
        //When
        int result = myClass.minimumDistance(points);
        //Then
        assertEquals(13, result);
    }

}