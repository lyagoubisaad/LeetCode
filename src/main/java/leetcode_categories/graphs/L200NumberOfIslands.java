package leetcode_categories.graphs;

public class L200NumberOfIslands {
    public int numIslands(char[][] grid) {
        int[][] directions = new int[][] {{-1,0}, {1,0}, {0,-1}, {0,1}};
        int numIslands = 0;
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[0].length;j++) {
                if(bfs(i, j, grid, directions)) numIslands++;
            }
        }
        return numIslands;
    }

    private boolean bfs(int i, int j, char[][] grid, int[][] directions) {
        if(i < 0 || j<0 || i>= grid.length || j>=grid[0].length || grid[i][j] == '0') return false;
        grid[i][j] = '0';
        for (int[] direction: directions) {
            bfs(i+direction[0], j+direction[1], grid, directions);
        }
        return true;
    }
}
