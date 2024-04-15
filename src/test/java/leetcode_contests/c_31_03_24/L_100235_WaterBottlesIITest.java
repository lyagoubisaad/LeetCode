package leetcode_contests.c_31_03_24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_100235_WaterBottlesIITest {

    L_100235_WaterBottlesII myClass = new L_100235_WaterBottlesII();

    @Test
    void firstTest() {
        assertEquals(15, myClass.maxBottlesDrunk(13, 6));
    }

    @Test
    void secondTest() {
        assertEquals(13, myClass.maxBottlesDrunk(10, 3));
    }

}