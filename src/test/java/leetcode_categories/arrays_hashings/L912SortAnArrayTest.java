package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;
import utils.TestUtils;

public class L912SortAnArrayTest {

    L912SortAnArray myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L912SortAnArray();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [5,2,3,1]
                [5,1,1,2,0,0]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums  = new int[] {5,2,3,1};
        int[] expected = new int[] {1,2,3,5};
        //When
        int[] actual = myClass.sortArray(nums);
        //Then
        TestUtils.assertArrayEquals(actual, expected);
    }

    @Test
    public void secondTest() {
        //Given
        int[] nums  = new int[] {5,1,1,2,0,0};
        int[] expected = new int[] {0,0,1,1,2,5};
        //When
        int[] actual = myClass.sortArray(nums);
        //Then
        TestUtils.assertArrayEquals(actual, expected);
    }




}