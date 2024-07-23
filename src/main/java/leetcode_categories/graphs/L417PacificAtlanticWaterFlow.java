package leetcode_categories.graphs;

import java.util.ArrayList;
import java.util.List;

public class L417PacificAtlanticWaterFlow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> pacificAtlantic = new ArrayList<>();
        boolean[][] pacific = new boolean[heights.length][heights[0].length];
        boolean[][] atlantic = new boolean[heights.length][heights[0].length];
        for (int i=0;i<heights.length;i++) {
            atlantic[i][heights[0].length-1] = true;
            pacific[i][0] = true;
        }
        for (int i=0;i<heights[0].length;i++) {
            atlantic[heights.length-1][i] = true;
            pacific[0][i] = true;
        }
        int[][] directions = new int[][] {{-1,0}, {1,0}, {0,-1}, {0,1}};
        for (int i=0;i<heights.length;i++) {
            for (int j=0;j<heights[i].length;j++) {
                if(isPacific(i, j, heights, pacific, directions) && isAtlantic(i, j, heights, atlantic, directions)) pacificAtlantic.add(List.of(i,j));
            }
        }
        return pacificAtlantic;
    }

    private boolean isPacific(int i, int j, int[][] heights, boolean[][] pacific, int[][] directions) {
        if(pacific[i][j]) return true;
        int oldValue = heights[i][j];
        heights[i][j] = -1;
        for (int[] direction: directions) {
            if(isNotValid(direction[0]+i, direction[1]+j, heights) || heights[i+direction[0]][j+direction[1]] == -1 || oldValue < heights[i+direction[0]][j+direction[1]]) continue;
            pacific[i][j] = isPacific(direction[0]+i, direction[1]+j, heights, pacific, directions);
            if(pacific[i][j]) break;
        }
        heights[i][j] = oldValue;
        return pacific[i][j];
    }

    private boolean isNotValid(int i, int j, int[][] heights) {
        return i < 0 || i >= heights.length || j < 0 || j >= heights[0].length;
    }

    private boolean isAtlantic(int i, int j, int[][] heights, boolean[][] atlantic, int[][] directions) {
        if(atlantic[i][j]) return true;
        int oldValue = heights[i][j];
        heights[i][j] = -1;
        for (int[] direction: directions) {
            if(isNotValid(direction[0]+i, direction[1]+j, heights) || heights[i+direction[0]][j+direction[1]] == -1 || oldValue < heights[i+direction[0]][j+direction[1]]) continue;
            atlantic[i][j] = isAtlantic(direction[0]+i, direction[1]+j, heights, atlantic, directions);
            if(atlantic[i][j]) break;
        }
        heights[i][j] = oldValue;
        return atlantic[i][j];
    }

}
