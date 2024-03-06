package LeetCodeCategories.Graphs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class L_1557_MinimumNumberVerticesReachAllNodesTest {

    L_1557_MinimumNumberVerticesReachAllNodes myClass = new L_1557_MinimumNumberVerticesReachAllNodes();

    @Test
    public void firstTest() {
        List<List<Integer>> edges = List.of(List.of(0,1),List.of(0,2),List.of(2,5),List.of(3,4),List.of(4,2));
        assertEquals(List.of(0,3), myClass.findSmallestSetOfVertices(6, edges));
    }

    @Test
    public void secondTest() {
        List<List<Integer>> edges = List.of(List.of(0,1),List.of(2,1),List.of(3,1),List.of(1,4),List.of(2,4));
        assertEquals(List.of(0,2,3), myClass.findSmallestSetOfVertices(5, edges));
    }

}