package LeetCodeCategories.ArrayAndHashings;

public class L_665_NondecreasingArray {
    public static boolean checkPossibility(int[] nums) {
        return checkNonDec(0, nums, 2);
    }

    private static boolean checkNonDec(int current, int[] nums, int lives) {
        if(lives == 0) return false;
        if(current >= nums.length-1) return true;
        if(nums[current] > nums[current+1]) {
            if(lives == 1) return false;
            int tmp = nums[current];
            nums[current] = nums[current+1];
            boolean flag;
            if(current == 0) {
                flag = checkNonDec(0, nums, lives-1);
            } else {
                flag = checkNonDec(current-1, nums, lives-1);
            }
            if(flag) return true;
            nums[current] = tmp;
            nums[current+1] = tmp;
            if(current == 0) {
                return checkNonDec(0, nums, lives-1);
            }
            return  checkNonDec(current-1, nums, lives-1);
        }
        return checkNonDec(current+1, nums, lives);
    }

    public static void main(String[] args) {
        checkPossibility(new int[] {2,6,4,8,10,9,15});
    }
}
