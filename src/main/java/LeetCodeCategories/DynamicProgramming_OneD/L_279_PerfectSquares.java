package LeetCodeCategories.DynamicProgramming_OneD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_279_PerfectSquares {
    public int numSquares(int n) {
        List<Integer> perfectSquares = new ArrayList<>();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 1);
        dp[0] = 0;
        perfectSquares.add(1);
        for (int i=2;i<n;i++) {
            if((i*i)>n) break;
            perfectSquares.add(i*i);
        }
        for (int i = 1; i <= n; i++) {
            for (int square : perfectSquares) {
                if (square <= i) {
                    dp[i] = Math.min(dp[i], dp[i - square] + 1);
                }
            }
        }
        return dp[n];
    }
}
