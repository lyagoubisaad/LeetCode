package LeetCodeCategories.Backtracking;

import org.junit.Test;

import static LeetCodeCategories.Backtracking.L_473_MatchstickstoSquare.makesquare;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_473_MatchstickstoSquareTest {
    @Test(timeout = 1000)
    public void firstTest() {
        int[] matchsticks = new int[] {1,1,2,2,2};
        assertEquals(true, makesquare(matchsticks));
    }

    @Test(timeout = 1000)
    public void secondTest() {
        int[] matchsticks = new int[] {3,3,3,3,4};
        assertEquals(false, makesquare(matchsticks));
    }

    @Test(timeout = 1000)
    public void thirdTest() {
        int[] matchsticks = new int[] {5,5,5,5,4,4,4,4,3,3,3,3};
        assertEquals(true, makesquare(matchsticks));
    }

    @Test(timeout = 1000)
    public void forthTest() {
        int[] matchsticks = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        assertEquals(true, makesquare(matchsticks));
    }
    @Test(timeout = 1000)
    public void fifthTest() {
        int[] matchsticks = new int[] {10,6,5,5,5,3,3,3,2,2,2,2};
        assertEquals(true, makesquare(matchsticks));
    }

    @Test(timeout = 1000)
    public void sixthTest() {
        int[] matchsticks = new int[] {8308874,3860679,7616671,7806405,6981873,1288521,924128,7846272,3560029,124015,3873541,9894282,5246149,449355,7797093};
        assertEquals(false, makesquare(matchsticks));
    }

    @Test(timeout = 1000)
    public void seventhText() {
        int[] matchsticks = new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,102};
        assertEquals(false, makesquare(matchsticks));
    }

}