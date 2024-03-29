package leetcode_categories.backtracking;

import java.util.Arrays;

public class L_698_PartitionKEqualSumSubsets {
    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        Arrays.sort(nums);
        reverseArray(nums);
        for (int num: nums) {
            sum += num;
        }
        if(sum%k !=0) return false;
        return dfs(0, nums, new int[k], sum/k);
    }

    private static void reverseArray(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while (i<j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i++;
            j--;
        }
    }

    private static boolean dfs(int idx, int[] nums, int[] store, int avg) {
        if(idx == nums.length) {
            for (int i=1;i<store.length;i++) {
                if(store[i] != store[0]) return false;
            }
            return true;
        }
        for (int i=0;i<store.length;i++) {
            if(store[i] + nums[idx] > avg) continue;
            store[i] += nums[idx];
            if(dfs(idx+1, nums, store, avg)) return true;
            store[i] -= nums[idx];
        }
        return false;
    }
}
