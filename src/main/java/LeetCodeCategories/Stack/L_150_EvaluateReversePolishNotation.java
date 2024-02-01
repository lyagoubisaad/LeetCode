package LeetCodeCategories.Stack;

import java.util.HashMap;
import java.util.Stack;

public class L_150_EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        HashMap<String, String> store = new HashMap<>();
        store.put("*","*");
        store.put("/","/");
        store.put("+","+");
        store.put("-","-");
        int nbr1, nbr2;
        Stack<Integer> stk = new Stack<>();
        for (int i=0;i<tokens.length;i++) {
            if(store.containsKey(tokens[i])) {
                nbr1 = stk.pop();
                nbr2 = stk.pop();
                stk.push(eval(nbr1,nbr2,tokens[i]));
            } else {
                stk.push(Integer.parseInt(tokens[i]));
            }
        }
        return stk.pop();
    }

    private static int eval(int nbr1, int nbr2, String elem) {
        if(elem.equals("+")) return Math.addExact(nbr1,nbr2);
        if(elem.equals("-")) return Math.subtractExact(nbr1,nbr2);
        if(elem.equals("*")) return Math.multiplyExact(nbr1,nbr2);
        if(elem.equals("/")) return nbr2/nbr1;
        return 0;
    }

    public static void main(String[] args) {
        String[] token = new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(token));
    }
}
