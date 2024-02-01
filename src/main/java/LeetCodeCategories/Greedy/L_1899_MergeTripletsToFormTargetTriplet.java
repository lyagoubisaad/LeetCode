package LeetCodeCategories.Greedy;

import java.util.Arrays;

public class L_1899_MergeTripletsToFormTargetTriplet {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int[] res = new int[3];
        Arrays.fill(res, Integer.MIN_VALUE);
        loop:for (int[] triplet: triplets) {
            for (int j=0;j<3;j++) {
                if(triplet[j] > target[j]) {
                    continue loop;
                }
            }
            for (int j=0;j<3;j++) {
                res[j] = Math.max(res[j], triplet[j]);
            }
        }
        for (int j=0;j<3;j++) {
            if(res[j] != target[j]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new L_1899_MergeTripletsToFormTargetTriplet().mergeTriplets(new int[][] {{2,5,3}, {1,8,4}, {1,7,5}}, new int[] {2,7,5}));
    }
}
