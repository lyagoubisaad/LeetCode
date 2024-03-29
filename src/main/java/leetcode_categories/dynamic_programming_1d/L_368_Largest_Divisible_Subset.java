package leetcode_categories.dynamic_programming_1d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_368_Largest_Divisible_Subset {
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        if(nums.length == 1 ) return List.of(nums[0]);
        Arrays.sort(nums);
        List<List<Integer>> listOfLists = new ArrayList<>();
        int max=0;
        int idx=0;
        for (int i=1;i<nums.length;i++) {
            listOfLists.add(new ArrayList());
            for (int j=0;j<i;j++) {
                if(nums[i] % nums[j] == 0) {
                    listOfLists.get(i-1).add(nums[j]);
                }
            }
            listOfLists.get(i-1).add(nums[i]);
            if(listOfLists.get(i-1).size() > max) {
                max = listOfLists.get(i-1).size();
                idx = i-1;
            }
        }
        return listOfLists.get(idx);
    }

    public static void main(String[] args) {
        System.out.println(largestDivisibleSubset(new int[] {1,2,4,6,8}));
    }
}