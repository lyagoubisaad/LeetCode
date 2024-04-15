package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_63_UniquePathsIITest {

    L63UniquePathsII myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L63UniquePathsII();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("[[0,0,0],[0,1,0],[0,0,0]]");
        convertor.toBracesAndSingleQuotes("[[0,1],[0,0]]");
        convertor.toBracesAndSingleQuotes("[[0,0],[0,1]]");
        convertor.toBracesAndSingleQuotes("[[0,0],[1,1],[0,0]]");
    }

    @Test
    public void testFirst() {
        //Given
        int[][] obstacleGrid = new int[][] {{0,0,0},{0,1,0},{0,0,0}};
        //When
        int actual = myClass.uniquePathsWithObstacles(obstacleGrid);
        //Then
        assertEquals(2, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[][] obstacleGrid = new int[][] {{0,1},{0,0}};
        //When
        int actual = myClass.uniquePathsWithObstacles(obstacleGrid);
        //Then
        assertEquals(1, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[][] obstacleGrid = new int[][] {{0,0},{0,1}};
        //When
        int actual = myClass.uniquePathsWithObstacles(obstacleGrid);
        //Then
        assertEquals(0, actual);
    }

    @Test
    public void testForth() {
        //Given
        int[][] obstacleGrid = new int[][] {{0,0},{1,1},{0,0}};
        //When
        int actual = myClass.uniquePathsWithObstacles(obstacleGrid);
        //Then
        assertEquals(0, actual);
    }


}