package LeetCodeCategories.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_15_3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int curSum = 0;
        int i=0;
        int j= nums.length-1;
        while (j>i) {
            for (int k=i+1;k<j;k++) {
                curSum = nums[k] + nums[j] + nums[i];
                if(curSum == 0) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[k]);
                    tmp.add(nums[j]);
                    if(!list.contains(tmp))list.add(tmp);
                } else if(curSum > 0) {
                    j--;
                    break;
                }
            }
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        threeSum(new int[] {-1,0,1,2,-1,-4,-2,-3,3,0,4});
    }
}
