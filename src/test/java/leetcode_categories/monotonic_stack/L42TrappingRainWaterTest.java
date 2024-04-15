package leetcode_categories.monotonic_stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L42TrappingRainWaterTest {

    L42TrappingRainWater myClass;

    @BeforeEach
    void setUp() {
        myClass = new L42TrappingRainWater();
    }

    @Test
    public void testFirst() {
        //Given
        int[] height = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        //When
        int actual = myClass.trap(height);
        //Then
        assertEquals(6, actual);
    }

}