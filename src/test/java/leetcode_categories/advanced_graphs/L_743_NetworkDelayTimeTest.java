package leetcode_categories.advanced_graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.*;

public class L_743_NetworkDelayTimeTest {

    L_743_NetworkDelayTime myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L_743_NetworkDelayTime();
    }

    @Disabled
    @Test
    void convert() {
        convertor = new Convertor();
        convertor.convert("[[2,1,1],[2,3,1],[3,4,1]]");
        convertor.convert("[[1,2,1]]");
        convertor.convert("[[1,2,1]]");
        convertor.convert("[[1,2,1],[2,1,3]]");
        convertor.convert("[[1,2,1],[2,3,2],[1,3,1]]");
    }

    @Test
    public void testFirst() {
        //Given
        int[][] times = new int[][] {{2,1,1},{2,3,1},{3,4,1}};
        //When
        int expected = myClass.networkDelayTime(times, 4,2);
        //Then
        assertEquals(2,expected);
    }

    @Test
    public void testSecond() {
        //Given
        int[][] times = new int[][] {{1,2,1}};
        //When
        int expected = myClass.networkDelayTime(times, 2,1);
        //Then
        assertEquals(1,expected);
    }

    @Test
    public void testThird() {
        //Given
        int[][] times = new int[][] {{1,2,1}};
        //When
        int expected = myClass.networkDelayTime(times, 2,2);
        //Then
        assertEquals(-1,expected);
    }

    @Test
    public void forthTest() {
        //Given
        int[][] times = new int[][] {{1,2,1},{2,1,3}};
        //When
        int expected = myClass.networkDelayTime(times, 2,2);
        //Then
        assertEquals(3,expected);
    }

    @Test
    public void fifthTest() {
        //Given
        int[][] times = new int[][] {{1,2,1},{2,3,2},{1,3,1}};
        //When
        int expected = myClass.networkDelayTime(times, 3,2);
        //Then
        assertEquals(-1,expected);
    }

}