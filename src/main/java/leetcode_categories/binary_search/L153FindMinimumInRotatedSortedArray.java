package leetcode_categories.binary_search;

public class L153FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int mid;
        while (left<=right) {
            if(nums[left] < nums[right]) return nums[left];
            mid = (right+left)/2;
            if(nums[mid] >= nums[left] ) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return nums[0];
    }
}
