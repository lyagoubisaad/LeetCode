package leetcode_categories.arrays_hashings;

public class L_2017_GridGame {
    public long gridGame(int[][] grid) {
        int length = grid[0].length;
        long[] topSum = new long[length];
        long[] botSum = new long[length];
        long sumTop = 0;
        long sumBot = 0;
        for (int i=0;i<length;i++) {
            botSum[i] = sumBot;
            sumBot += grid[1][i];

        }

        for (int i=length-1;i>=0;i--) {
            topSum[i] = sumTop;
            sumTop += grid[0][i];
        }
        long result = Long.MAX_VALUE;
        for (int i=0;i<length;i++) {
            long cmp = Math.max(topSum[i], botSum[i]);
            result = Math.min(result, cmp);
        }
        return result;
    }

    public static void main(String[] args) {
        //int[][] grid = {{20,3,20,17,2,12,15,17,4,15}, {20,10,13,14,15,5,2,3,14,3}};
        int[][] grid = {{3,3,1}, {8,5,2}};
        new L_2017_GridGame().gridGame(grid);
    }
}
