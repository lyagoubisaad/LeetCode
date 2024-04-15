package leetcode_categories.graphs_advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_1631_PathWithMinimumEffortTest {

    L_1631_PathWithMinimumEffort myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        convertor = new Convertor();
        myClass = new L_1631_PathWithMinimumEffort();
    }

    @Test
    @Disabled("This method is not a test, just a utility method")
    void convert() {
        convertor.toBracesAndSingleQuotes("[[4,3,4,10,5,5,9,2],[10,8,2,10,9,7,5,6],[5,8,10,10,10,7,4,2],[5,1,3,1,1,3,1,9],[6,4,10,6,10,9,4,6]]");
    }

    @Test
    void testFirst() {
        //Given
        int[][] heights = new int[][] {{1,2,2},{3,8,2},{5,3,5}};
        //When
        int result = myClass.minimumEffortPath(heights);
        //Then
        assertEquals(2, result);
    }

    @Test
    public void testTwo() {
        //Given
        int[][] heights = new int[][] {{1,2,3},{3,8,4},{5,3,5}};
        //When
        int result = myClass.minimumEffortPath(heights);
        //Then
        assertEquals(1, result);
    }

    @Test
    public void testThree() {
        //Given
        int[][] heights = new int[][] {{1,2,1,1,1},{1,2,1,2,1},{1,2,1,2,1},{1,2,1,2,1},{1,1,1,2,1}};
        //When
        int result = myClass.minimumEffortPath(heights);
        //Then
        assertEquals(0, result);
    }

    @Test
    public void tesTForth() {
        //Given
        int[][] heights = new int[][] {{3}};
        //When
        int result = myClass.minimumEffortPath(heights);
        //Then
        assertEquals(0, result);
    }

    @Test
    public void tesTFifth() {
        //Given
        int[][] heights = new int[][] {{4,3,4,10,5,5,9,2},{10,8,2,10,9,7,5,6},{5,8,10,10,10,7,4,2},{5,1,3,1,1,3,1,9},{6,4,10,6,10,9,4,6}};
        //When
        int result = myClass.minimumEffortPath(heights);
        //Then
        assertEquals(5, result);
    }
}