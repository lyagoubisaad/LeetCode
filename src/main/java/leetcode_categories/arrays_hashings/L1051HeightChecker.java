package leetcode_categories.arrays_hashings;

import java.util.Arrays;

public class L1051HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        System.arraycopy(heights, 0, expected, 0, expected.length);
        Arrays.sort(expected);
        int heightChecker = 0;
        for (int i=0;i<heights.length;i++) {
            if(heights[i] != expected[i]) heightChecker++;
        }
        return heightChecker;
    }
}
