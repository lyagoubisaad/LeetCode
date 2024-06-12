package leetcode_categories.graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L417PacificAtlanticWaterFlowTest {

    L417PacificAtlanticWaterFlow myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L417PacificAtlanticWaterFlow();
        convertor  = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
                [[1]]
                [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
                [[0,0]]     
                [[1,1],[1,1],[1,1]]        
                [[3,3,3,3,3,3],[3,0,3,3,0,3],[3,3,3,3,3,3]]               
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[][] heights = new int[][] {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        List<List<Integer>> expected = List.of(List.of(0,4), List.of(1,3), List.of(1,4), List.of(2,2), List.of(3,0), List.of(3,1), List.of(4,0));
        //When
        List<List<Integer>> result = myClass.pacificAtlantic(heights);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void testSecond() {
        //Given
        int[][] heights = new int[][] {{1}};
        List<List<Integer>> expected = List.of(List.of(0,0));
        //When
        List<List<Integer>> result = myClass.pacificAtlantic(heights);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void testThird() {
        //Given
        int[][] heights = new int[][] {{1,1},{1,1},{1,1}};
        List<List<Integer>> expected = List.of(List.of(0,0), List.of(0,1), List.of(1,0), List.of(1,1), List.of(2,0), List.of(2,1));
        //When
        List<List<Integer>> result = myClass.pacificAtlantic(heights);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void testForth() {
        //Given
        int[][] heights = new int[][] {{1,1},{1,1},{1,1}};
        List<List<Integer>> expected = List.of(List.of(0,0), List.of(0,1), List.of(1,0), List.of(1,1), List.of(2,0), List.of(2,1));
        //When
        List<List<Integer>> result = myClass.pacificAtlantic(heights);
        //Then
        assertEquals(expected, result);
    }

}