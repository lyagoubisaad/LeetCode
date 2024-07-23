package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L605CanPlaceFlowersTest {

    L605CanPlaceFlowers myClass;

    @BeforeEach
    void setUp() {
        myClass = new L605CanPlaceFlowers();
    }

    @Test
    public void testFirst() {
        int[] flowerbed = new int[] {1,0,0,0,1};
        assertTrue(myClass.canPlaceFlowers(flowerbed, 1));
    }

    @Test
    public void testSecond() {
        int[] flowerbed = new int[] {1,0,0,0,1};
        assertFalse(myClass.canPlaceFlowers(flowerbed, 2));
    }

    @Test
    public void testThird() {
        int[] flowerbed = new int[] {0};
        assertTrue(myClass.canPlaceFlowers(flowerbed, 1));
    }


}