package leetcode_categories.string;

import java.util.HashMap;

public class L_205_Isomorphic_Strings {
    public static boolean isIsomorphic(String s, String t) {
        boolean flag = true;
        HashMap hm = new HashMap();
        for (int i=0;i<s.length();i++) {
            if(hm.containsValue(s.charAt(i))) {
                if((char) hm.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else  {
                hm.put(s.charAt(i),t.charAt(i));
            }
        }

        return flag;
    }

    public static void main(String[] args) {

        System.out.println(isIsomorphic("baba","badc"));
    }
}
