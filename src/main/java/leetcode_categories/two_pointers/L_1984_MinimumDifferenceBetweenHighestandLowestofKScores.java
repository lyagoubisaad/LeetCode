package leetcode_categories.two_pointers;

import java.util.Arrays;

public class L_1984_MinimumDifferenceBetweenHighestandLowestofKScores {
    public static int minimumDifference(int[] nums, int k) {
        if(k == 1) return 0;
        Arrays.sort(nums);
        int sum;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<nums.length-k+1;i++) {
            sum = nums[i+k-1] - nums[i];
            min = Math.min(min, sum);
        }
        return min;
    }

    public static void main(String[] args) {
        minimumDifference(new int[] {87063,61094,44530,21297,95857,93551,9918}, 6);
    }
}
