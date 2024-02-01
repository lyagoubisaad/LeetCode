package LeetCodeCategories.oneD_DynamicProgramming;

import java.util.Arrays;

public class L_354_RussianDollEnvelopes {

    public static int maxEnvelopes(int[][] envelopes) {
        int[] maxEnvelopes = new int[envelopes.length];
        Arrays.fill(maxEnvelopes,1);
        int max = 1;
        Arrays.sort(envelopes, (a,b) -> a[0]==b[0]? Integer.compare(a[1], b[1]): Integer.compare(a[0], b[0]));
        for (int i=1;i<envelopes.length;i++) {
            for (int j=0;j<i;j++){
                if(envelopes[j][0] < envelopes[i][0] && envelopes[j][1] < envelopes[i][1]) {
                    maxEnvelopes[i] = Math.max(maxEnvelopes[i], maxEnvelopes[j]+1);
                }
            }
            max = Math.max(max, maxEnvelopes[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        maxEnvelopes(new int[][] {{5,5},{5,4},{6,4},{6,7},{2,3}});
    }
}