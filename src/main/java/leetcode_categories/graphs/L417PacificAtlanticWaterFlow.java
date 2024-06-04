package leetcode_categories.graphs;

import java.util.ArrayList;
import java.util.List;

public class L417PacificAtlanticWaterFlow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int[][] directions = new int[][] {{-1,0}, {1,0}, {0,-1}, {0,1}};
        List<List<Integer>> pacificAtlantic = new ArrayList<>();
        boolean[][] pacific = new boolean[heights.length][heights[0].length];
        boolean[][] atlantic = new boolean[heights.length][heights[0].length];
        for (int i=0;i<heights.length;i++) {
            for (int j=0;j<heights[0].length;j++) {
                dfs(i, j, heights, directions, pacific, atlantic, new boolean[heights.length][heights[0].length]);
            }
        }
        for (int i=0;i<heights.length;i++) {
            for (int j=0;j<heights[0].length;j++) {
                if(pacific[i][j] && atlantic[i][j]) {
                    pacificAtlantic.add(List.of(i,j));
                }
            }
        }
        return pacificAtlantic;
    }

    private void dfs(int i, int j, int[][] heights, int[][] directions, boolean[][] pacific, boolean[][] atlantic, boolean[][] seen) {
        if(i == 0 || j== 0) {
            pacific[i][j] = true;
        }
        if(i == heights.length-1 || j==heights[0].length-1) {
            atlantic[i][j] = true;
        }
        if(atlantic[i][j] && pacific[i][j]) return;
        seen[i][j] = true;
        for (int[] direction: directions) {
            if(isValid(i+direction[0], j+direction[1], heights) && !seen[i + direction[0]][j + direction[1]]) {
                dfs(i+direction[0], j+direction[1], heights, directions, pacific, atlantic, seen);
                if(heights[i+direction[0]][j+direction[1]] > heights[i][j]) return;
                else {
                    atlantic[i][j] |= atlantic[i+direction[0]][j+direction[1]];
                    pacific[i][j] |= pacific[i+direction[0]][j+direction[1]];
                }
            }
        }
    }

    private boolean isValid(int i, int j, int[][] heights) {
        return i >= 0 && j >= 0 && i < heights.length && j < heights[0].length;
    }

}
