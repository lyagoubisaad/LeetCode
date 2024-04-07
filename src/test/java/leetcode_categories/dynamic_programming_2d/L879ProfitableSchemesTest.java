package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L879ProfitableSchemesTest {

    L879ProfitableSchemes myClass;

    @BeforeEach
    void setUp() {
        myClass = new L879ProfitableSchemes();
    }

    @Test
    public void testFirst() {
        //Given & When
        int actual = myClass.profitableSchemes(5,3, new int[] {2,2}, new int[] {2,3});
        //Then
        assertEquals(2, actual);
    }

    @Test
    public void testSecond() {
        //Given & When
        int actual = myClass.profitableSchemes(10,5, new int[] {2,3,5}, new int[] {6,7,8});
        //Then
        assertEquals(7, actual);
    }

    @Test
    public void testThird() {
        //Given & When
        int actual = myClass.profitableSchemes(1,1, new int[] {2,2,2,2,2}, new int[] {1,2,1,1,0});
        //Then
        assertEquals(0, actual);
    }

    @Test
    public void testForth() {
        //Given & When
        int actual = myClass.profitableSchemes(64,0, new int[] {80, 40}, new int[] {88,88});
        //Then
        assertEquals(2, actual);
    }

}