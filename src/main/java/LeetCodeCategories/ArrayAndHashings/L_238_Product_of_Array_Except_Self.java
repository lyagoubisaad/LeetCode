package LeetCodeCategories.ArrayAndHashings;

import java.util.Arrays;

public class L_238_Product_of_Array_Except_Self {

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        if(nums.length == 0 || nums.length == 1) return res;
        int sum = 0;
        int cptZero = 0;
        for (int i=0;i<nums.length;i++) {
            if(nums[i] == 0) cptZero++;
            else {
                if(sum == 0) sum = nums[i];
                else sum = sum * nums[i];
            }
        }
        if(cptZero > 0) {
            Arrays.fill(res, 0);
            if(cptZero == 1) {
                for (int i=0;i<nums.length;i++) {
                    if(nums[i] == 0) res[i] = sum;
                }
            }
            return res;
        }
        Arrays.fill(res, sum);
        for (int i=0;i<nums.length;i++) {
            res[i] = res[i]/nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        new L_238_Product_of_Array_Except_Self().productExceptSelf(new int[] {-1,1,0,-3,3});
    }
}
