package leetcode_categories.dynamic_programming_2d;

public class L10RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        Boolean[][] dp = new Boolean[s.length()+1][p.length()+1];
        return dfs(0, s, 0, p, dp);
    }

    public boolean dfs(int i, String s, int j, String p, Boolean[][] dp) {
        if(dp[i][j] != null) return dp[i][j];
        if(j == p.length()) return dp[i][j] = i == s.length();
        boolean firstMatch = i != s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
        boolean secondMatch;
        if(p.length() - j > 1 && p.charAt(j+1) == '*') secondMatch = dfs(i, s, j+2, p, dp) || firstMatch && dfs(i+1, s, j, p, dp);
        else secondMatch = firstMatch && dfs(i+1, s, j+1, p, dp);
        return dp[i][j] = secondMatch;
    }
}
