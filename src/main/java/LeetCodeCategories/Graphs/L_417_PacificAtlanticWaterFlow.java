package LeetCodeCategories.Graphs;

import java.util.ArrayList;
import java.util.List;

public class L_417_PacificAtlanticWaterFlow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        int rows = heights.length;
        int cols = heights[0].length;
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                if(bfs(heights, i, j)) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(i);
                    tmp.add(j);
                    res.add(new ArrayList<>(tmp));
                }
            }
        }
        return res;
    }
    public boolean bfs(int[][] heights, int i, int j) {
        boolean canPacific = canPacific(heights, i, j, heights[i][j]);
        boolean canAtlantic = canAtlantic(heights, i, j, heights[i][j]);
        return canPacific && canAtlantic;
    }
    public boolean canAtlantic(int[][] heights, int i, int j, int value) {
        if(i < 0 || i >= heights.length || j < 0 || j>= heights[0].length || value < heights[i][j] || heights[i][j] == -1) return false;
        if(i == heights.length-1 || j == heights[0].length-1) return true;
        int currValue = heights[i][j];
        heights[i][j] = -1;
        boolean res = canAtlantic(heights, i-1, j, currValue) ||
                canAtlantic(heights, i+1, j, currValue) ||
                canAtlantic(heights, i, j-1, currValue) ||
                canAtlantic(heights, i, j+1, currValue);
        heights[i][j] = currValue;
        return res;
    }
    public boolean canPacific(int[][] heights, int i, int j, int value) {
        if(i < 0 || i >= heights.length || j < 0 || j>= heights[0].length || value < heights[i][j] || heights[i][j] == -1) return false;
        if(i == 0 || j == 0) return true;
        int currValue = heights[i][j];
        heights[i][j] = -1;
        boolean res = canPacific(heights, i-1, j, currValue) ||
                canPacific(heights, i+1, j, currValue) ||
                canPacific(heights, i, j-1, currValue) ||
                canPacific(heights, i, j+1, currValue);
        heights[i][j] = currValue;
        return res;
    }
}
