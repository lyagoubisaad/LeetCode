package leetcode_categories.stack;

import java.util.Stack;

public class L20ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();
        for (char c: array) {
            if(stack.isEmpty()) {
                stack.add(c);
            } else {
                if(c == ']') {
                    if(stack.pop() != '[') return false;
                }
                else if(c == '}') {
                    if(stack.pop() != '{') return false;
                }
                else if(c == ')') {
                    if(stack.pop() != '(') return false;
                }
                else stack.add(c);
            }
        }
        return stack.isEmpty();
    }
}
