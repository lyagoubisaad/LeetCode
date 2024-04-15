package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;
import utils.TestUtils;

public class L238ProductOfArrayExceptSelfTest {

    L238ProductOfArrayExceptSelf myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L238ProductOfArrayExceptSelf();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [1,2,3,4]
                [-1,1,0,-3,3]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {1,2,3,4};
        int[] expected = new int[] {24,12,8,6};
        //When
        int[] actual = myClass.productExceptSelf(nums);
        //Then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {-1,1,0,-3,3};
        int[] expected = new int[] {0,0,9,0,0};
        //When
        int[] actual = myClass.productExceptSelf(nums);
        //Then
        TestUtils.assertArrayEquals(expected, actual);
    }


}