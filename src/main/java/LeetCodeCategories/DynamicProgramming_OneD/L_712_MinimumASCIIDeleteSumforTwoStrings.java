package LeetCodeCategories.DynamicProgramming_OneD;

public class L_712_MinimumASCIIDeleteSumforTwoStrings {

    public static String getLCS(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                sb.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        return sb.reverse().toString();
    }

    public static int getAsciiCodes(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
            System.out.println((int)input.charAt(i));
            sum += input.charAt(i);
        }
        return sum;
    }

    public static int minimumDeleteSum(String s1, String s2) {
        int first = getAsciiCodes(s1);
        System.out.println(first);
        int second = getAsciiCodes(s2);
        System.out.println(second);
        int third = getAsciiCodes(getLCS(s1,s2));
        System.out.println(third);
        return (getAsciiCodes(s1)+getAsciiCodes(s2)-(getAsciiCodes(getLCS(s1,s2))*2));
    }

    public static void main(String[] args) {
            System.out.println(minimumDeleteSum("delete","leet"));
    }
}
