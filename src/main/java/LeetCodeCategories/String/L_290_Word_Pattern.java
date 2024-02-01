package LeetCodeCategories.String;

import java.util.*;

public class L_290_Word_Pattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        HashMap<Character,String> hm = new HashMap();
        for(int i=0;i<words.length;i++) {
            hm.put(pattern.charAt(i),words[i]);
        }
        for (int i=0;i<pattern.length();i++) {
            for(Map.Entry<Character,String> Entry : hm.entrySet()) {
                if(pattern.charAt(i) == Entry.getKey()) {
                    if(!Entry.getValue().equals(words[i])) {
                        return false;
                    }
                }
            }
        }
        Collection<String> valuesList = hm.values();
        Set<String> valuesSet = new HashSet<String>(hm.values());
        if(valuesList.size() != valuesSet.size()) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat dog"));
    }
}
