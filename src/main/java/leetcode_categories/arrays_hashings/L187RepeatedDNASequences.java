package leetcode_categories.arrays_hashings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L187RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        Set set = new HashSet<>();
        Set result = new HashSet<>();
        for (int i=0;i<=s.length()-10;i++) {
            String pattern = s.substring(i, i+10);
            if(!set.add(pattern)) result.add(pattern);
        }
        return new ArrayList<>(result);
    }
}
