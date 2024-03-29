package leetcode_categories.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_18_4sum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int a=0;a<nums.length-3;a++) {
            long curSum = 0;
            int i=a+1;
            int j= nums.length-1;
            while (j>i) {
                for (int k=i+1;k<j;k++) {
                    curSum = (long) nums[k] + nums[j] + nums[i] + nums[a];
                    if(curSum == target) {
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[a]);
                        tmp.add(nums[i]);
                        tmp.add(nums[k]);
                        tmp.add(nums[j]);
                        if(!list.contains(tmp))list.add(tmp);
                    } else if(curSum > target) {
                        j--;
                        k = i;
                    }
                }
                j = nums.length-1;
                i++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        fourSum(new int[] {1000000000,1000000000,1000000000,1000000000}, -294967296);
    }
}
