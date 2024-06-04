package leetcode_categories.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L15ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int first = 0;
        while (first < nums.length-2) {
            int second = first+1;
            int last = nums.length-1;
            while (second<last) {
                if(second< nums.length-1 && second != first+1 && nums[second] == nums[second-1]) {
                    second++;
                    continue;
                }
                if(nums[first] + nums[second] + nums[last] == 0) {
                    list.add(List.of(nums[first], nums[second], nums[last]));
                    second++;
                } else if(nums[first] + nums[second] + nums[last] < 0) second++;
                else last--;
            }
            first++;
            while (first < nums.length-2 && nums[first] == nums[first-1]){
                first++;
            }
        }
        return list;
    }
}
