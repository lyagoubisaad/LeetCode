package leetcode_categories.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L153Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int first;
        int j;
        int k;
        int sum;
        for (int i=0;i<length-2;i++) {
            if(i!=0 && nums[i] == nums[i-1]) continue;
            first = nums[i];
            j = length-1;
            k=i+1;
            while (k<j) {
                sum =  nums[k] + nums[j];
                if(sum == -first) {
                    result.add(List.of(first, nums[k],  nums[j]));
                    k++;
                    j--;
                    while (k<j && nums[k] == nums[k-1]) k++;
                    while (k<j && nums[j] == nums[j+1]) j--;
                }
                else if(sum < -first) k++;
                else j--;
            }
        }
        return result;
    }
}
