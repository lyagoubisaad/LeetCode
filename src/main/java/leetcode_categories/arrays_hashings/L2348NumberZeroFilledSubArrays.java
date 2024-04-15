package leetcode_categories.arrays_hashings;

public class L2348NumberZeroFilledSubArrays {
    public long zeroFilledSubarray(int[] nums) {
        long total = 0;
        long consecutive = 0;
        for (int num : nums) {
            if (num == 0) {
                consecutive++;
                total += consecutive;
            } else consecutive = 0;
        }
        return total;
    }
}
