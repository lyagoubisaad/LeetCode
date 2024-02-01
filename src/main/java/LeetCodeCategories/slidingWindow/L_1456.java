package LeetCodeCategories.slidingWindow;

import java.util.HashMap;

public class L_1456 {
    public static int maxVowels(String s, int k) {
        HashMap<Character, Character> vowels = new HashMap<>();
        vowels.put('a', 'a');
        vowels.put('e', 'e');
        vowels.put('i', 'i');
        vowels.put('o', 'o');
        vowels.put('u', 'u');
        int currSum = 0;
        for (int i=0;i<k;i++) {
            if(vowels.containsKey(s.charAt(i))) currSum++;
        }
        int max = currSum;
        for (int i=k;i<s.length();i++) {
            if(vowels.containsKey(s.charAt(i-k))) currSum--;
            if(vowels.containsKey(s.charAt(i))) currSum++;
            max = Math.max(max, currSum);
        }
        return max;
    }

    public static void main(String[] args) {
        maxVowels("ibpbhixfiouhdljnjfflpapptrxgcomvnb", 33);
    }
}
