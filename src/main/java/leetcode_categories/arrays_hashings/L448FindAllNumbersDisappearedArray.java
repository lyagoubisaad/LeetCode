package leetcode_categories.arrays_hashings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L448FindAllNumbersDisappearedArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<>();
        Arrays.sort(nums);
        int idx = 0;
        for (int i=1;i<=nums.length;i++) {
            while (idx < nums.length-1 && nums[idx+1] == nums[idx]) idx++;
            if(idx == nums.length || nums[idx] != i) disappearedNumbers.add(i);
            else idx++;
        }
        return disappearedNumbers;
    }
}
