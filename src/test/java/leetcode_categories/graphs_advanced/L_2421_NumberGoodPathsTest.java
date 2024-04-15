package leetcode_categories.graphs_advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_2421_NumberGoodPathsTest {

    L_2421_NumberGoodPaths myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L_2421_NumberGoodPaths();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("[1,3,2,1,3]");
        convertor.toBracesAndSingleQuotes("[[0,1],[0,2],[2,3],[2,4]]");
        convertor.toBracesAndSingleQuotes("[1,1,2,2,3]");
        convertor.toBracesAndSingleQuotes("[[0,1],[1,2],[2,3],[2,4]]");
        convertor.toBracesAndSingleQuotes("[1]");
        convertor.toBracesAndSingleQuotes("[]");
    }
    
    @Test
    public void testFirst() {
        //Given
        int[] vals = new int[] {1,3,2,1,3};
        int[][] edges = new int[][] {{0,1},{0,2},{2,3},{2,4}};
        //When
        int result = myClass.numberOfGoodPaths(vals, edges);
        //Then
        assertEquals(6,result);
    }


    @Test
    public void testSecond() {
        //Given
        int[] vals = new int[] {1,1,2,2,3};
        int[][] edges = new int[][] {{0,1},{1,2},{2,3},{2,4}};
        //When
        int result = myClass.numberOfGoodPaths(vals, edges);
        //Then
        assertEquals(7,result);
    }


    @Test
    public void testThird() {
        //Given
        int[] vals = new int[] {1};
        int[][] edges = new int[][] {};
        //When
        int result = myClass.numberOfGoodPaths(vals, edges);
        //Then
        assertEquals(1,result);
    }

}