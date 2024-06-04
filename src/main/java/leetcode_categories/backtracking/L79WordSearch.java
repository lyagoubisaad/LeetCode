package leetcode_categories.backtracking;

public class L79WordSearch {
    public boolean exist(char[][] board, String word) {
        int[][] directions = new int[][] {{-1,0}, {1,0}, {0,-1}, {0,1}};
        for (int i=0;i<board.length;i++) {
            for (int j=0;j<board[0].length;j++) {
                if(dfs(i, j, board, 0, word, directions)) return true;
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, char[][] board, int idx, String word, int[][] directions) {
        if(idx == word.length()) return true;
        if(isNotValid(i, j, board)) return false;
        if(board[i][j] == word.charAt(idx)) {
            char oldValue = board[i][j];
            board[i][j] = '#';
            int posY;
            int posX;
            for (int[] direction: directions) {
                posY = i+direction[0];
                posX = j+direction[1];
                if(dfs(posY, posX, board, idx+1, word, directions)) return true;
            }
            board[i][j] = oldValue;
        }
        return false;
    }
    private boolean isNotValid(int i, int j, char[][] board) {
        return i < 0 || j < 0 || i >= board.length || j >= board[0].length;
    }
}
