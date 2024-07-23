package leetcode_categories.arrays_hashings;

import java.util.HashMap;

public class L205IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> connectionFirst = new HashMap<>();
        HashMap<Character, Character> connectionSecond = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            if(connectionFirst.containsKey(s.charAt(i))) {
                if(connectionFirst.get(s.charAt(i)) != t.charAt(i)) return false;
            } else if(connectionSecond.containsKey(t.charAt(i))) {
                if(connectionSecond.get(t.charAt(i)) != s.charAt(i)) return false;
            }
            else {
                connectionFirst.put(s.charAt(i), t.charAt(i));
                connectionSecond.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}
