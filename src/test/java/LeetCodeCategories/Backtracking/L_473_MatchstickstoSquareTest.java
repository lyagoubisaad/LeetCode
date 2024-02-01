package LeetCodeCategories.Backtracking;

import org.junit.Test;

import static LeetCodeCategories.Backtracking.L_473_MatchstickstoSquare.makesquare;
import static org.junit.jupiter.api.Assertions.*;

public class L_473_MatchstickstoSquareTest {
    @Test
    public void firstTest() {
        int[] matchsticks = new int[] {1,1,2,2,2};
        assertEquals(true, makesquare(matchsticks));
    }

    @Test
    public void secondTest() {
        int[] matchsticks = new int[] {3,3,3,3,4};
        assertEquals(false, makesquare(matchsticks));
    }

    @Test
    public void thirdTest() {
        int[] matchsticks = new int[] {5,5,5,5,4,4,4,4,3,3,3,3};
        assertEquals(true, makesquare(matchsticks));
    }

    @Test
    public void forthTest() {
        int[] matchsticks = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        assertEquals(true, makesquare(matchsticks));
    }

}