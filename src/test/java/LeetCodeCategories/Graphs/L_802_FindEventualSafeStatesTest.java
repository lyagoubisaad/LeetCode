package LeetCodeCategories.Graphs;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class L_802_FindEventualSafeStatesTest {

    L_802_FindEventualSafeStates myClass = new L_802_FindEventualSafeStates();

    @Test
    public void firstTest() {

        int[][] graph = new int[][] {
                {1,2},{2,3},{5},{0},{5},{},{}
        };

        assertEquals(List.of(2,4,5,6), myClass.eventualSafeNodes(graph));
    }

    @Test
    public void secondTest() {

        int[][] graph = new int[][] {
                {},{0,2,3,4},{3},{4},{}
        };

        assertEquals(List.of(0,1,2,3,4), myClass.eventualSafeNodes(graph));
    }



}