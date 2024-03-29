package leetcode_categories.arrays_hashings;

import java.util.Stack;

public class L_946_Validate_Stack_Sequences {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk = new Stack<>();
        stk.add(pushed[0]);
        int j=0;
        int i=1;
        while (i<pushed.length || j<popped.length) {
            if(i == pushed.length && stk.peek() != popped[j]) return false;
            if(stk.size() > 0 && stk.peek() == popped[j]) {
                j++;
                stk.pop();
            } else if(i<pushed.length){
                stk.add(pushed[i]);
                i++;
            }
        }
        if(i==pushed.length && j==popped.length) return true;
        return false;
    }

    public static void main(String[] args) {
        validateStackSequences(new int[] {1,0}, new int[] {1,0});
    }
}
