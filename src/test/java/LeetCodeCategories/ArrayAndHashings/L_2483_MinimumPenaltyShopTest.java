package LeetCodeCategories.ArrayAndHashings;

import org.junit.Test;

import static LeetCodeCategories.ArrayAndHashings.L_2483_MinimumPenaltyShop.bestClosingTime;
import static org.junit.Assert.assertEquals;

public class L_2483_MinimumPenaltyShopTest {

    @Test
    public void firstTest() {
        String customers = "YYNY";
        assertEquals(2, bestClosingTime(customers));
    }

    @Test
    public void secondTest() {
        String customers = "NNNNN";
        assertEquals(0, bestClosingTime(customers));
    }

    @Test
    public void thirdTest() {
        String customers = "YYYY";
        assertEquals(4, bestClosingTime(customers));
    }


}