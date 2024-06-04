package leetcode_categories.arrays_hashings;

public class L_169_MajorityElement {
    // Boyer-Moore Majority algorithm
    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int votes = 0;
        for (int num: nums) {
            if(votes == 0) candidate = num;
            if(candidate == num) votes++;
            else votes--;
        }
        return candidate;
    }
}
