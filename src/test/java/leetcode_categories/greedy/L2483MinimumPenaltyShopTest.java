package leetcode_categories.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class L2483MinimumPenaltyShopTest {

    L2483MinimumPenaltyShop myClass;

    @BeforeEach
    void setUp() {
        myClass = new L2483MinimumPenaltyShop();
    }

    @Test
    public void firstTest() {
        String customers = "YYNY";
        assertEquals(2, myClass.bestClosingTime(customers));
    }

    @Test
    public void secondTest() {
        String customers = "NNNNN";
        assertEquals(0, myClass.bestClosingTime(customers));
    }

    @Test
    public void thirdTest() {
        String customers = "YYYY";
        assertEquals(4, myClass.bestClosingTime(customers));
    }


}