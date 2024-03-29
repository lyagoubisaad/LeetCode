package leetcode_categories.arrays_hashings;

import java.util.ArrayList;
import java.util.List;

public class L_228_Summary_Ranges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> l = new ArrayList();
        if(nums.length == 0) return l;
        int big=nums[0];
        int end=nums[0];
        int n=1;
        if(nums.length == 1) {
            l.add(nums[0]+"");
            return l;
        }
        while (n<nums.length) {
            if(nums[n] > nums[n-1]+1) {
                end = nums[n-1];
                if(big == end) {
                    l.add(big+"");
                } else {
                    l.add(big+"->"+end);
                }
                big = nums[n];
            }
            n++;
        }

        return l;
    }

    public static void main(String[] args) {

        System.out.println(summaryRanges(new int[] {0,1,2}));
    }
}
