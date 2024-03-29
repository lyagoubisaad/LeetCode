package leetcode_categories.math_geometry;

public class L_48_RotateImage {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i=0;i<rows;i++) {
            for (int j=i;j<cols;j++) {
                int element = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = element;
            }
        }
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols/2;j++) {
                int element = matrix[i][j];
                matrix[i][j] = matrix[i][cols-1-j];
                matrix[i][cols-1-j] = element;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        new L_48_RotateImage().rotate(matrix);
    }
}
