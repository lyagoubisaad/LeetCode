package leetcode_categories.slidingwindow;

import java.util.Arrays;

public class L1838FrequencyMostFrequentElement {
    public int maxFrequency(int[] nums, int k) {
        int pivot = 0;
        int maxFrequency = 0;
        Arrays.sort(nums);
        long sum = 0;
        for (int i=0;i<nums.length;i++) {
            sum += nums[i];
            while (sum + k < (long) nums[i] * (i-pivot+1)) {
                sum -=  nums[pivot++];
            }
            maxFrequency = Math.max(maxFrequency, i-pivot+1);
        }
        return maxFrequency;
    }
}
