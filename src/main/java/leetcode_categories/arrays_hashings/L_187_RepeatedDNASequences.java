package leetcode_categories.arrays_hashings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L_187_RepeatedDNASequences {
    public static List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> store = new HashMap<>();
        for (int i=0;i<=s.length()-10;i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=i;j<i+10;j++) {
                sb.append(s.charAt(j));
            }
            store.put(sb.toString(), store.getOrDefault(sb.toString(), 0)+1);
        }
        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : store.entrySet()) {
            if(entry.getValue() > 1) {
                res.add(entry.getKey());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        findRepeatedDnaSequences("AAAAAAAAAAA");
    }
}
