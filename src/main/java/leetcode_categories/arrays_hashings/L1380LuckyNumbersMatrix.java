package leetcode_categories.arrays_hashings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class L1380LuckyNumbersMatrix {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int minRow;
        int[] maxCols = new int[matrix[0].length];
        int[] minRows  = new int[matrix.length];
        int val;
        for (int i=0;i<matrix.length;i++) {
            minRow = Integer.MAX_VALUE;
            for (int j=0;j<matrix[0].length;j++) {
                val = matrix[i][j];
                maxCols[j] = Math.max(maxCols[j], val);
                minRow = Math.min(minRow, val);
            }
            minRows[i] = minRow;
        }
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int maxCol : maxCols) {
            set.add(maxCol);
        }
        for (int row : minRows) {
            if (!set.add(row)) result.add(row);
        }
        return result;
    }
}
