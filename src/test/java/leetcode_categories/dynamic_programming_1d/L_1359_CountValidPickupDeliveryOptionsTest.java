package leetcode_categories.dynamic_programming_1d;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_1359_CountValidPickupDeliveryOptionsTest {

    L_1359_CountValidPickupDeliveryOptions myClass = new L_1359_CountValidPickupDeliveryOptions();

    @Test
    public void firstTest() {
        assertEquals(1, myClass.countOrders(1));
    }

    @Test
    public void secondTest() {
        assertEquals(6, myClass.countOrders(2));
    }

    @Test
    public void thirdTest() {
        assertEquals(90, myClass.countOrders(3));
    }


}