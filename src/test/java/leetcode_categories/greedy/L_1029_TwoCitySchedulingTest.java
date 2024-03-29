package leetcode_categories.greedy;

import org.junit.Test;

import static leetcode_categories.greedy.L_1029_TwoCityScheduling.twoCitySchedCost;
import static org.junit.Assert.assertEquals;

public class L_1029_TwoCitySchedulingTest {

    @Test
    public void firstTest() {
        int[][] costs = new int[][] {{10,20},{30,200},{400,50},{30,20}};
        assertEquals(110, twoCitySchedCost(costs));
    }

    @Test
    public void secondTest() {
        int[][] costs = new int[][] {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        assertEquals(1859, twoCitySchedCost(costs));
    }


    @Test
    public void thirdTest() {
        int[][] costs = new int[][] {{515,563},{451,713},{537,709},{343,819},{855,779},{457,60},{650,359},{631,42}};
        assertEquals(3086, twoCitySchedCost(costs));
    }

}