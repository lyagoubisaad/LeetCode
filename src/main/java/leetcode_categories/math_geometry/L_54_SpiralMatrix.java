package leetcode_categories.math_geometry;

import java.util.ArrayList;
import java.util.List;

public class L_54_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top=0;
        int left=0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;
        while (top <= bottom || left <= right) {
            for (int i=left;i<=right;i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i=top;i<=bottom;i++) {
                list.add(matrix[i][right]);
            }
            right--;

            for (int i=right;i>=left;i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            for (int i=bottom;i>=top;i--) {
                list.add(matrix[left][i]);
            }
            left++;
        }
        return list;
    }

    public static void main(String[] args) {
        new L_54_SpiralMatrix().spiralOrder(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}});
    }
}
