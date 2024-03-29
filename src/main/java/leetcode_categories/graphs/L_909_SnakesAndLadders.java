package leetcode_categories.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class L_909_SnakesAndLadders {
    private void reverseBoard(int[][] board) {
        int low = 0;
        int high = board.length-1;
        while(low<high) {
            int[] tmp = board[low];
            board[low] = board[high];
            board[high] = tmp;
            low++;high--;
        }
    }
    public int snakesAndLadders(int[][] board) {
        reverseBoard(board);
        int length = board.length;
        int max = length * length;
        int[] dp = new int[max+1];
        boolean[] visited = new boolean[max];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;
        dp[1] = 0;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            int low = current + 1;
            int high = Math.min(current + 6, max);
            if (high == max) return dp[current] + 1;
            for (int j = low; j <= high; j++) {
                int next = j;
                int row = (next-1)/length;
                int column = (next-1)%length;
                if(row % 2 != 0) column=length-1-column;
                if(board[row][column] !=-1) next = board[row][column];
                if(next==max) return dp[current] + 1;
                if(!visited[next]) {
                    visited[next] = true;
                    dp[next] = dp[current]+1;
                    queue.offer(next);
                }
            }
        }
        return -1;
    }
}
