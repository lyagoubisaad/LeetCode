package leetcode_categories.graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L463IslandPerimeterTest {

    L463IslandPerimeter myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L463IslandPerimeter();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
                [[1]]
                [[1,0]]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[][] grid = new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        //When
        int actual = myClass.islandPerimeter(grid);
        //Then
        assertEquals(16, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[][] grid = new int[][] {{1}};
        //When
        int actual = myClass.islandPerimeter(grid);
        //Then
        assertEquals(4, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[][] grid = new int[][] {{1,0}};
        //When
        int actual = myClass.islandPerimeter(grid);
        //Then
        assertEquals(4, actual);
    }


}