package others;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoInternsTest {

    @Test
    public void firstTest() {
        assertEquals(21, TwoInterns.getMaximumRewardPoints(3, new int[] {5,4,3,2,1}, new int[]  {1,2,3,4,5}));
    }

    @Test
    public void secondTest() {
        assertEquals(19, TwoInterns.getMaximumRewardPoints(4, new int[] {5,4,3,2,1}, new int[]  {1,2,3,4,5}));
    }

    @Test
    public void thirdTest() {
        assertEquals(17, TwoInterns.getMaximumRewardPoints(1, new int[] {1,2,3}, new int[]  {2,8,8}));
    }

    @Test
    public void forthTest() {
        assertEquals(8, TwoInterns.getMaximumRewardPoints(3, new int[] {1,2,3,2}, new int[]  {1,2,3,2}));
    }


}