package leetcode_categories.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.*;

public class L1248CountNumberNiceSubarraysTest {

    L1248CountNumberNiceSubarrays myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L1248CountNumberNiceSubarrays();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [1,1,2,1,1]
                [2,4,6]
                [2,2,2,1,2,2,1,2,2,2]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {1,1,2,1,1};
        //When
        int result = myClass.numberOfSubarrays(nums, 3);
        //Then
        assertEquals(2, result);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {2,4,6};
        //When
        int result = myClass.numberOfSubarrays(nums, 1);
        //Then
        assertEquals(0, result);
    }


    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {2,2,2,1,2,2,1,2,2,2};
        //When
        int result = myClass.numberOfSubarrays(nums, 2);
        //Then
        assertEquals(16, result);
    }


}