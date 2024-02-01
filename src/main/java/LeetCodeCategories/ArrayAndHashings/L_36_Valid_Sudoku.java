package LeetCodeCategories.ArrayAndHashings;

import java.util.ArrayList;
import java.util.List;

public class L_36_Valid_Sudoku {
    public static boolean isValidSudoku(char[][] board) {
        List elemRow = new ArrayList();
        List elemCol = new ArrayList();
        for (int row=0;row<board.length;row++) {
            for (int column=0;column<board[row].length;column++) {
                if(board[row][column] != '.') {
                    if(elemRow.contains(board[row][column])) return false;
                    elemRow.add(board[row][column]);
                }
                if(board[column][row] != '.') {
                    if(elemCol.contains(board[column][row])) return false;
                    elemCol.add(board[column][row]);
                }
            }
            elemRow.clear();
            elemCol.clear();
        }
        int fac=0;
        List first = new ArrayList();
        List second = new ArrayList();
        List third = new ArrayList();

        while (fac<3) {
            int fac3 = fac*3;
            for (int row=fac3;row<(2+fac3);row++) {
                for (int column=0;column<3;column++) {
                    if(board[row][column] != '.') {
                        if(elemRow.contains(board[row][column])) return false;
                        first.add(board[row][column]);
                    }
                }
                for (int column=3;column<6;column++) {
                    if(board[row][column] != '.') {
                        if(elemRow.contains(board[row][column])) return false;
                        second.add(board[row][column]);
                    }
                }
                for (int column=6;column<9;column++) {
                    if(board[row][column] != '.') {
                        if(elemRow.contains(board[row][column])) return false;
                        third.add(board[row][column]);
                    }
                }
            }
            first.clear();
            second.clear();
            third.clear();
            fac++;
        }
        return true;
    }

    public static void main(String[] args) {
        char [][] board = new char[][] {
                {'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));
    }
}
