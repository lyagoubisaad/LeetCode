package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L1547MinimumCostCutStickTest {

    L1547MinimumCostCutStick myClass;

    @BeforeEach
    void setUp() {
        myClass = new L1547MinimumCostCutStick();
    }

    @Test
    public void testFirst() {
        //Given & When
        int actual = myClass.minCost(7, new int[] {1,3,4,5});
        //Then
        assertEquals(16, actual);
    }

    @Test
    public void testSecond() {
        //Given & When
        int actual = myClass.minCost(9, new int[] {5,6,1,4,2});
        //Then
        assertEquals(22, actual);
    }

    @Test
    public void testThird() {
        //Given & When
        int actual = myClass.minCost(10, new int[] {7,8,9,2,1});
        //Then
        assertEquals(24, actual);
    }
}