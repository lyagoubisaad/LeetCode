package leetcode_categories.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L1838FrequencyMostFrequentElementTest {

    L1838FrequencyMostFrequentElement myClass;

    @BeforeEach
    void setUp() {
        myClass = new L1838FrequencyMostFrequentElement();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {1,2,4};
        //When
        int actual = myClass.maxFrequency(nums, 5);
        //Then
        assertEquals(3, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {1,4,8,13};
        //When
        int actual = myClass.maxFrequency(nums, 5);
        //Then
        assertEquals(2, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {3,6,7, 10};
        //When
        int actual = myClass.maxFrequency(nums, 2);
        //Then
        assertEquals(2, actual);
    }

    @Test
    public void testForth() {
        //Given
        int[] nums = new int[] {9930,9923,9983,9997,9934,9952,9945,9914,9985,9982,9970,9932,9985,9902,9975,9990,9922,9990,9994,9937,9996,9964,9943,9963,9911,9925,9935,9945,9933,9916,9930,9938,10000,9916,9911,9959,9957,9907,9913,9916,9993,9930,9975,9924,9988,9923,9910,9925,9977,9981,9927,9930,9927,9925,9923,9904,9928,9928,9986,9903,9985,9954,9938,9911,9952,9974,9926,9920,9972,9983,9973,9917,9995,9973,9977,9947,9936,9975,9954,9932,9964,9972,9935,9946,9966};
        //When
        int actual = myClass.maxFrequency(nums, 3056);
        //Then
        assertEquals(73, actual);
    }



}