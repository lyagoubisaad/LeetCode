package leetcode_categories.arrays_hashings;

public class L_540_SingleElementInASortedArray {

    public int singleNonDuplicate(int[] nums) {
        for (int i=0;i<nums.length-1;i++) {
            if(nums[i] != nums[i+1]) {
                return nums[i];
            } else i++;
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {

    }
}
