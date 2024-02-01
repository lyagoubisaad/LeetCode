package LeetCodeCategories.ArrayAndHashings;

import java.util.HashMap;

public class L_1930_UniqueLength3PalindromicSubsequences {

    HashMap<Character, String> store = new HashMap<>();
    int total = 0;
    int tmp = 0;
    public int countPalindromicSubsequence(String s) {
        formPalindrome(0,s);
        return total;
    }

    private void formPalindrome(int start, String s) {
        tmp = 0;
        if(start==s.length()) return;
        if(!store.containsKey(s.charAt(start))) {
            for (int i=s.length()-1; i>start+1; i--) {
                if(s.charAt(i) == s.charAt(start)) {
                    for (int j=start+1;j<i;j++) {
                        if(store.containsKey(s.charAt(start)) && store.get(s.charAt(start)).contains(s.charAt(j)+"")) continue;
                        store.put(s.charAt(start), store.getOrDefault(s.charAt(start), "")+s.charAt(j));
                        tmp++;
                        if(tmp==26) break;
                    }
                    break;
                }
            }
            total += tmp;
        }
        formPalindrome(start+1, s);
    }

    public static void main(String[] args) {
        new L_1930_UniqueLength3PalindromicSubsequences().countPalindromicSubsequence("aabca");
    }
}
