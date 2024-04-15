package leetcode_categories.two_pointers;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L11ContainerWithMostWaterTest {

    L11ContainerWithMostWater myClass = new L11ContainerWithMostWater();

    @Test
    public void firstTest() {
        int[] height = new int[] {1,8,6,2,5,4,8,3,7};
        assertEquals(49, myClass.maxArea(height));
    }

    @Test
    public void secondTest() {
        int[] height = new int[] {1,1};
        assertEquals(1, myClass.maxArea(height));
    }

}