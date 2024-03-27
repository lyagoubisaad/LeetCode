package LeetCodeCategories.Graphs;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_2359_FindClosestNodeGivenTwoNodesTest {

    L_2359_FindClosestNodeGivenTwoNodes myClass = new L_2359_FindClosestNodeGivenTwoNodes();

    @Test
    public void firstTest() {
        int[] edges = new int[] {2,2,3,-1};
        assertEquals(2, myClass.closestMeetingNode(edges, 0, 1));
    }

    @Test
    public void secondTest() {
        int[] edges = new int[] {1,2,-1};
        assertEquals(2, myClass.closestMeetingNode(edges, 0, 2));
    }

    @Test
    public void thirdTest() {
        int[] edges = new int[] {4,3,0,5,3,-1};
        assertEquals(4, myClass.closestMeetingNode(edges, 4, 0));
    }

    @Test
    public void forthTest() {
        int[] edges = new int[] {5,4,5,4,3,6,-1};
        assertEquals(-1, myClass.closestMeetingNode(edges, 0, 1));
    }

    @Test
    public void fifthTest() {
        int[] edges = new int[] {5,4,5,4,3,6,-1};
        assertEquals(-1, myClass.closestMeetingNode(edges, 0, 1));
    }
    
    @Test
    public void sixthTest() {
        int[] edges = new int[] {2,0,0};
        assertEquals(0, myClass.closestMeetingNode(edges, 2, 0));
    }
}