package LeetCodeCategories.DynamicProgramming_OneD;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_1406_StoneGameIIITest {
    L_1406_StoneGameIII myClass = new L_1406_StoneGameIII();

    @Test
    public void firstTest() {
        int[] stoneValue = new int[] {1,2,3,7};
        assertEquals("Bob", myClass.stoneGameIII(stoneValue));
    }

    @Test
    public void secondTest() {
        int[] stoneValue = new int[] {1,2,3,-9};
        assertEquals("Alice", myClass.stoneGameIII(stoneValue));
    }

    @Test
    public void thirdTest() {
        int[] stoneValue = new int[] {1,2,3,6};
        assertEquals("Tie", myClass.stoneGameIII(stoneValue));
    }

    @Test
    public void forthTest() {
        int[] stoneValue = new int[] {1,5,2,8,4,7};
        assertEquals("Bob", myClass.stoneGameIII(stoneValue));
    }

}