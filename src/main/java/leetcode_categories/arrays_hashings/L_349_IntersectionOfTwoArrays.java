package leetcode_categories.arrays_hashings;

import java.util.HashSet;

public class L_349_IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<Integer>();
        HashSet<Integer> hs2 = new HashSet<Integer>();
        for (int i=0;i<nums1.length;i++) {
            hs1.add(nums1[i]);
        }
        for (int i=0;i<nums2.length;i++) {
            if(hs1.contains(nums2[i])) {
                hs2.add(nums2[i]);
            }
        }
        int[] num3 = new int[hs2.size()];
        int k=0;
        for (int elem : hs2) {
            num3[k++] = elem;
        }

        return num3;
    }

    public static void main(String[] args) {
        intersection(new int[] {4,9,5} , new int[] {9,4,9,8,4});
    }
}
