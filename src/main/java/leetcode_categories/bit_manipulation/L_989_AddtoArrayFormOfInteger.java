package leetcode_categories.bit_manipulation;

import java.util.ArrayList;
import java.util.List;

public class L_989_AddtoArrayFormOfInteger {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i=num.length-1;
        int carry = 0;
        while (i>=0 || k >0 || carry >0) {
            carry +=  k % 10;
            carry +=  i>=0 ? num[i]: 0;
            k /= 10;
            i--;
            list.add(0,carry%10);
            carry /= 10;
        }
        return list;
    }

    public static void main(String[] args) {
        addToArrayForm(new int[] {0}, 23);
    }

}
