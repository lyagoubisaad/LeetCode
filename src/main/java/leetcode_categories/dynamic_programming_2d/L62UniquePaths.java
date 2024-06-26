package leetcode_categories.dynamic_programming_2d;

public class L62UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] board = new int[m][n];
        for (int i=0;i<m;i++) {
            board[i][0] = 1;
        }
        for (int i=0;i<n;i++) {
            board[0][i] = 1;
        }
        for (int i=1;i<m;i++) {
            for (int j=1;j<n;j++) {
                board[i][j] = board[i-1][j]+board[i][j-1];
            }
        }
        return board[m-1][n-1];
    }

    public static void main(String[] args) {
        new L62UniquePaths().uniquePaths(3,7);
    }
}
