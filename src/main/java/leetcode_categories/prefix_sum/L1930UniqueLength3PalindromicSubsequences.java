package leetcode_categories.prefix_sum;

import java.util.HashMap;

public class L1930UniqueLength3PalindromicSubsequences {
    public int countPalindromicSubsequence(String s) {
        HashMap<Integer, int[]> seen = new HashMap<>();
        int[] count = new int[26];
        int[] charOcc = new int[26];
        int sum = 0;
        for (int i=0;i<s.length();i++) {
            int idxCurrLetter = s.charAt(i) - 'a';
            if(seen.containsKey(idxCurrLetter)) {
                if(count[idxCurrLetter] == 26) continue;
                sum -= count[idxCurrLetter];
                sum += count[idxCurrLetter] = count(seen.get(idxCurrLetter), charOcc);
                charOcc[idxCurrLetter]++;
            } else {
                charOcc[idxCurrLetter]++;
                seen.put(idxCurrLetter, charOcc.clone());
            }
        }
        return sum;
    }

    private int count(int[] first, int[] second) {
        int count = 0;
        for (int i=0;i<26;i++) count += Math.min(1, second[i]-first[i]);
        return count;
    }
}
