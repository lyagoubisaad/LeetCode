package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L41FirstMissingPositiveTest {

    L41FirstMissingPositive myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L41FirstMissingPositive();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [1,2,0]
                [3,4,-1,1]
                [7,8,9,11,12]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {1,2,0};
        //When
        int actual = myClass.firstMissingPositive(nums);
        //Then
        assertEquals(3, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {3,4,-1,1};
        //When
        int actual = myClass.firstMissingPositive(nums);
        //Then
        assertEquals(2, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {7,8,9,11,12};
        //When
        int actual = myClass.firstMissingPositive(nums);
        //Then

        assertEquals(1, actual);
    }

    @Test
    public void testForth() {
        //Given
        int[] nums = new int[] {0,2,2,1,1};
        //When
        int actual = myClass.firstMissingPositive(nums);
        //Then
        assertEquals(3, actual);
    }



}