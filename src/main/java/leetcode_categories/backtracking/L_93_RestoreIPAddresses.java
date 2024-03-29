package leetcode_categories.backtracking;

import java.util.ArrayList;
import java.util.List;

public class L_93_RestoreIPAddresses {
    public static List<String> restoreIpAddresses(String s) {
        List<String> allAdresses = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        dfs(s, 0, allAdresses, 0, current);
        return allAdresses;
    }

    private static void dfs(String s, int step, List<String> allAddresses, int idx, StringBuilder current) {
        if (idx > s.length()) return;
        if (step == 4) {
            if (idx != s.length()) return;
            allAddresses.add(current.deleteCharAt(current.length()-1).toString());
            return;
        }
        for (int i = 1; i <= 3 && idx + i <= s.length(); i++) {
            String segment = s.substring(idx, idx + i);
            if(Integer.parseInt(segment) > 255) return;
            if (segment.length() > 1 && segment.charAt(0) == '0') return;
            current.append(segment).append(".");
            dfs(s, step + 1, allAddresses, idx + i, new StringBuilder(current));
            current.delete(current.length() - i - 1, current.length());
        }
    }
}
