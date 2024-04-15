package leetcode_categories.arrays_hashings;

public class L41FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int length = nums.length;
        boolean[] seen = new boolean[length+1];
        for (int num : nums) {
            if (num > 0 && num <= length) {
                seen[num] = true;
            }
        }
        for (int i=1;i<= length;i++) if(!seen[i]) return i;
        return length+1;
    }
}
