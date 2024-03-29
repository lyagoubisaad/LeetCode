package leetcode_categories.arrays_hashings;

public class L_560_SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        int cpt = 0;
        for (int i=1;i<=nums.length;i++) {
            dp[i] = nums[i-1]+dp[i-1];
        }
        for (int start=0;start<dp.length;start++) {
            for (int end=start+1;end<dp.length;end++) {
                if(dp[end]-dp[start] == k) cpt++;
            }
        }
        return cpt;
    }

    public static void main(String[] args) {
        new L_560_SubarraySumEqualsK().subarraySum(new int[] {1,-1,0}, 0);
    }
}
