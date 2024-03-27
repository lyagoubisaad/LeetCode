package LeetCodeCategories.DynamicProgramming_OneD;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_2140_SolvingQuestionsWithBrainpowerTest {

    L_2140_SolvingQuestionsWithBrainpower myClass = new L_2140_SolvingQuestionsWithBrainpower();

    @Test
    public void firstTest() {
        int[][] questions = new int[][] {
                {3,2}, {4,3}, {4,4}, {2,5}
        };

        assertEquals(5, myClass.mostPoints(questions));
    }

    @Test
    public void secondTest() {
        int[][] questions = new int[][] {
                {1,1},{2,2},{3,3},{4,4},{5,5}
        };

        assertEquals(7, myClass.mostPoints(questions));
    }

}