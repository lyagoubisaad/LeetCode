package leetcode_contests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class tmpTest {

    tmp myClass = new tmp();
    Convertor convertor = new Convertor();

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [[4,2,2],[8,2,5],[1,5,2]]
                [[1,1,1],[0,0,0]]     
                [[5,3,1],[5,9,4],[2,3,3]]             
                [[4,5,0,1],[1,9,0,8],[2,2,5,3],[2,0,9,3]]   
                [[5,9,9,4,9],[4,6,2,8,2],[8,9,6,2,7],[3,0,2,8,1],[6,7,1,2,2]]   
                 """);
    }

    @Test
    public void testFirst() {
        //Given
        int[][] grid = new int[][] {{4,2,2},{8,2,5},{1,5,2}};
        //When
        int actual = myClass.minimumOperations(grid);
        //Then
        assertEquals(5, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[][] grid = new int[][] {{1,1,1},{0,0,0}};
        //When
        int actual = myClass.minimumOperations(grid);
        //Then
        assertEquals(3, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[][] grid = new int[][] {{5,3,1},{5,9,4},{2,3,3}};
        //When
        int actual = myClass.minimumOperations(grid);
        //Then
        assertEquals(4, actual);
    }

    @Test
    public void testForth() {
        //Given
        int[][] grid = new int[][] {
                {4,5,0,1},
                {1,9,0,8},
                {2,2,5,3},
                {2,0,9,3}};
        //When
        int actual = myClass.minimumOperations(grid);
        //Then
        assertEquals(9, actual);
    }

    @Test
    public void testFifth() {
        //Given
        int[][] grid = new int[][] {
                {5,9,9,4,9},
                {4,6,2,8,2},
                {8,9,6,2,7},
                {3,0,2,8,1},
                {6,7,1,2,2}};
        //When
        int actual = myClass.minimumOperations(grid);
        //Then
        assertEquals(16, actual);
    }



}