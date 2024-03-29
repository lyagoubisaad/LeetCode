package leetcode_categories.math_geometry;

public class L_59_SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top=0;
        int left=0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;
        int cpt = 1;
        while (top <= bottom || left <= right) {
            for (int i=left;i<=right;i++) {
                matrix[top][i] = cpt++;
            }
            top++;
            for (int i=top;i<=bottom;i++) {
                matrix[i][right] = cpt++;
            }
            right--;

            for (int i=right;i>=left;i--) {
                matrix[bottom][i] = cpt++;
            }
            bottom--;
            for (int i=bottom;i>=top;i--) {
                matrix[i][left] = cpt++;
            }
            left++;
        }
        return matrix;
    }
}
