package LeetCodeCategories.Greedy;

import org.junit.Test;

import static LeetCodeCategories.Greedy.L_1423_MaximumPointsYouCanObtainfromCards.maxScore;
import static org.junit.Assert.assertEquals;

public class L_1423_MaximumPointsYouCanObtainfromCardsTest{

    @Test
    public void firstTest() {
        int[] cardPoints = new int[] {1,2,3,4,5,6,1};
        int k =3;
        assertEquals(12, maxScore(cardPoints, k));
    }

    @Test
    public void secondTest() {
        int[] cardPoints = new int[] {2,2,2};
        int k =2;
        assertEquals(4, maxScore(cardPoints, k));
    }

    @Test
    public void thirdTest() {
        int[] cardPoints = new int[] {9,7,7,9,7,7,9};
        int k =7;
        assertEquals(55, maxScore(cardPoints, k));
    }

    @Test
    public void forthTest() {
        int[] cardPoints = new int[] {11,49,100,20,86,29,72};
        int k =4;
        assertEquals(232, maxScore(cardPoints, k));
    }



}