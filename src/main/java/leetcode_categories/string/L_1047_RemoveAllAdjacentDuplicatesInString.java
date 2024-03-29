package leetcode_categories.string;

import java.util.Stack;

public class L_1047_RemoveAllAdjacentDuplicatesInString {
    public static String removeDuplicates(String s) {
        Stack<Character> stk = new Stack();
        for (int i=0;i<s.length();i++) {
            if(!stk.isEmpty()) {
                if(stk.peek() == s.charAt(i)) {
                    stk.pop();
                } else {
                    stk.add(s.charAt(i));
                }
            } else  {
                stk.add(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty()) {
            sb.append(stk.pop());
        }
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        removeDuplicates("abbaca");
    }

}
