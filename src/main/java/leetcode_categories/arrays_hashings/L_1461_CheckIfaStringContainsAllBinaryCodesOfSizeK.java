package leetcode_categories.arrays_hashings;

import java.util.HashSet;

public class L_1461_CheckIfaStringContainsAllBinaryCodesOfSizeK {
    public static boolean hasAllCodes(String s, int k) {
        double totalComb = Math.pow(2, k);
        if(s.length() < totalComb) return false;
        HashSet<String> store = new HashSet<>();
        for (int i=0;i<=s.length()-k;i++) {
            store.add(s.substring(i,i+k));
        }
        return store.size() == totalComb;
    }

    public static void main(String[] args) {
        hasAllCodes("00110", 2);
    }
}
