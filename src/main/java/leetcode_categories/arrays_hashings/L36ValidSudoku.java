package leetcode_categories.arrays_hashings;

import java.util.HashSet;

public class L36ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet();
        for (int i=0;i<9;i++){
            set.clear();
            for (int j=0;j<9;j++) {
                if(board[i][j] == '.') continue;
                if(!set.add(board[i][j])) return false;
            }
        }
        for (int i=0;i<9;i++){
            set.clear();
            for (int j=0;j<9;j++) {
                if(board[j][i] == '.') continue;
                if(!set.add(board[j][i])) return false;
            }
        }
        for (int i=0;i<9;i+=3) {
            for (int j=0;j<9;j+=3) {
                if(!isSquareValid(i, i+2, j, j+2, board)) return false;
            }
        }
        return true;
    }

    private boolean isSquareValid(int b0, int b1, int e0, int e1, char[][] board) {
        HashSet<Character> store = new HashSet<>();
        for (;b0<=b1;b0++) {
            for (int i=e0;i<=e1;i++) {
                if(board[b0][i] == '.') continue;
                if(!store.add(board[b0][i])) return false;
            }
        }
        return true;
    }
}
