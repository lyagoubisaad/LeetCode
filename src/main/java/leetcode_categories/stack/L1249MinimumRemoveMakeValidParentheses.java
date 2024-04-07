package leetcode_categories.stack;

import java.util.Stack;

public class L1249MinimumRemoveMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();
        int i=0;
        while (i<sb.length()) {
            if(sb.charAt(i) == ')'){
                if(stack.isEmpty()) {
                    sb.deleteCharAt(i);
                    continue;
                } else stack.pop();
            } else if(sb.charAt(i) == '(') stack.add(i);
            i++;
        }
        while (!stack.isEmpty()) {
            sb.deleteCharAt(stack.pop());
        }
        return sb.toString();
    }
}
