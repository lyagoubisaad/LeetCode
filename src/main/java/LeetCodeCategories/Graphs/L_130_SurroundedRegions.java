package LeetCodeCategories.Graphs;

public class L_130_SurroundedRegions {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O') {
                bfs(board, 0, j);
            }
            if (board[rows - 1][j] == 'O') {
                bfs(board, rows-1, j);
            }
        }
        for (int i=0;i<rows;i++) {
            if(board[i][0] == 'O') {
                bfs(board, i, 0);
            }
            if(board[i][cols-1] == 'O') {
                bfs(board, i, cols-1);
            }
        }
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == 'V') board[i][j] = 'O';
            }
        }
    }

    private void bfs(char[][] board, int i, int j) {
        if(i<0 || i>= board.length || j<0 || j>= board[0].length || board[i][j] == 'X') return;
        board[i][j] = 'V';
        bfs(board, i-1, j);
        bfs(board, i+1, j);
        bfs(board, i, j-1);
        bfs(board, i, j+1);
    }

    public static void main(String[] args) {
        char[][] board = new char[][]
                {{'O', 'X', 'X', 'O', 'X'}, {'X', 'O', 'O', 'X', 'O'}, {'X', 'O', 'X', 'O', 'X'}, {'O', 'X', 'O', 'O', 'O'}, {'X', 'X', 'O', 'X', 'O'}};
        new L_130_SurroundedRegions().solve(board);
    }
}
