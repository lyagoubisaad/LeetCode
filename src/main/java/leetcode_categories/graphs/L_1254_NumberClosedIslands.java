package leetcode_categories.graphs;

import java.util.ArrayList;
import java.util.List;

public class L_1254_NumberClosedIslands {
    public int closedIsland(int[][] grid) {
        int[][] directions = new int[][] {{-1,0}, {1,0}, {0,-1}, {0, 1}};
        List<List<int[]>> list = new ArrayList<>();
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[i].length;j++) {
                if(grid[i][j] == 0) {
                    list.add(dfs(i,j, directions, grid));
                }
            }
        }
        int nbrIslands = list.size();
        for (int i=0;i<list.size();i++) {
            for (int j=0;j<list.get(i).size();j++) {
                if(list.get(i).get(j)[0] == 0 || list.get(i).get(j)[1] == 0 || list.get(i).get(j)[0] == grid.length-1 || list.get(i).get(j)[1] == grid[0].length-1) {
                    nbrIslands--;
                    break;
                }
            }
        }
        return nbrIslands;
    }

        private List<int[]> dfs(int posY, int posX, int[][] directions, int[][] grid) {
            grid[posY][posX] = 1;
            List<int[]> list = new ArrayList<>();
            list.add(new int[] {posY, posX});
            for (int[] direction: directions) {
                if(isNotValid(posY+direction[0], posX+direction[1], grid)) continue;
                if(grid[posY+direction[0]][posX+direction[1]] == 1) continue;
                list.addAll(dfs(posY+direction[0], posX+direction[1], directions, grid));
            }
            return list;
        }

    private boolean isNotValid(int posY, int posX, int[][] grid) {
        return (posY<0 || posY >= grid.length || posX<0 || posX>= grid[0].length);
    }
}
