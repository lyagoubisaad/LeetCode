package LeetCodeCategories.Greedy;

public class L_2439_MinimizeMaximumOfArray {
    public static int minimizeArrayValue(int[] nums) {
        double sum = nums[0];
        int max = nums[0];
        for (int i=1;i<nums.length;i++) {
            sum += nums[i];
            if(nums[i] > max) {
                int avg = (int) Math.ceil(sum/(i+1));
                max = Math.max(avg, max);

            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(minimizeArrayValue(new int[]{3, 7, 1, 6}));
    }
}
