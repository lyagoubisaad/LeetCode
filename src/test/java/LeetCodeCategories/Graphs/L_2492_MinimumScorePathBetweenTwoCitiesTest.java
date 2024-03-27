package LeetCodeCategories.Graphs;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_2492_MinimumScorePathBetweenTwoCitiesTest {

    L_2492_MinimumScorePathBetweenTwoCities myClass = new L_2492_MinimumScorePathBetweenTwoCities();

    @Test
    public void firstTest() {
        int[][] roads = new int[][] {{1,2,9}, {2,3,6}, {2,4,5}, {1,4,7}};
        assertEquals(5, myClass.minScore(4, roads));
    }

    @Test
    public void secondTest() {
        int[][] roads = new int[][] {{1,2,2}, {1,3,4}, {3,4,7}};
        assertEquals(2, myClass.minScore(4, roads));
    }

}