package leetcode_categories.arrays_hashings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L_2306_NamingaCompany {
    public static long distinctNames(String[] ideas) {
        Map<Character, Set<String>> map = new HashMap<>();
        for (String s : ideas) {
            char key = s.charAt(0);
            String val = s.substring(1);
            Set<String> set = map.getOrDefault(key, new HashSet<>());
            set.add(val);
            map.put(key, set);
        }

        long res = 0;
        for (char key1 : map.keySet()) {
            Set<String> set1 = map.get(key1);
            for (char key2 : map.keySet()) {
                if (key1 == key2) continue;
                Set<String> set2 = map.get(key2);
                int overlap = 0;
                for (String s : set1) {
                    if (set2.contains(s)) overlap++;
                }
                res += (long) (set1.size() - overlap) * (set2.size() - overlap);
            }
        }
        return res;
    }
}
