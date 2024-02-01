package LeetCodeCategories.ArrayAndHashings;

import java.util.HashSet;

public class L_645_SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int duplicated = 0;
        HashSet hs = new HashSet();
        for (int i=1;i<=nums.length;i++) {
            hs.add(i);
        }
        for (int i=0;i<nums.length;i++) {
            if(!hs.contains(nums[i])) {
                duplicated = nums[i];
                continue;
            } else hs.remove(nums[i]);
        }
        return new int[] {duplicated,(int) hs.toArray()[0]};
    }

    public static void main(String[] args) {
        int[] arr = findErrorNums(new int[] {1,2,2,4});
        for (int elem : arr) {
            System.out.println(elem);
        }
    }
}
