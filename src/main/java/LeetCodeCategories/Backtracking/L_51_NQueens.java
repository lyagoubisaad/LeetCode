package LeetCodeCategories.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_51_NQueens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        dfs(0, n, result, new ArrayList<>(), new boolean[n], new boolean[2*n], new boolean[2*n]);
        return result;
    }

    private static void dfs(int row, int size, List<List<String>> result, List<String> current, boolean[] cols, boolean[] posDiag, boolean[] negDiag) {
        if (row == size) {
            result.add(new ArrayList<>(current));
            return;
        }
        char[] rowString = new char[size];
        Arrays.fill(rowString, '.');
        for (int col = 0; col < size; col++) {
            if (cols[col] || posDiag[row + col] || negDiag[row - col + size]) continue;
            cols[col] = posDiag[row + col] = negDiag[row - col + size] = true;
            rowString[col] = 'Q';
            current.add(String.valueOf(rowString));
            dfs(row + 1, size, result, current, cols, posDiag, negDiag);
            current.remove(current.size() - 1);
            rowString[col] = '.';
            cols[col] = posDiag[row + col] = negDiag[row - col + size] = false;
        }
    }
}
