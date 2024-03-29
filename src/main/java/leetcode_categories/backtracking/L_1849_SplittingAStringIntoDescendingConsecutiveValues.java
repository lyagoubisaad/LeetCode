package leetcode_categories.backtracking;
import java.util.ArrayList;
import java.util.List;
public class L_1849_SplittingAStringIntoDescendingConsecutiveValues {
    public static boolean splitString(String s) {
        if(s.length() < 2) return false;
        if(s.length() == 2) return Integer.parseInt(s.substring(0,1)) == Integer.parseInt(s.substring(1)) + 1;
        List<Long> lists = new ArrayList<>();
        return dfs(lists, 0, s);
    }
    private static boolean dfs(List<Long> lists, int idx, String s) {
        if(idx == s.length()) {
            if(lists.size() < 2) return false;
            for (int i=0;i<lists.size()-1;i++) {
                if(lists.get(i) != lists.get(i+1)+1) return false;
            }
            return true;
        }
        for (int i=idx+1;i<=s.length();i++) {
            try {
                long currentNbr = Long.parseLong(s.substring(idx, i));
                if(!lists.isEmpty()) {
                    if(currentNbr+1 < lists.get(lists.size()-1)) continue;
                    if(lists.get(lists.size()-1)-1 != currentNbr) return false;
                }
                lists.add(currentNbr);
                if(dfs(new ArrayList<>(lists), i, s)) return true;
                lists.remove(lists.size()-1);
            } catch (NumberFormatException e) {}
        }
        return false;
    }
}
