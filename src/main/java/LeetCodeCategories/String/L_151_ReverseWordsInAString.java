package LeetCodeCategories.String;

import java.util.Stack;

public class L_151_ReverseWordsInAString {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<String> stk = new Stack();
        for (int i=0;i<s.length();i++) {
            if(s.charAt(i) == ' ') {
                if(sb.length() != 0) {
                    stk.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        if(!sb.isEmpty()) {
            stk.add(sb.toString());
            sb.setLength(0);
        }
        while (!stk.isEmpty()) {
            if(stk.size() == 1) {
                sb.append(stk.pop());
                break;
            }
            sb.append(stk.pop());
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
}
