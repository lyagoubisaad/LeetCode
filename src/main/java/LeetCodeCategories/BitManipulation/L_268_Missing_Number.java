package LeetCodeCategories.BitManipulation;

public class L_268_Missing_Number {
    public static int missingNumber(int[] nums) {
        int elem = nums.length;
        for (int i=0;i<nums.length;i++) {
            elem ^= i;
            elem ^= nums[i];
        }
        return elem;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0,1,3,5,2}));
    }
}
