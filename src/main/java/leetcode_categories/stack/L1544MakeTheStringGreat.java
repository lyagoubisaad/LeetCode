package leetcode_categories.stack;

import java.util.Stack;

public class L1544MakeTheStringGreat {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()) {
            if(stack.isEmpty()) stack.add(c);
            else {
                Character top = stack.peek();
                if(Math.abs(top - c) == 32) stack.pop();
                else stack.add(c);
            }
        }
        Stack<Character> reverse = new Stack<>();
        while (!stack.isEmpty()) {
            reverse.add(stack.pop());
        }
        StringBuilder result = new StringBuilder();
        while (!reverse.isEmpty()) {
            result.append(reverse.pop());
        }
        return result.toString();
    }
}
