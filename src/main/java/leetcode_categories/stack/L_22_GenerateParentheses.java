package leetcode_categories.stack;

import java.util.ArrayList;
import java.util.List;

public class L_22_GenerateParentheses {

    public static List<String> generateParenthesis(int n) {
        List<String> allElems = new ArrayList<>();
        helper(0,0,0,n, "", allElems);
        return allElems;
    }
    private static void helper(int parOpen, int parClosed, int cpt, int n, String elem, List<String> allElems) {
        if(parClosed == n) {
           allElems.add(elem);
        }
        else if(parOpen == n) {
            helper(parOpen, parClosed+1, cpt-1, n, elem+")", allElems);
        } else {
            if(cpt == 0) helper(parOpen+1, parClosed, 1, n, elem+"(", allElems);
            else {
                helper(parOpen+1, parClosed, cpt+1, n, elem+"(", allElems);
                helper(parOpen, parClosed+1, cpt-1, n, elem+")", allElems);
            }
        }
    }

    public static void main(String[] args) {
        generateParenthesis(2);
    }


}
