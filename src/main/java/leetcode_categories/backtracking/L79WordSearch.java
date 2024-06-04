package leetcode_categories.backtracking;

public class L79WordSearch {
    public boolean exist(char[][] board, String word) {
        int[][] directions = new int[][] {{-1,0}, {1,0}, {0,-1}, {0,1}};
        for (int i=0;i<board.length;i++) {
            for (int j=0;j<board[0].length;j++) {
                if(dfs(i, j, board, new boolean[board.length][board[0].length], 0, word, directions)) return true;
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, char[][] board, boolean[][] seen, int idx, String word, int[][] directions) {
        if(idx >= word.length()) return true;
        if(idx == word.length()-1 && word.charAt(idx) == board[i][j]) return true;
        if(board[i][j] == word.charAt(idx)) {
            for (int[] direction: directions) {
                if(isNotValid(i+direction[0], j+direction[1], board) || seen[i+direction[0]][j+direction[1]]) continue;
                seen[i][j] = true;
                if(dfs(i+direction[0], j+ direction[1], board, seen, idx+1, word, directions)) return true;
            }
        }
        return false;
    }

    private boolean isNotValid(int i, int j, char[][] board) {
        return i < 0 || j < 0 || i >= board.length || j >= board[0].length;
    }
}
