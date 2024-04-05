package leetcode_categories.dynamic_programming_2d;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L1220CountVowelsPermutation {

    int mod = 1000000007;
    public int countVowelPermutation(int n) {
        int[][] dp = new int[5][n];
        HashMap<Integer, List<Integer>> perms = new HashMap<>();
        perms.put(0, List.of(1));
        perms.put(1, List.of(0, 2));
        perms.put(2, List.of(0,1,3,4));
        perms.put(3, List.of(2, 4));
        perms.put(4, List.of(0));
        int cpt = 0;
        for (Map.Entry<Integer, List<Integer>> entry : perms.entrySet()) {
            cpt = (cpt + dfs(entry.getKey(), perms, n - 1, dp))%mod;
        }
        return cpt;
    }

    int dfs(int curr, HashMap<Integer, List<Integer>> perms, int n, int[][] dp) {
        if (n == 0) return 1;
        if (dp[curr][n] == 0) {
            for (Integer c : perms.get(curr)) {
                dp[curr][n] = (dp[curr][n] + dfs(c, perms, n - 1, dp)) % mod;
            }
        }
        return dp[curr][n];
    }
}
