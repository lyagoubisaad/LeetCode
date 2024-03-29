package leetcode_categories.bit_manipulation;

public class L_1470_ShuffletheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int first = 0;
        int cpt = 0;
        while (first < n) {
            res[cpt++] = nums[first];
            res[cpt++] = nums[first++ + n];
        }
        return res;
    }
    public static void main(String[] args) {
        shuffle(new int[] {2,5,1,3,4,7}, 3);
    }
}
