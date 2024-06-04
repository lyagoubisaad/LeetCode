package leetcode_categories.graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.*;

public class L200NumberOfIslandsTest {

    L200NumberOfIslands myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L200NumberOfIslands();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
               [["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]]
               [["1","1","0","0","0"],["1","1","0","0","0"],["0","0","1","0","0"],["0","0","0","1","1"]]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        char[][] grid = new char[][] {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        //When
        int result = myClass.numIslands(grid);
        //Then
        assertEquals(1, result);

    }

    @Test
    public void testSecond() {
        //Given
        char[][] grid = new char[][] {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        //When
        int result = myClass.numIslands(grid);
        //Then
        assertEquals(3, result);

    }

}