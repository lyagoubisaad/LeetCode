package LeetCodeCategories.ArrayAndHashings;

public class L_26_RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            int ind = i + 1;
            while (ind < nums.length && nums[ind] == nums[i]) {
                nums[ind] = Integer.MAX_VALUE;
                ind++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == Integer.MAX_VALUE) {
                for (int j=i;j<nums.length;j++) {
                    if(nums[j] != Integer.MAX_VALUE) {
                        nums[i] = nums[j];
                        nums[j] = Integer.MAX_VALUE;
                        break;
                    }
                }
             }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            if (nums[i] != Integer.MAX_VALUE) {
                tmp++;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
