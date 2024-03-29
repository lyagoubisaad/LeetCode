package leetcode_categories.arrays_hashings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class L_350_IntersectionOfTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet();
        HashSet hs2 = new HashSet();
        for(int elem : nums1) {
            hs1.add(elem);
        }
        for(int elem : nums2) {
            hs2.add(elem);
        }
        hs1.retainAll(hs2);
        HashMap<Integer,Integer> hm = new HashMap<>();
        int occ1 , occ2;
        int taille = 0;
        for (int elem : hs1) {
            occ1 = 0;
            occ2 = 0;
            for (int elem1 : nums1) {
                if(elem == elem1) occ1++;
            }
            for (int elem2 : nums2) {
                if(elem == elem2) occ2++;
            }
            if(occ1 < occ2) {
                hm.put(elem,occ1);
                taille +=occ1;
            } else {
                hm.put(elem,occ2);
                taille +=occ2;
            }
        }
        int[] num3 = new int[taille];
        int cpt=0;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()) {
            for (int i=0;i<entry.getValue();i++) {
                num3[i+cpt] = entry.getKey();
            }
            cpt+=entry.getValue();
        }
        return num3;
    }
    public static void main(String[] args) {
        intersect(new int[] {1,2,2,1} , new int[] {2,2});
    }
}
