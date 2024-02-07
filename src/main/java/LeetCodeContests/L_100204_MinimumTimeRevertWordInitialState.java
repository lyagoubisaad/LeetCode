package LeetCodeContests;

import java.util.ArrayDeque;
import java.util.Queue;

public class L_100204_MinimumTimeRevertWordInitialState {
    public static int minimumTimeToInitialState(String word, int k) {
        int cpt = 0;
        int j = 0;
        int n = word.length();
        char[] wordChars = word.toCharArray();
        while (j<n) {
            cpt++;
            j = k*cpt;
            int i=0;
            while (j< n && wordChars[j] == wordChars[i]) {
                i++;
                j++;
            }
            if(j == n) break;
        }
        return cpt;
    }
}
