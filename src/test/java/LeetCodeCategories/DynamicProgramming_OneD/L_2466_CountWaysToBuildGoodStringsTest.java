package LeetCodeCategories.DynamicProgramming_OneD;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_2466_CountWaysToBuildGoodStringsTest {

    L_2466_CountWaysToBuildGoodStrings myClass = new L_2466_CountWaysToBuildGoodStrings();

    @Test
    public void firstTest() {
        assertEquals(8, myClass.countGoodStrings(3,3,1,1));
    }

    @Test
    public void secondTest() {
        assertEquals(5, myClass.countGoodStrings(2,3,1,2));
    }

}