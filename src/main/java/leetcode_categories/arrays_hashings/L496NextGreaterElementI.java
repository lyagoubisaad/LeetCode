package leetcode_categories.arrays_hashings;

import java.util.HashMap;

public class L496NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums2.length;i++) {
            map.put(nums2[i], i);
        }
        int idx;
        int j;
        for (int i=0;i<nums1.length;i++) {
            idx = map.get(nums1[i]);
            j = idx + 1;
            while (j<nums2.length) {
                if(nums2[j] > nums1[i]) {
                    nums1[i] = nums2[j];
                    break;
                }
                j++;
            }
            if(j == nums2.length) nums1[i] = -1;
        }
        return nums1;
    }
}
