package LeetCodeCategories.DynamicProgramming_OneD;

public class L_1137_NthTribonacciNumber {
    public int tribonacci(int n) {
        int[] memo = new int[n+1];
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        memo[1] = 1;
        memo[2] = 1;
        return helper(n, memo);
    }

    public int helper(int n, int[] memo) {
        if(n==0) return 0;
        if(memo[n] != 0) return memo[n];
        return memo[n] = helper(n-3, memo)+helper(n-1, memo)+helper(n-2, memo);
    }
}
