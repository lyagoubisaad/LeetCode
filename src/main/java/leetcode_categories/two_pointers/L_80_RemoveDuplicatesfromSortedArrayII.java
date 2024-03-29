package leetcode_categories.two_pointers;

public class L_80_RemoveDuplicatesfromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        if(nums.length<3)
            return nums.length;

        int idx = 2;
        for(int i=2;i<nums.length;++i)
        {
            if(nums[i]!=nums[idx-2])
                nums[idx++] = nums[i];
        }
        return idx;
    }
    public static void main(String[] args) {
        removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3});
    }
}
