package leetcode_categories.graphs;

import leetcode_categories.graphs.L310MinimumHeightTrees;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class L310MinimumHeightTreesTest {

    L310MinimumHeightTrees myClass;

    @BeforeEach
    void setUp() {
        myClass = new L310MinimumHeightTrees();
    }

    @Test
    public void testFirst() {
        //Given
        int[][] edges = new int[][] {{1,0}, {1,2}, {1,3}};
        List<Integer> expected = List.of(1);
        //When
        List<Integer> actual = myClass.findMinHeightTrees(4, edges);
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[][] edges = new int[][] {{3,0}, {3,1}, {3,2}, {3,4}, {5,4}};
        List<Integer> expected = List.of(3,4);
        //When
        List<Integer> actual = myClass.findMinHeightTrees(6, edges);
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[][] edges = new int[][] {};
        List<Integer> expected = List.of(0);
        //When
        List<Integer> actual = myClass.findMinHeightTrees(1, edges);
        //Then
        Assertions.assertEquals(expected, actual);
    }

}