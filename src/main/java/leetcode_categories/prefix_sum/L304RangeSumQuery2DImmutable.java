package leetcode_categories.prefix_sum;

public class L304RangeSumQuery2DImmutable {
    int[][] matrix;
    public L304RangeSumQuery2DImmutable(int[][] matrix) {
        this.matrix = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i=row1;i<=row2;i++) {
            for (int j=col1;j<=col2;j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

}
