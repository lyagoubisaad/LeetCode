package LeetCodeCategories.Greedy;

import org.junit.Test;

import static LeetCodeCategories.Greedy.L_135_Candy.candy;
import static org.junit.Assert.assertEquals;

public class L_135_CandyTest {
    @Test
    public void firstTest() {
        int[] ratings = new int[] {1,0,2};
        assertEquals(5,candy(ratings));
    }

    @Test
    public void secondTest() {
        int[] ratings = new int[] {1,2,2};
        assertEquals(4,candy(ratings));
    }

    @Test
    public void thirdTest() {
        int[] ratings = new int[] {1,3,2,2,1};
        assertEquals(7,candy(ratings));
    }

    @Test
    public void forthTest() {
        int[] ratings = new int[] {1,2,87,87,87,2,1};
        assertEquals(13,candy(ratings));
    }

    @Test
    public void fifthTest() {
        int[] ratings = new int[] {1,6,10,8,7,3,2};
        assertEquals(18,candy(ratings));
    }

}