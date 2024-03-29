package leetcode_categories.dynamic_programming_1d;

public class L_198_HouseRobber {
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;
        for (int num: nums) {
            int tmp = prev1;
            prev1 = Math.max(prev2+num, prev1);
            prev2 = tmp;
        }
        return prev1;
    }

    public static void main(String[] args) {
        new L_198_HouseRobber().rob(new int[] {2,7,9,3,1});
    }
}
