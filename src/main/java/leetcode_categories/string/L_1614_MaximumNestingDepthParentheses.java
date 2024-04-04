package leetcode_categories.string;

public class L_1614_MaximumNestingDepthParentheses {
    public int maxDepth(String s) {
        int depth = 0;
        int max = 0;
        for (char c: s.toCharArray()) {
            if(c == '(') depth++;
            else if(c == ')') depth = Math.max(0, depth-1);
            max = Math.max(max, depth);
        }
        return max;
    }
}
