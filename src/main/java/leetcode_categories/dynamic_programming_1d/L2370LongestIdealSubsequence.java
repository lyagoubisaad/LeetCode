package leetcode_categories.dynamic_programming_1d;

public class L2370LongestIdealSubsequence {
    public int longestIdealString(String s, int k) {
        int[][] memo = new int[s.length()][26];
        int max = 0;
        for (int i=0;i<s.length();i++) {
            max = Math.max(max, dfs(i, s, k, s.charAt(i)-'a', memo));
        }
        return max;
    }
    private int dfs(int idx, String s, int k, int prvOrd, int[][] memo) {
        if(idx == s.length()) return 0;
        if(memo[idx][prvOrd] == 0) {
            int max;
            int currOrd = s.charAt(idx)-'a';
            if(Math.abs(currOrd-prvOrd) <= k) {
                int take = 1+dfs(idx+1, s, k, currOrd, memo);
                int leave = dfs(idx+1, s, k, prvOrd, memo);
                max = Math.max(take, leave);
            } else {
                max = dfs(idx+1, s, k, prvOrd, memo);
            }
            memo[idx][prvOrd] = max;
        }
        return memo[idx][prvOrd];
    }
}
