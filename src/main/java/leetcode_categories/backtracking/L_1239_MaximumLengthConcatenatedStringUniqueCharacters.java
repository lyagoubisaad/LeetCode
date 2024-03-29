package leetcode_categories.backtracking;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L_1239_MaximumLengthConcatenatedStringUniqueCharacters {
    public static int maxLength(List<String> arr) {
        return dfs(0, arr, "");
    }

    private static int dfs(int start, List<String> arr, String curr) {
        if(start == arr.size()) return curr.length();
        int max = 0;
        boolean flagNext = true;
        boolean flagCurr = true;
        Set<Character> stk = new HashSet<>();
        for (int i=0;i<arr.get(start).length();i++) {
            stk.add(arr.get(start).charAt(i));
            if(curr.contains(arr.get(start).charAt(i)+"")) {
                flagNext = false;
                break;
            }
        }
        if(stk.size() != arr.get(start).length()) flagNext = false;
        stk.clear();
        for (int i=0;i<curr.length();i++) {
            stk.add(curr.charAt(i));
        }
        if(curr.length() != stk.size()) flagCurr = false;
        if(flagCurr) {
            if(flagNext) max = Math.max(dfs(start+1, arr,curr + arr.get(start)), max);
            if(curr.length() != 0) max = Math.max(dfs(start+1, arr, curr), max);
        }
        return Math.max(max, dfs(start+1, arr, ""));
    }
}
