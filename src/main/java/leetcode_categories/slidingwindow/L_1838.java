package leetcode_categories.slidingwindow;

import java.util.Arrays;

public class L_1838 {
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        long tot = 0;
        int res = 0;
        for (int r = 0; r < nums.length; r++) {
            tot += nums[r];
            while ((long) nums[r] * (r - l + 1)-tot > k) {
                tot -= nums[l];
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        maxFrequency(new int[]{1, 4, 8, 13}, 5);
    }
}
