package leetcode_categories.backtracking;

import java.util.ArrayList;
import java.util.List;

public class L_131_PalindromePartitioning {
    List<List<String>> res = new ArrayList<>();
    List<String> subset = new ArrayList<>();
    public List<List<String>> partition(String s) {
        dfs(s, 0);
        return res;
    }

    private void dfs(String s, int start) {
        if(start >= s.length()) {
            res.add(new ArrayList<>(subset));
        }
        for (int end=start; end<s.length();end++) {
            if(isPalindrome(start, end, s)) {
                subset.add(s.substring(start, end+1));
                dfs(s, start+1);
                subset.remove(subset.size()-1);
            }
        }
    }

    private boolean isPalindrome(int start, int end, String s) {
        while (start<end) {
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}
