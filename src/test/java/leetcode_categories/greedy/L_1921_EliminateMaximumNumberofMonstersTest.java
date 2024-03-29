package leetcode_categories.greedy;

import org.junit.Test;

import static leetcode_categories.greedy.L_1921_EliminateMaximumNumberofMonsters.eliminateMaximum;
import static org.junit.Assert.assertEquals;

public class L_1921_EliminateMaximumNumberofMonstersTest {
    @Test
    public void firstTest() {
        int[] dist = new int[] {1,3,4};
        int[] speed = new int[] {1,1,1};
        assertEquals(3,eliminateMaximum(dist,speed));
    }

    @Test
    public void secondTest() {
        int[] dist = new int[] {1,1,2,3};
        int[] speed = new int[] {1,1,1,1};
        assertEquals(1,eliminateMaximum(dist,speed));
    }

    @Test
    public void thirdTest() {
        int[] dist = new int[] {3,2,4};
        int[] speed = new int[] {5,3,2};
        assertEquals(1,eliminateMaximum(dist,speed));
    }

    @Test
    public void frothTest() {
        int[] dist = new int[] {4,3,4};
        int[] speed = new int[] {1,1,2};
        assertEquals(3,eliminateMaximum(dist,speed));
    }
}