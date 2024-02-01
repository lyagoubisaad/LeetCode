package LeetCodeCategories.ArrayAndHashings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class L_438 {
    public static List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> pCpt = new HashMap<>();
        HashMap<Character, Integer> sCpt = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i=0;i<Math.min(p.length(),s.length());i++) {
            pCpt.put(p.charAt(i), pCpt.getOrDefault(p.charAt(i), 0)+ 1);
            sCpt.put(s.charAt(i), sCpt.getOrDefault(s.charAt(i), 0)+ 1);
        }
        for (int i=0;i<=s.length()-p.length();i++) {
            if(pCpt.equals(sCpt)) result.add(i);
            sCpt.put(s.charAt(i), sCpt.get(s.charAt(i)) -1);
            if(sCpt.get(s.charAt(i)) == 0) sCpt.remove(s.charAt(i));
            if(i!=s.length()-p.length()){
                char key = s.charAt(i + p.length());
                sCpt.put(key, sCpt.getOrDefault(key, 0) +1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        findAnagrams("abab","ab");
    }
}
