package leetcode_categories.prefix_sum;

import java.util.HashMap;

public class L560SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length+1];
        HashMap<Integer,Integer> store = new HashMap<>();
        prefix[0] = 0;
        store.put(0,1);
        int subarraySum = 0;
        for (int i=0;i<nums.length;i++) {
            prefix[i+1] = prefix[i] + nums[i];
            subarraySum += store.getOrDefault(prefix[i+1]-k, 0);
            store.put(prefix[i+1], store.getOrDefault(prefix[i+1], 0)+1);
        }
        return subarraySum;
    }
}
