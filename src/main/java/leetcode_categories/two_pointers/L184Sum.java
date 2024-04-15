package leetcode_categories.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L184Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int first;
        int second;
        int third;
        int forth;
        long sum;
        int k;
        int l;
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0;i<nums.length-3;i++) {
            if(i != 0 && nums[i] == nums[i-1]) continue;
            first = nums[i];
            for (int j=i+1;j<nums.length-2;j++) {
                if(j != i+1 && nums[j] == nums[j-1]) continue;
                second = nums[j];
                k = j+1;
                l = nums.length-1;
                while (k<l) {
                    third = nums[k];
                    forth = nums[l];
                    sum = (long) first + second + third + forth;
                    if(sum == target) {
                        result.add(List.of(first, second, third, forth));
                        k++;
                        l--;
                        while (k<l && nums[k] == nums[k-1]) k++;
                        while (k<l && nums[l] == nums[l+1]) l--;
                    }
                    else if(sum < target) k++;
                    else l--;
                }
            }
        }
        return result;
    }
}
