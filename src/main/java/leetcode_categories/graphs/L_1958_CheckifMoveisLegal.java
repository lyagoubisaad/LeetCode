package leetcode_categories.graphs;

public class L_1958_CheckifMoveisLegal {
    public boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        int[][] directions = new int[][] {{-1,0},{1,0},{0,1},{0,-1},{1,1},{-1,-1},{1,-1},{-1,1}};
        for (int[] direction : directions) {
            if(dfs(board, rMove, cMove, direction, color)) return true;
        }
        return false;
    }

    private boolean dfs(char[][] board, int rMove, int cMove, int[] directions, char color) {
        rMove += directions[0];
        cMove += directions[1];
        int length = 1;
        while (rMove >=0 && rMove < board.length && cMove >= 0 && cMove < board[0].length) {
            if(board[rMove][cMove] == '.') return false;
            if(board[rMove][cMove] == color) return length >=3;
            rMove += directions[0];
            cMove += directions[1];
            length++;
        }
        return false;
    }
}
