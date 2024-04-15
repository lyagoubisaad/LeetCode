package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_64_MinimumPathSumTest {

    L64MinimumPathSum myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L64MinimumPathSum();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("[[1,3,1],[1,5,1],[4,2,1]]");
        convertor.toBracesAndSingleQuotes("[[1,2,3],[4,5,6]]");
        convertor.toBracesAndSingleQuotes("[[5,4,2,9,6,0,3,5,1,4,9,8,4,9,7,5,1],[3,4,9,2,9,9,0,9,7,9,4,7,8,4,4,5,8],[6,1,8,9,8,0,3,7,0,9,8,7,4,9,2,0,1],[4,0,0,5,1,7,4,7,6,4,1,0,1,0,6,2,8],[7,2,0,2,9,3,4,7,0,8,9,5,9,0,1,1,0],[8,2,9,4,9,7,9,3,7,0,3,6,5,3,5,9,6],[8,9,9,2,6,1,2,5,8,3,7,0,4,9,8,8,8],[5,8,5,4,1,5,6,6,3,3,1,8,3,9,6,4,8],[0,2,2,3,0,2,6,7,2,3,7,3,1,5,8,1,3],[4,4,0,2,0,3,8,4,1,3,3,0,7,4,2,9,8],[5,9,0,4,7,5,7,6,0,8,3,0,0,6,6,6,8],[0,7,1,8,3,5,1,8,7,0,2,9,2,2,7,1,5],[1,0,0,0,6,2,0,0,2,2,8,0,9,7,0,8,0],[1,1,7,2,9,6,5,4,8,7,8,5,0,3,8,1,5],[8,9,7,8,1,1,3,0,1,2,9,4,0,1,5,3,1],[9,2,7,4,8,7,3,9,2,4,2,2,7,8,2,6,7],[3,8,1,6,0,4,8,9,8,0,2,5,3,5,5,7,5],[1,8,2,5,7,7,1,9,9,8,9,2,4,9,5,4,0],[3,4,4,1,5,3,3,8,8,6,3,5,3,8,7,1,3]]");
    }

    @Test
    public void testFirst() {
        //Given
        int[][] grid = new int[][] {{1,3,1},{1,5,1},{4,2,1}};
        //When
        int actual = myClass.minPathSum(grid);
        //Then
        assertEquals(7, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[][] grid = new int[][] {{1,2,3},{4,5,6}};
        //When
        int actual = myClass.minPathSum(grid);
        //Then
        assertEquals(12, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[][] grid = new int[][] {{5,4,2,9,6,0,3,5,1,4,9,8,4,9,7,5,1},{3,4,9,2,9,9,0,9,7,9,4,7,8,4,4,5,8},{6,1,8,9,8,0,3,7,0,9,8,7,4,9,2,0,1},{4,0,0,5,1,7,4,7,6,4,1,0,1,0,6,2,8},{7,2,0,2,9,3,4,7,0,8,9,5,9,0,1,1,0},{8,2,9,4,9,7,9,3,7,0,3,6,5,3,5,9,6},{8,9,9,2,6,1,2,5,8,3,7,0,4,9,8,8,8},{5,8,5,4,1,5,6,6,3,3,1,8,3,9,6,4,8},{0,2,2,3,0,2,6,7,2,3,7,3,1,5,8,1,3},{4,4,0,2,0,3,8,4,1,3,3,0,7,4,2,9,8},{5,9,0,4,7,5,7,6,0,8,3,0,0,6,6,6,8},{0,7,1,8,3,5,1,8,7,0,2,9,2,2,7,1,5},{1,0,0,0,6,2,0,0,2,2,8,0,9,7,0,8,0},{1,1,7,2,9,6,5,4,8,7,8,5,0,3,8,1,5},{8,9,7,8,1,1,3,0,1,2,9,4,0,1,5,3,1},{9,2,7,4,8,7,3,9,2,4,2,2,7,8,2,6,7},{3,8,1,6,0,4,8,9,8,0,2,5,3,5,5,7,5},{1,8,2,5,7,7,1,9,9,8,9,2,4,9,5,4,0},{3,4,4,1,5,3,3,8,8,6,3,5,3,8,7,1,3}};
        //When
        int actual = myClass.minPathSum(grid);
        //Then
        assertEquals(82, actual);
    }
}