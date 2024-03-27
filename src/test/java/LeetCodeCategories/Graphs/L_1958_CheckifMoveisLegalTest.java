package LeetCodeCategories.Graphs;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_1958_CheckifMoveisLegalTest {
    L_1958_CheckifMoveisLegal myClass = new L_1958_CheckifMoveisLegal();

    @Test
    public void firstTest() {
        char[][] board = new char[][] {
                {'.','.','.','B','.','.','.','.'},{'.','.','.','W','.','.','.','.'},{'.','.','.','W','.','.','.','.'},
                {'.','.','.','W','.','.','.','.'},{'W','B','B','.','W','W','W','B'},{'.','.','.','B','.','.','.','.'},
                {'.','.','.','B','.','.','.','.'},{'.','.','.','W','.','.','.','.'}
        };
        assertEquals(true, myClass.checkMove(board, 4, 3, 'B'));
    }

    @Test
    public void secondTest() {
        char[][] board = new char[][] {
                {'.','.','.','.','.','.','.','.'},{'.','B','.','.','W','.','.','.'},{'.','.','W','.','.','.','.','.'},
                {'.','.','.','W','B','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','B','W','.','.'},
                {'.','.','.','.','.','.','W','.'},{'.','.','.','.','.','.','.','B'}
        };
        assertEquals(false, myClass.checkMove(board, 4, 4, 'W'));
    }
}