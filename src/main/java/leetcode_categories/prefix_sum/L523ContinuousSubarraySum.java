package leetcode_categories.prefix_sum;

import java.util.HashMap;
import java.util.Map;

public class L523ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1); // Handling the case when sum from index 0 to current index is divisible by k
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum %= k;
            if (remainderMap.containsKey(sum)) {
                if (i - remainderMap.get(sum) > 1) {
                    return true; // Subarray found with sum divisible by k
                }
            } else {
                remainderMap.put(sum, i);
            }
        }
        return false;
    }
}