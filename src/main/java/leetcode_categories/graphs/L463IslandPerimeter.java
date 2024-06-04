package leetcode_categories.graphs;

public class L463IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int[][] directions = new int[][] {{-1,0},{1,0},{0,-1},{0,1}};
        int sum = 0;
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[0].length;j++) {
                if(grid[i][j] == 1) {
                    for (int[] direction: directions) {
                        if(!isValid(i+direction[0], j+direction[1], grid) || grid[i+direction[0]][j+direction[1]] == 0 )
                            sum++;
                    }
                }
            }
        }
        return sum;
    }
    private boolean isValid(int posY, int posX, int[][] grid) {
        return posY < grid.length && posY >= 0 && posX < grid[0].length && posX >= 0;
    }
}
