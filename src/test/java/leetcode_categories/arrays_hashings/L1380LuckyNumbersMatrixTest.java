package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class L1380LuckyNumbersMatrixTest {

    L1380LuckyNumbersMatrix myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L1380LuckyNumbersMatrix();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [[3,7,8],[9,11,13],[15,16,17]]
                [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
                [[7,8],[1,2]]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[][] matrix = new int[][] {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> expected = Arrays.asList(15);
        //When
        List<Integer> actual = myClass.luckyNumbers(matrix);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[][] matrix = new int[][] {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        List<Integer> expected = Arrays.asList(12);
        //When
        List<Integer> actual = myClass.luckyNumbers(matrix);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[][] matrix = new int[][] {{7,8},{1,2}};
        List<Integer> expected = Arrays.asList(7);
        //When
        List<Integer> actual = myClass.luckyNumbers(matrix);
        //Then
        assertEquals(expected, actual);
    }

}