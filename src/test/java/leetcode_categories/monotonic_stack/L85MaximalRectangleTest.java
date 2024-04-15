package leetcode_categories.monotonic_stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L85MaximalRectangleTest {

    L85MaximalRectangle myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L85MaximalRectangle();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
               [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
               [["0","1"]]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        char[][] matrix = new char[][] {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        //When
        int actual = myClass.maximalRectangle(matrix);
        //Then
        assertEquals(6, actual);
    }

    @Test
    public void testSecond() {
        //Given
        char[][] matrix = new char[][] {{'0','1'}};
        //When
        int actual = myClass.maximalRectangle(matrix);
        //Then
        assertEquals(1, actual);
    }

}