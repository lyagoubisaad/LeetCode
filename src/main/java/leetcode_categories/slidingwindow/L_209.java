package leetcode_categories.slidingwindow;

public class L_209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int[][] dp = new int[nums.length][2];
        int tmp = target;
        for (int i=0;i<nums.length;i++) {
            tmp -= nums[i];
            if(tmp <= 0) {
                dp[0][0] = i+1;
                dp[0][1] = -tmp;
                result = Math.min(result, dp[0][0]);
                break;
            }
        }
        for (int i=1;i<nums.length;i++) {
            int reste = dp[i-1][1] - nums[i-1];
            if(reste >= 0) {
                int k=0;
                while (dp[i-1][0]-k >= 0 && reste-nums[dp[i-1][0]-k+i-2] >= 0) {
                    reste -= nums[dp[i-1][0]-k-i];
                    k++;
                }
                dp[i][0] = dp[i-1][0]-1-k;
                dp[i][1] = reste;
                result = Math.min(result, dp[i][0]);
            } else {
                for (int j=i+dp[i-1][0]-1;j<nums.length;j++) {
                    reste += nums[j];
                    if(reste >= 0) {
                        dp[i][0] = j-i+1;
                        dp[i][1] = reste;
                        result = Math.min(result, dp[i][0]);
                        break;
                    }
                }
                if(reste < 0) break;
            }
        }
        return result == Integer.MAX_VALUE ? 0:result;
    }


    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[] {1,1,1,1,7}));
    }
}
