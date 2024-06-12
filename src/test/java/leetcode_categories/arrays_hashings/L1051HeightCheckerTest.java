package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L1051HeightCheckerTest {

    L1051HeightChecker myClass;

    @BeforeEach
    void setUp() {
        myClass = new L1051HeightChecker();
    }

    @Test
    public void testFirst() {
        //Given
        int[] heights = new int[] {1,1,4,2,1,3};
        //When
        int result = myClass.heightChecker(heights);
        //Then
        assertEquals(3, result);
    }

    @Test
    public void testSecond() {
        //Given
        int[] heights = new int[] {5,1,2,3,4};
        //When
        int result = myClass.heightChecker(heights);
        //Then
        assertEquals(5, result);
    }

    @Test
    public void testThird() {
        //Given
        int[] heights = new int[] {1,2,3,4,5};
        //When
        int result = myClass.heightChecker(heights);
        //Then
        assertEquals(0, result);
    }

}