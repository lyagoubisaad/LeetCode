package leetcode_categories.dynamic_programming_2d;

public class L1639NumberWaysFormTargetStringGivenDictionary {
    public int numWays(String[] words, String target) {
        final int MOD = 1_000_000_007;
        final int targetLength = target.length();
        final int wordLength = words[0].length();

        int[][] store = new int[26][wordLength + 1];

        for (String word : words) {
            for (int j = 0; j < wordLength; j++) {
                store[word.charAt(j) - 'a'][j]++;
            }
        }

        long[][] dp = new long[targetLength + 1][wordLength + 1];
        dp[0][0] = 1;
        for (int length = 0; length <= targetLength; length++) {
            for (int col = 0; col < wordLength; col++) {
                if (length < targetLength) {
                    dp[length + 1][col + 1] += store[target.charAt(length) - 'a'][col] * dp[length][col];
                    dp[length + 1][col + 1] %= MOD;
                }
                dp[length][col + 1] += dp[length][col];
                dp[length][col + 1] %= MOD;
            }
        }
        return (int) dp[targetLength][wordLength];
    }
}
