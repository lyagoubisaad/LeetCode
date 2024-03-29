package leetcode_categories.greedy;

public class L_1871_JumpGameVII {
    public static boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        boolean[] dp = new boolean[n];
        dp[0] = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == '1') continue;

            for (int j = Math.max(0, i - maxJump); j <= Math.min(i - minJump, n - 1); j++) {
                if (dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n - 1];
    }
}
