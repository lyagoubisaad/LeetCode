package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.*;

public class L_1911_MaximumAlternatingSubsequenceSumTest {

    L_1911_MaximumAlternatingSubsequenceSum myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L_1911_MaximumAlternatingSubsequenceSum();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.convert("""   
                [4,2,5,3]
                [5,6,7,8]
                [6,2,1,2,4,5]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[]{4,2,5,3};
        //When
        long actual = myClass.maxAlternatingSum(nums);
        //Then
        assertEquals(7,actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[]{5,6,7,8};
        //When
        long actual = myClass.maxAlternatingSum(nums);
        //Then
        assertEquals(8,actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[]{6,2,1,2,4,5};
        //When
        long actual = myClass.maxAlternatingSum(nums);
        //Then
        assertEquals(10, actual);
    }



}