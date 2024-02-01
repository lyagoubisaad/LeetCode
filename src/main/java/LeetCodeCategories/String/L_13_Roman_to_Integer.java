package LeetCodeCategories.String;

import java.util.ArrayList;
import java.util.HashMap;

public class L_13_Roman_to_Integer {
    public static int romanToInt(String s) {
        int res = 0;
        HashMap h = new HashMap();
        h.put("I",1);
        h.put("V",5);
        h.put("X",10);
        h.put("L",50);
        h.put("C",100);
        h.put("D",500);
        h.put("M",1000);
        ArrayList t = new ArrayList();
        for (int i=0;i<s.length();i++) {
            String a = String.valueOf(s.charAt(i));
            t.add((int) h.get(a));
            }
        if(t.size()==1) return (int) t.get(0);
        for (int i=0;i<t.size()-1;i++) {
            if((int) t.get(i) >= (int) t.get(i+1)) {
                res += (int) t.get(i);
            } else {
                res += (int) t.get(i+1) - (int) t.get(i);
                i++;
            }
            if(i==t.size()-2) res += (int) t.get(t.size()-1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("D"));
    }
}
