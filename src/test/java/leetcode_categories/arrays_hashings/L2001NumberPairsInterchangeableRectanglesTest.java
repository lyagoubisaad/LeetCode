package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2001NumberPairsInterchangeableRectanglesTest {

    L2001NumberPairsInterchangeableRectangles myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L2001NumberPairsInterchangeableRectangles();
        convertor = new Convertor();
    }
    
    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [[4,8],[3,6],[10,20],[15,30]]
                [[4,5],[7,8]]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[][] rectangles = new int[][] {{4,8},{3,6},{10,20},{15,30}};
        //When
        long actual = myClass.interchangeableRectangles(rectangles);
        //Then
        assertEquals(6, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[][] rectangles = new int[][] {{4,5},{7,8}};
        //When
        long actual = myClass.interchangeableRectangles(rectangles);
        //Then
        assertEquals(0, actual);
    }

}