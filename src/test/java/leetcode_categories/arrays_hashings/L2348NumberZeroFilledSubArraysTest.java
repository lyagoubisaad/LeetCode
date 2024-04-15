package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2348NumberZeroFilledSubArraysTest {

    L2348NumberZeroFilledSubArrays myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L2348NumberZeroFilledSubArrays();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [1,3,0,0,2,0,0,4]
                [0,0,0,2,0,0]
                [2,10,2019]
                """);
    }
    
    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {1,3,0,0,2,0,0,4};
        //When
        long actual = myClass.zeroFilledSubarray(nums);
        //Then
        assertEquals(6, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {0,0,0,2,0,0};
        //When
        long actual = myClass.zeroFilledSubarray(nums);
        //Then
        assertEquals(9, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {2,10,2019};
        //When
        long actual = myClass.zeroFilledSubarray(nums);
        //Then
        assertEquals(0, actual);
    }




}