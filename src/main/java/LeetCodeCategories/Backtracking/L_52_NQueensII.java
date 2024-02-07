package LeetCodeCategories.Backtracking;

public class L_52_NQueensII {
    int cpt = 0;
    public int totalNQueens(int n) {
        dfs(0, n, new boolean[n], new boolean[2*n], new boolean[2*n]);
        return cpt;
    }
    private void dfs(int row, int size, boolean[] cols, boolean[] posDiag, boolean[] negDiag) {
        if (row == size) {
            cpt++;
            return;
        };
        for (int col = 0; col < size; col++) {
            if (cols[col] || posDiag[row + col] || negDiag[row - col + size]) continue;
            cols[col] = posDiag[row + col] = negDiag[row - col + size] = true;
            dfs(row + 1, size, cols, posDiag, negDiag);
            cols[col] = posDiag[row + col] = negDiag[row - col + size] = false;
        }
    }
}
