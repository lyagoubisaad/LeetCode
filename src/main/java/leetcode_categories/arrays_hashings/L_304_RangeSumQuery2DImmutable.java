package leetcode_categories.arrays_hashings;

public class L_304_RangeSumQuery2DImmutable {
    int[][] matrix;
    public L_304_RangeSumQuery2DImmutable(int[][] matrix) {
        this.matrix = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total = 0;
        for (int i=row1;i<=row2;i++) {
            for (int j=col1;j<=col2;j++) {
                total += matrix[i][j];
            }
        }
        return total;
    }
}
