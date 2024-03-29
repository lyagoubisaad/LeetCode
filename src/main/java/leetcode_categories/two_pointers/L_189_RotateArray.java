package leetcode_categories.two_pointers;

public class L_189_RotateArray {
    public static void rotate(int[] nums, int k) {
        if(k==0) return;
        k = k%nums.length;
        int[] copy = new int[nums.length];
        for (int i=0;i<k;i++) {
            copy[i] = nums[nums.length-k+i];
        }
        for (int i=k;i<nums.length;i++) {
            copy[i] = nums[i-k];
        }
        for (int i=0;i<nums.length;i++) {
            nums[i] = copy[i];
        }
    }

    public static void main(String[] args) {
        rotate(new int[] {-1,-100,3,99}, 2);
    }
}
