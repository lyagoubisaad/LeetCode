package leetcode_categories.graphs;

import java.util.ArrayList;
import java.util.List;

public class L1992FindAllGroupsFarmland {
    public int[][] findFarmland(int[][] land) {
        int[][] directions = new int[][] {{1,0}, {-1,0}, {0,1}, {0,-1}};
        List<int[]> result = new ArrayList<>();
        int[] curr;
        for (int i=0;i<land.length;i++) {
            for (int j=0;j<land[0].length;j++) {
                if(land[i][j] == 0) continue;
                curr = dfs(i, j, land, directions);
                result.add(new int[] {i, j, curr[0], curr[1]});
            }
        }
        return result.toArray(int[][]::new);
    }

    private int[] dfs(int posY, int posX, int[][] land, int[][] directions) {
        if(land[posY][posX] == 0) return new int[] {0, 0};
        land[posY][posX] = 0;
        int[] curr;
        for (int[] direction: directions) {
            if(isValid(direction[0]+ posY, direction[1]+posX, land)) {
                curr = dfs(posY+direction[0], posX+direction[1], land, directions);
                if(curr[0] + curr[1] > posY + posX) {
                    posY = curr[0];
                    posX = curr[1];
                }
            }
        }
        return new int[] {posY, posX};
    }

    private boolean isValid(int posY, int posX, int[][] land) {
        return posX >= 0 && posY >= 0 && posX < land[0].length && posY < land.length;
    }
}
