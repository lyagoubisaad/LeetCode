package leetcode_categories.dynamic_programming_1d;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_1799_MaximizeScoreAfterNOperationsTest {

    L_1799_MaximizeScoreAfterNOperations myClass = new L_1799_MaximizeScoreAfterNOperations();

    @Test
    public void firstTest() {
        int[] nums = new int[] {1,2};
        assertEquals(1, myClass.maxScore(nums));
    }

    @Test
    public void secondTest() {
        int[] nums = new int[] {3,4,6,8};
        assertEquals(11, myClass.maxScore(nums));
    }

    @Test
    public void thirdTest() {
        int[] nums = new int[] {1,2,3,4,5,6};
        assertEquals(14, myClass.maxScore(nums));
    }

    @Test
    public void forthTest() {
        int[] nums = new int[] {109497,983516,698308,409009,310455,528595,524079,18036,341150,641864,913962,421869,943382,295019};
        assertEquals(527, myClass.maxScore(nums));
    }

    @Test
    public void fifthTest() {
        int[] nums = new int[] {175606,167380,267614,552999,998200,176313,688555,286172};
        assertEquals(160, myClass.maxScore(nums));
    }


}