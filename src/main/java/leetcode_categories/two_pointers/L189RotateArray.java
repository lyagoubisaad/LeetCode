package leetcode_categories.two_pointers;

public class L189RotateArray {
    public void rotate(int[] nums, int k) {
        int[] copy = new int[nums.length];
        k = k%nums.length;
        for (int i=0;i<nums.length;i++) {
            int val = i-k;
            if(val < 0) val += nums.length;
            copy[i] = nums[val];
        }
        System.arraycopy(copy, 0, nums, 0, nums.length);
    }
}
