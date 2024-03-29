package leetcode_categories.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class L_763_PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        HashMap<Character, Integer> store = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            store.put(s.charAt(i), i);
        }
        for (int i=0;i<s.length();i++) {
            int maxValue = store.get(s.charAt(i));
            for (int j=i;j<maxValue; j++) {
                maxValue = Math.max(maxValue, store.get(s.charAt(j)));
            }
            int first = i;
            i = maxValue;
            res.add(i-first+1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new L_763_PartitionLabels().partitionLabels("ababcbacadefegdehijhklij"));
    }
}
