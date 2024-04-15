package leetcode_categories.monotonic_stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.Assert.assertEquals;

public class L84LargestRectangleHistogramTest {

    L84LargestRectangleHistogram myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L84LargestRectangleHistogram();
        convertor = new Convertor();
    }
    
    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [2,1,5,6,2,3]
                [2,4]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[] heights = new int[] {2,1,5,6,2,3};
        int expected = 10;
        //When
        int actual = myClass.largestRectangleArea(heights);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] heights = new int[] {2,4};
        int expected = 4;
        //When
        int actual = myClass.largestRectangleArea(heights);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] heights = new int[] {4,2};
        int expected = 4;
        //When
        int actual = myClass.largestRectangleArea(heights);
        //Then
        assertEquals(expected, actual);
    }



}