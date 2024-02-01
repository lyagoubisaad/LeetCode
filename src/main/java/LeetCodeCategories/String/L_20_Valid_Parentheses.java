package LeetCodeCategories.String;

import java.util.Stack;

public class L_20_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.add(s.charAt(i));
            else if (s.charAt(i) == '{') stack.add(s.charAt(i));
            else if (s.charAt(i) == '[') stack.add(s.charAt(i));
            if (s.charAt(i) == ')') {
                if(stack.empty()) return false;
                if (stack.peek() == '(') {
                    stack.pop();
                } else return false;
            }
            if (s.charAt(i) == '}') {
                if(stack.empty()) return false;
                if (stack.peek() == '{') {
                    stack.pop();
                } else return false;
            }
            if (s.charAt(i) == ']') {
                if(stack.empty()) return false;
                if (stack.peek() == '[') {
                    stack.pop();
                } else return false;
            }
        }
        if(stack.empty()) return true;
        else return false;
    }

    public static void main(String[] args) {
        String s;
        s = "{[]}";
        System.out.println(isValid(s));
    }

    //faire une stack
    //divide input en deux Open and Closing
    //divide into 3 types
}
