package leetcode_categories.arrays_hashings;

public class L1929ConcatenationArray {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length*2];
        for (int j=0;j<2;j++) {
            System.arraycopy(nums, 0, result, j * nums.length, nums.length);
        }
        return result;
    }
}
