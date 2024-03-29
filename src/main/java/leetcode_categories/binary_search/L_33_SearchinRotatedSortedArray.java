package leetcode_categories.binary_search;

public class L_33_SearchinRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while (l<=r) {
            int mid = (l+r)/2;
            if(nums[mid] == target) return mid;
            if(nums[l] <= nums[mid]) {
                if(target<nums[l] || target > nums[mid]) {
                    l = mid+1;
                } else {
                    r= mid-1;
                }
            } else {
                if(target>nums[r] || target < nums[mid]) {
                    r= mid-1;
                } else {
                    l = mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {8,1,2,3,4,5,6,7};
        int target = 6;
        System.out.println(search(nums, target));
    }
}
