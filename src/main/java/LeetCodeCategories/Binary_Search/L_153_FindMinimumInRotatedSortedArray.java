package LeetCodeCategories.Binary_Search;

public class L_153_FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int mid;
        while (l<=r) {
            if(nums[l] < nums[r]) return nums[l];
            mid = (r+l)/2;
            if(nums[mid] >= nums[l] ) {
                l = mid+1;
            } else {
                r = mid;
            }
        }
        return nums[0];
    }
}
