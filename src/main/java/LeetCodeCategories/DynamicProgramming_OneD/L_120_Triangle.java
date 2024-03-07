package LeetCodeCategories.DynamicProgramming_OneD;

import java.util.*;

public class L_120_Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] memo = new int[triangle.size()];
        List<Integer> lastRow = triangle.get(triangle.size() - 1);
        for (int i = 0; i < lastRow.size(); i++) {
            memo[i] = lastRow.get(i);
        }
        for (int row = triangle.size() - 2; row >= 0; row--) {
            List<Integer> currentRow = triangle.get(row);
            for (int col = 0; col < currentRow.size(); col++) {
                int value = currentRow.get(col);
                memo[col] = value + Math.min(memo[col], memo[col + 1]);
            }
        }
        return memo[0];
    }
}
