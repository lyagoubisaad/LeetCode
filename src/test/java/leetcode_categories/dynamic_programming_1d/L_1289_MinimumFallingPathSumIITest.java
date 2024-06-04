package leetcode_categories.dynamic_programming_1d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.*;

public class L_1289_MinimumFallingPathSumIITest {

    L_1289_MinimumFallingPathSumII myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L_1289_MinimumFallingPathSumII();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [[1,2,3],[4,5,6],[7,8,9]]
                [[7]]
                [[-37,51,-36,34,-22],[82,4,30,14,38],[-68,-52,-92,65,-85],[-49,-3,-77,8,-19],[-60,-71,-21,-62,-73]]                                                              
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[][] grid = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        //When
        int actual = myClass.minFallingPathSum(grid);
        //Then
        assertEquals(13, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[][] grid = new int[][] {{7}};
        //When
        int actual = myClass.minFallingPathSum(grid);
        //Then
        assertEquals(7, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[][] grid = new int[][] {
                {-37,51,-36,34,-22},
                {82,4,30,14,38},
                {-68,-52,-92,65,-85},
                {-49,-3,-77,8,-19},
                {-60,-71,-21,-62,-73}
        };
        //When
        int actual = myClass.minFallingPathSum(grid);
        //Then
        assertEquals(-268, actual);
    }

}