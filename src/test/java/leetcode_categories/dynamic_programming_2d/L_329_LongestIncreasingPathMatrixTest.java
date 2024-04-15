package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_329_LongestIncreasingPathMatrixTest {
    L329LongestIncreasingPathMatrix myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L329LongestIncreasingPathMatrix();
        convertor = new Convertor();
    }
    
    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [[9,9,4],[6,6,8],[2,1,1]]
                [[3,4,5],[3,2,6],[2,2,1]]
                [[1]]
                [[7,8,9],[9,7,6],[7,2,3]]
                """);
    }
    
    @Test
    public void testFirst() {
        //Given
        int[][] matrix = new int[][] {{9,9,4},{6,6,8},{2,1,1}};
        //When
        int actual = myClass.longestIncreasingPath(matrix);
        //Then
        assertEquals(4,actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[][] matrix = new int[][] {{3,4,5},{3,2,6},{2,2,1}};
        //When
        int actual = myClass.longestIncreasingPath(matrix);
        //Then
        assertEquals(4,actual);
    }

    @Test
    public void testThird() {
        //Given
        int[][] matrix = new int[][] {{1}};
        //When
        int actual = myClass.longestIncreasingPath(matrix);
        //Then
        assertEquals(1,actual);
    }

    @Test
    public void testForth() {
        //Given
        int[][] matrix = new int[][] {{7,8,9},{9,7,6},{7,2,3}};
        //When
        int actual = myClass.longestIncreasingPath(matrix);
        //Then
        assertEquals(6,actual);
    }


}