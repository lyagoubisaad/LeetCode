package LeetCodeCategories.Backtracking;

public class L_79_WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (dfs(board, word, 0, i, j))
                    return true;
            }
        }
        return false;
    }
    private boolean dfs(char[][] board, String word, int index, int i, int j) {
        if (index == word.length())
            return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || word.charAt(index) != board[i][j])
            return false;

        // Temporarily mark the current cell as visited
        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = dfs(board, word, index + 1, i - 1, j) || // Check up
                dfs(board, word, index + 1, i + 1, j) || // Check down
                dfs(board, word, index + 1, i, j - 1) || // Check left
                dfs(board, word, index + 1, i, j + 1); // Check right

        // Restore the original value of the current cell
        board[i][j] = temp;
        return found;
    }

    public static void main(String[] args) {
        new L_79_WordSearch().exist(new char[][] {{'a'}, {'b'}}, "ba");
    }
}
