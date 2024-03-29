package leetcode_categories.arrays_hashings;

public class L_303_RangeSumQueryImmutable {
    class NumArray {
        int[] mynum;
        public NumArray(int[] nums) {
            mynum = new int[nums.length];
            for (int i=0;i<nums.length;i++) {
                mynum[i] = nums[i];
            }
        }

        public int sumRange(int left, int right) {
            int sum = 0;
            for (int i=left;i<=right;i++) {
                sum += mynum[i];
            }
            return sum;
        }
    }
}
