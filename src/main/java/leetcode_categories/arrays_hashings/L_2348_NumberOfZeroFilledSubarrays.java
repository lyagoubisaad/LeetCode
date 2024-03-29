package leetcode_categories.arrays_hashings;

public class L_2348_NumberOfZeroFilledSubarrays {
    public long zeroFilledSubarray(int[] nums) {
        long tot = 0;
        int consecutive = 0;
        for (int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                consecutive++;
                tot += consecutive;
            } else {
                consecutive = 0;
            }
        }
        return tot;
    }

    public int facto(int n) {
        if(n==1) return 1;
        return facto(n-1)+n;
    }
}
