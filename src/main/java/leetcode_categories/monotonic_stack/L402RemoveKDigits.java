package leetcode_categories.monotonic_stack;

import java.util.Stack;

public class L402RemoveKDigits {
    public String removeKdigits(String num, int k) {
        if(k >= num.length()) return "0";
        Stack<Character> stack = new Stack<>();
        for (char c: num.toCharArray()) {
            while (!stack.isEmpty() && k>0 && stack.peek() > c) {
                stack.pop();
                k--;
            }
            stack.add(c);
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        return result.toString();
    }
}
