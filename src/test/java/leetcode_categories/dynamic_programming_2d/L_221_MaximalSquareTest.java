package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_221_MaximalSquareTest {

    L221MaximalSquare myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L221MaximalSquare();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
                [["0","1"],["1","0"]]
                [["0"]]
                [["1","0","1","1","0","1"],["1","1","1","1","1","1"],["0","1","1","0","1","1"],["1","1","1","0","1","0"],["0","1","1","1","1","1"],["1","1","0","1","1","1"]]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        char[][] matrix = new char[][] {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        //When
        int actual = myClass.maximalSquare(matrix);
        //Then
        assertEquals(4, actual);
    }

    @Test
    public void secondTest() {
        //Given
        char[][] matrix = new char[][] {{'0','1'},{'1','0'}};
        //When
        int actual = myClass.maximalSquare(matrix);
        //Then
        assertEquals(1, actual);
    }

    @Test
    public void thirdTest() {
        //Given
        char[][] matrix = new char[][] {{'0'}};
        //When
        int actual = myClass.maximalSquare(matrix);
        //Then
        assertEquals(0, actual);
    }

    @Test
    public void forthTest() {
        //Given
        char[][] matrix = new char[][] {{'1','0','1','1','0','1'},{'1','1','1','1','1','1'},{'0','1','1','0','1','1'},{'1','1','1','0','1','0'},{'0','1','1','1','1','1'},{'1','1','0','1','1','1'}};
        //When
        int actual = myClass.maximalSquare(matrix);
        //Then
        assertEquals(4, actual);
    }

}