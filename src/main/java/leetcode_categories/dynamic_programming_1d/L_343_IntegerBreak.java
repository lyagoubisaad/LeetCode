package leetcode_categories.dynamic_programming_1d;

public class L_343_IntegerBreak {
    public int integerBreak(int n) {
        int[] memo = new int[n+1];
        if(n == 2) return 1;
        if(n==3) return 2;
        helper(n, memo);
        return memo[n];
    }

    public int helper(int n, int[] memo) {
        if(n==2) return 2;
        if(n==1) return 1;
        if(n==0) return 1;
        if(memo[n] != 0) return memo[n];
        memo[n] = Math.max(2*helper(n-2, memo), 3*helper(n-3, memo));
        return memo[n];
    }
}
