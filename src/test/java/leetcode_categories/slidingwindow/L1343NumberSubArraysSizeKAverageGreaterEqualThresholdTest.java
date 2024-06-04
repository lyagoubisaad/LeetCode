package leetcode_categories.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L1343NumberSubArraysSizeKAverageGreaterEqualThresholdTest {
    
    L1343NumberSubArraysSizeKAverageGreaterEqualThreshold myClass;
    
    @BeforeEach
    void setUp() {
        myClass = new L1343NumberSubArraysSizeKAverageGreaterEqualThreshold();
    }
    
    @Test
    public void testFirst() {
        //Given
        int[] arr = new int[] {2,2,2,2,5,5,5,8};
        //When
        int actual = myClass.numOfSubarrays(arr, 3, 4);
        //Then
        assertEquals(3, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] arr = new int[] {11,13,17,23,29,31,7,5,2,3};
        //When
        int actual = myClass.numOfSubarrays(arr, 3, 5);
        //Then
        assertEquals(6, actual);
    }

}