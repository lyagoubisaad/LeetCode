package LeetCodeCategories.ArrayAndHashings;

public class L_724_FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int cpt = 0;
        for (int elem : nums) {
            sum += elem;
        }
        for (int i=0;i<nums.length;i++) {
            cpt += nums[i];
            if(cpt == sum) return i;
            sum -= nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}