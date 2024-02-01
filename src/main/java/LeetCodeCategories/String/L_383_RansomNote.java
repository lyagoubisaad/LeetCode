package LeetCodeCategories.String;

import java.util.HashMap;
import java.util.Map;

public class L_383_RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Integer,Character> hm = new HashMap();
        for (int i=0;i<ransomNote.length();i++) {
            hm.put(i,ransomNote.charAt(i));
        }
        for (int i=0;i<magazine.length();i++) {
            for (Map.Entry<Integer,Character> entry : hm.entrySet()) {
                if(magazine.charAt(i) == entry.getValue()) {
                    hm.remove(entry.getKey());
                    break;
                }
            }
            if(hm.size() == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aab","baa"));
    }
}
