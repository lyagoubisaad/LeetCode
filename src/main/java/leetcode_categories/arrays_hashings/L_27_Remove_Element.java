package leetcode_categories.arrays_hashings;

import java.util.HashMap;

public class L_27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        HashMap h = new HashMap();
        int tmp=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != val) {
                h.put(tmp,nums[i]);
                tmp++;
            }
        }
        for(int i=0;i<h.size();i++) {
            nums[i] = (int) h.get(i);
        }
        return h.size();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int k = removeElement(nums,2);
        for(int i=0;i<k;i++) {
            System.out.println(nums[i]);
        }
    }
}
