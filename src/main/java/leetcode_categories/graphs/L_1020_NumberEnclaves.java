package leetcode_categories.graphs;

public class L_1020_NumberEnclaves {
    public int numEnclaves(int[][] grid) {
        int nbrEnclaves = 0;
        int[][] directions = new int[][] {{-1,0}, {1,0}, {0,-1}, {0, 1}};
        for (int j=0;j<grid[0].length;j++) {
            if(grid[0][j] == 1) dfs(0,j, grid, directions);
            if(grid[grid.length-1][j] == 1) dfs(grid.length-1,j, grid, directions);
        }
        for (int i=0;i<grid.length;i++) {
            if(grid[i][0] == 1) dfs(i, 0, grid, directions);
            if(grid[i][grid[0].length-1] == 1) dfs(i, grid[0].length-1, grid, directions);
        }
        for (int i=1;i<grid.length-1;i++) {
            for (int j=1;j<grid[0].length-1;j++) {
                if(grid[i][j] == 1) {
                    nbrEnclaves += dfs(i,j, grid, directions);
                }
            }
        }
        return nbrEnclaves;
    }

    private int dfs(int posY, int posX, int[][] grid, int[][] directions) {
        int nbrEnclaves = 1;
        grid[posY][posX] = 0;
        for (int[] direction: directions) {
            if(isNotValid(posY+direction[0], posX+direction[1], grid)) continue;
            if(grid[posY+direction[0]][posX+direction[1]] == 0 ) continue;
            nbrEnclaves += dfs(posY+direction[0], posX+direction[1], grid, directions);
        }
        return nbrEnclaves;
    }

    private boolean isNotValid(int posY, int posX, int[][] grid) {
        return (posY<0 || posX<0 || posY>= grid.length || posX>= grid[0].length);
    }

}
