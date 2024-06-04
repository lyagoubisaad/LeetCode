package leetcode_categories.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class L79WordSearchTest {

    L79WordSearch myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L79WordSearch();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
               [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
                [["C","A","A"],["A","A","A"],["B","C","D"]]      
                [["A","B","C","E"],["S","F","E","S"],["A","D","E","E"]]         
                """);
    }

    @Test
    public void testFirst() {
        //Given
        char[][] board = new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        //When & Then
        assertTrue(myClass.exist(board, "ABCCED"));
    }

    @Test
    public void testSecond() {
        //Given
        char[][] board = new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        //When & Then
        assertTrue(myClass.exist(board, "SEE"));
    }

    @Test
    public void testThird() {
        //Given
        char[][] board = new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        //When & Then
        assertFalse(myClass.exist(board, "ABCB"));
    }

    @Test
    public void testForth() {
        //Given
        char[][] board = new char[][] {{'a'}};
        //When & Then
        assertTrue(myClass.exist(board, "a"));
    }

    @Test
    public void testFifth() {
        //Given
        char[][] board = new char[][] {{'a', 'b'}};
        //When & Then
        assertTrue(myClass.exist(board, "ba"));
    }

    @Test
    public void testSixth() {
        //Given
        char[][] board = new char[][] {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        //When & Then
        assertTrue(myClass.exist(board, "AAB"));
    }

    @Test
    public void testSeventh() {
        //Given
        char[][] board = new char[][]  {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        //When & Then
        assertTrue(myClass.exist(board, "ABCESEEEFS"));
    }

}