package leetcode_categories.arrays_hashings;

public class L169MajorityElement {
    // Boyer-Moore Majority algorithm
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int vote = 0;
        for (int num: nums) {
            if(vote == 0) candidate = num;
            if(candidate == num) vote++;
            else vote--;
        }
        return candidate;
    }
}
