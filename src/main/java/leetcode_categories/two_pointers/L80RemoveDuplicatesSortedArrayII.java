package leetcode_categories.two_pointers;

public class L80RemoveDuplicatesSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int duplicates = 0;
        int left = 1;
        int right = 1;
        while (right < nums.length) {
            if(nums[right] == nums[right-1]) {
                duplicates++;
                if(duplicates >= 2) {
                    right++;
                    continue;
                }
            }
            if(nums[right] != nums[right-1]) duplicates = 0;
            nums[left++] = nums[right++];
        }
        return left;
    }
}

