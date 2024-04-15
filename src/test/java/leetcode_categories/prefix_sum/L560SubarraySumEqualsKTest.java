package leetcode_categories.prefix_sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L560SubarraySumEqualsKTest {

    L560SubarraySumEqualsK myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L560SubarraySumEqualsK();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [1,1,1]
                2
                [1,2,3]
                3
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[]{1, 1, 1};
        //When
        int actual = myClass.subarraySum(nums, 2);
        //Then
        assertEquals(2, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[]{1, 2, 3};
        //When
        int actual = myClass.subarraySum(nums, 3);
        //Then
        assertEquals(2, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[]{1, 2, 1, 2, 1};
        //When
        int actual = myClass.subarraySum(nums, 3);
        //Then
        assertEquals(4, actual);
    }

    @Test
    public void testForth() {
        //Given
        int[] nums = new int[]{1, -1, 0};
        //When
        int actual = myClass.subarraySum(nums, 0);
        //Then
        assertEquals(3, actual);
    }

}