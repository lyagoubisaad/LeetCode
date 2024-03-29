package leetcode_categories.dynamic_programming_1d;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_1626_BestTeamWithNoConflictsTest {

    L_1626_BestTeamWithNoConflicts myClass = new L_1626_BestTeamWithNoConflicts();

    @Test
    public void firstTest() {
        int[] ages = new int[] {1,2,3,4,5};
        int[] scores = new int[] {1,3,5,10,15};
        assertEquals(34, myClass.bestTeamScore(scores, ages));
    }

    @Test
    public void secondTest() {
        int[] ages = new int[] {2,1,2,1};
        int[] scores = new int[] {4,5,6,5};
        assertEquals(16, myClass.bestTeamScore(scores, ages));
    }

    @Test
    public void thirdTest() {
        int[] ages = new int[] {8,9,10,1};
        int[] scores = new int[] {1,2,3,5};
        assertEquals(6, myClass.bestTeamScore(scores, ages));
    }

    @Test
    public void forthTest() {
        int[] ages = new int[] {811,364,124,873,790,656,581,446,885,134};
        int[] scores = new int[] {1,1,1,1,1,1,1,1,1,1};
        assertEquals(10, myClass.bestTeamScore(scores, ages));
    }

    @Test
    public void fifthTest() {
        int[] ages = new int[] {4};
        int[] scores = new int[] {1};
        assertEquals(1, myClass.bestTeamScore(scores, ages));
    }

}