package leetcode_categories.math_geometry;

import java.util.HashSet;

public class L_202_HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        return helper(n, set);
    }

    private static boolean helper(int n, HashSet<Integer> set) {
        if(!set.add(n)) return false;
        if(n == 1) return true;
        String c = Integer.toString(n);
        int elem = 0;
        for (int i=0;i<c.length();i++) {
            int tmp = Integer.parseInt(String.valueOf(c.charAt(i)));
            elem += tmp * tmp;
        }
        return helper(elem, set);
    }


    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

}
