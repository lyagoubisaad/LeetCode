package LeetCodeCategories.Greedy;

import java.util.Arrays;

public class L_646_MaximumLengthOfPairChain {

    public int findLongestChain(int[][] pairs) {
        int res = 0;
        if (pairs == null || pairs.length == 0) return res;
        /*
            it's important to note that the array should be sorted based on the right element rather than the left element,
            since the left element (i) is always less than the right element (i).
        */
        Arrays.sort(pairs, (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        int elem = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (elem < pairs[i][0]) {
                res++;
                elem = pairs[i][1];
            }
        }
        return res + 1;
    }

    public static void main(String[] args) {
        int[][] pairs = { {-6, 9}, {1, 6}, {8, 10}, {-1, 4}, {-6, -2}, {-9, 8}, {-5, 3}, {0, 3} };
        new L_646_MaximumLengthOfPairChain().findLongestChain(pairs);
    }
}
