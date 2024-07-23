package leetcode_categories.binary_search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.*;

public class L33SearchRotatedSortedArrayTest {

    L33SearchRotatedSortedArray myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L33SearchRotatedSortedArray();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [4,5,6,7,0,1,2]
                [4,5,6,7,0,1,2]
                [1]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {4,5,6,7,0,1,2};
        //When
        int actual = myClass.search(nums, 0);
        //Then
        assertEquals(4, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {4,5,6,7,0,1,2};
        //When
        int actual = myClass.search(nums, 3);
        //Then
        assertEquals(-1, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {1};
        //When
        int actual = myClass.search(nums, 0);
        //Then
        assertEquals(-1, actual);
    }

}