package LeetCodeCategories.ArrayAndHashings;

public class L_283_Move_Zeroes {
    public static void moveZeroes(int[] nums) {

        for (int i=0;i<nums.length;i++) {
            if(nums[i] == 0 ) {
                for(int j=0;j<nums.length;j++) {
                    if(nums[j] != 0) {
                        if(i < j) {
                            nums[i] = nums[j];
                            nums[j] = 0;
                            break;
                        }
                    }
                }
            }
        }

        for (int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        moveZeroes(new int[] {0,1,0,3,12});
    }
}
