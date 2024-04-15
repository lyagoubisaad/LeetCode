package leetcode_categories.graphs_advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_1579_RemoveMaxNumberEdgesKeepGraphFullyTraversableTest {

    L_1579_RemoveMaxNumberEdgesKeepGraphFullyTraversable myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L_1579_RemoveMaxNumberEdgesKeepGraphFullyTraversable();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("[[3,1,2],[3,2,3],[1,1,3],[1,2,4],[1,1,2],[2,3,4]]");
        convertor.toBracesAndSingleQuotes("[[3,1,2],[3,2,3],[1,1,4],[2,1,4]]");
        convertor.toBracesAndSingleQuotes("[[3,2,3],[1,1,2],[2,3,4]]");
    }

    @Test
    public void testFirst() {
        //Given
        int[][] edges = new int[][] {{3,1,2},{3,2,3},{1,1,3},{1,2,4},{1,1,2},{2,3,4}};
        //When
        int actual = myClass.maxNumEdgesToRemove(4, edges);
        //Then
        assertEquals(2, actual);
    }


    @Test
    public void testSecond() {
        //Given
        int[][] edges = new int[][] {{3,1,2},{3,2,3},{1,1,4},{2,1,4}};
        //When
        int actual = myClass.maxNumEdgesToRemove(4, edges);
        //Then
        assertEquals(0, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[][] edges = new int[][] {{3,2,3},{1,1,2},{2,3,4}};
        //When
        int actual = myClass.maxNumEdgesToRemove(4, edges);
        //Then
        assertEquals(-1, actual);
    }

}