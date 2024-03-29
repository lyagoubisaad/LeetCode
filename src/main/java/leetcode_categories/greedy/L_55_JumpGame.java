package leetcode_categories.greedy;

public class L_55_JumpGame {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] + i >= goal) {
                goal = i;
            }
        }
        return goal == 0;
    }

    public boolean canJump(int[] nums, int index) {
        if(index >= nums.length-1) return true;
        if(index + nums[index] >= nums.length-1) return true;
        for (int i=index;i<nums.length;i++) {
            for (int j=nums[index];j>0;j--) {
                if(canJump(nums, j)) return true;
            }
        }
        return false;
    }

    private boolean helper(int[] nums, int index, boolean[] dp) {
        if(index >= nums.length-1) return true;
        if(index + nums[index] >= nums.length-1) return true;
        if(!dp[index]) return false;
        for (int i=nums[index];i>0;i--) {
            if(helper(nums,nums[index]-i+1+index, dp)) return true;
        }
        dp[index] = false;
        return dp[index];
    }

    public static void main(String[] args) {
        System.out.println(new L_55_JumpGame().canJump(new int[] {3,2,1,0,4}));
    }
}
