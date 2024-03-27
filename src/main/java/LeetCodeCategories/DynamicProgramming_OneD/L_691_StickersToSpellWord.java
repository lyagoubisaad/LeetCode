package LeetCodeCategories.DynamicProgramming_OneD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_691_StickersToSpellWord {
    public int minStickers(String[] stickers, String target) {
        int[] targetLetters = new int[26];
        for (int i=0;i<target.length();i++) {
            targetLetters[target.charAt(i)-'a']++;
        }
        int[] targetLettersCopy = Arrays.copyOf(targetLetters, targetLetters.length);
        List<int[]> list = new ArrayList<>();
        for (String sticker : stickers) {
            int[] tmp = new int[26];
            for (int j = 0; j < sticker.length(); j++) {
                tmp[sticker.charAt(j)-'a']++;
                targetLettersCopy[sticker.charAt(j)-'a']--;
            }
            list.add(tmp);
        }
        for (int i=0;i<26;i++) {
            if(targetLettersCopy[i] == targetLetters[i] && targetLettersCopy[i] != 0) return -1;
        }
        int minStick = Integer.MAX_VALUE;
        for (int i=0;i<stickers.length;i++) {
            minStick = Math.min(minStick,helper(i, targetLetters, stickers, list));
        }
        return minStick;
    }

    private int helper(int idx, int[] targetLetters, String[] stickers, List<int[]> list) {
        for (int i=0;i<stickers[idx].length();i++) {
            targetLetters[stickers[idx].charAt(i)-'a']--;
        }
        boolean flag = true;
        for (int i=0;i<26;i++) {
            if (targetLetters[i] > 0) {
                flag = false;
                break;
            }
        }
        if(flag) return 0;
        int result = 0;
        for (int i=0;i<stickers.length;i++) {
            result = Math.min(result, helper(i, targetLetters, stickers, list));
        }
        return 1+result;
    }
}
