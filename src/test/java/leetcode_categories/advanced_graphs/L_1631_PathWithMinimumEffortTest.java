package leetcode_categories.advanced_graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.*;

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
        convertor.convert("");
    }

    @Test
    void firstTest() {
        //Given
        int[][] heights = new int[][] {{1,2,2},{3,8,2},{5,3,5}};
        //When
        int result = myClass.minimumEffortPath(heights);
        //Then
        assertEquals(2, result);
    }

    @Test
    public void TestTwo() {
        //Given
        int[][] heights = new int[][] {{1,2,3},{3,8,4},{5,3,5}};
        //When
        int result = myClass.minimumEffortPath(heights);
        //Then
        assertEquals(1, result);
    }

    @Test
    public void TestThree() {
        //Given
        int[][] heights = new int[][] {{1,2,1,1,1},{1,2,1,2,1},{1,2,1,2,1},{1,2,1,2,1},{1,1,1,2,1}};
        //When
        int result = myClass.minimumEffortPath(heights);
        //Then
        assertEquals(0, result);
    }
}