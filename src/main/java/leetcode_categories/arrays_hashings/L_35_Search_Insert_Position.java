package leetcode_categories.arrays_hashings;

public class L_35_Search_Insert_Position {

    public static int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        if(target<=nums[l]) return l;
        if(target>nums[r]) return r+1;
        if(target == nums[r]) return r;
        int mid;
        while (l<r) {
            mid = (l+r)/2;
            if(nums[mid] > target) {
                r = mid;
                continue;
            }
            if(nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                if(nums[mid+1] > target) return mid+1;
                l = mid;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        searchInsert(new int[] {1,3,5,6}, 7);
    }

}
