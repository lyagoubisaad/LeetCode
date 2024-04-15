package leetcode_categories.prefix_sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2017GridGameTest {

    L2017GridGame myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L2017GridGame();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [[2,5,4],[1,5,1]]
                [[3,3,1],[8,5,2]]
                [[1,3,1,15],[1,3,3,1]]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[][] grid = new int[][] {{2,5,4},{1,5,1}};
        //When
        long actual = myClass.gridGame(grid);
        //Then
        assertEquals(4, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[][] grid = new int[][] {{3,3,1},{8,5,2}};
        //When
        long actual = myClass.gridGame(grid);
        //Then
        assertEquals(4, actual);
    }


    @Test
    public void testThird() {
        //Given
        int[][] grid = new int[][] {{1,3,1,15},{1,3,3,1}};
        //When
        long actual = myClass.gridGame(grid);
        //Then
        assertEquals(7, actual);
    }




}