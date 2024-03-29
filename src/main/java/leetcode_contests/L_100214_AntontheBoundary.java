package leetcode_contests;

public class L_100214_AntontheBoundary {
    public static int returnToBoundaryCount(int[] nums) {
        int max = 0;
        int sum = 0;
        for (int num:nums) {
            sum += num;
            if(sum == 0) max++;
        }
        return max;
    }
}
