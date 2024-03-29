package leetcode_categories.arrays_hashings;

public class L_219_ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag = false;
        for (int i=0;i<nums.length;i++) {
            int cpt = 1;
            while (nums.length > i + cpt && cpt <= k) {
                if(nums[i] == nums[i+cpt]) {
                    flag = true;
                    break;
                }
                cpt++;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        containsNearbyDuplicate(new int[]{},2);
    }
}
