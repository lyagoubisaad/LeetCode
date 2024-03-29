package leetcode_categories.arrays_hashings;

import java.util.Collections;
import java.util.HashMap;

public class L_169_MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], 0);
            } else {
                hm.put(nums[i], (int) hm.get(nums[i]) + 1);
            }
        }
        Object key = Collections.max(hm.entrySet(), HashMap.Entry.comparingByValue()).getKey();
        return (int) key;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
    }
}
