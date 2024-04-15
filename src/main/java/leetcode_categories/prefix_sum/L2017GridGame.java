package leetcode_categories.prefix_sum;

public class L2017GridGame {
    public long gridGame(int[][] grid) {
        int[][] directions = new int[][] {{1,0}, {0,1}};
        int[] prefLow = new int[grid[0].length];
        prefLow[prefLow.length-1] = grid[1][prefLow.length-1];
        for (int i=prefLow.length-2;i>=0;i--) {
            prefLow[i] = prefLow[i+1] + grid[1][i];
        }
        int[] prefHigh = new int[grid[0].length];
        prefHigh[grid[0].length-1] = grid[0][grid[0].length-1] + grid[1][grid[0].length-1];
        for (int i=prefHigh.length-2;i>=1;i--) {
            prefHigh[i] = grid[0][i] + Math.max(prefHigh[i+1], prefLow[i]);
        }

        firstRobot(0,0,grid, prefLow, prefHigh);
        return dfs(0,0,grid, directions);
    }

    private void firstRobot(int posY, int posX, int[][] grid, int[] prefLow, int[] prefHigh) {
        grid[posY][posX] = 0;
        if(posX == grid[0].length-1) {
            if(posY == 0) firstRobot(1, posX, grid, prefLow, prefHigh);
            return;
        }
        if(posY == 1) {
            firstRobot(1, posX+1, grid, prefLow, prefHigh);
        } else {
            if(prefHigh[posX+1] > prefLow[posX]) {
                firstRobot(0, posX+1, grid, prefLow, prefHigh);
            } else {
                firstRobot(1, posX, grid, prefLow, prefHigh);
            }
        }
    }

    private long dfs(int posY, int posX, int[][] grid, int[][] directions) {
        long result = 0;
        for (int[] direction: directions) {
            if(isValid(posY+direction[0], posX+direction[1], grid)) {
                result = Math.max(result, grid[posY+direction[0]][posX+direction[1]]+dfs(posY+direction[0], posX+direction[1], grid, directions));
            }
        }
        return result;

    }

    private boolean isValid(int posY, int posX, int[][] grid) {
        return posY>=0 && posY < grid.length && posX>=0 && posX < grid[0].length;
    }
}
