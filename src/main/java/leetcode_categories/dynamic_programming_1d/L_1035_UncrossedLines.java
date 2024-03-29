package leetcode_categories.dynamic_programming_1d;

import java.util.Arrays;

public class L_1035_UncrossedLines {
    /*
    made the same solution as lcs, but I don't understand why it's working ...
     */
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] memo = new int[nums1.length][nums2.length];
        for (int i=0;i<nums1.length;i++) {
            Arrays.fill(memo[i], -1);
        }
        return helper(nums1, nums2, 0,0, memo);
    }

    private int helper(int[] nums1, int[] nums2, int i, int j, int[][] memo) {
        if(i == nums1.length || j==nums2.length) return 0;
        if(memo[i][j] != -1) return memo[i][j];
        if(nums1[i] == nums2[j]) return memo[i][j] = 1+helper(nums1,nums2, i+1,j+1, memo);
        return memo[i][j] = Math.max(helper(nums1,nums2,i+1,j,memo), helper(nums1,nums2,i,j+1,memo));
    }
}
