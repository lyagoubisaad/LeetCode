package LeetCodeCategories.String;

import java.util.ArrayList;
import java.util.HashMap;

public class L_345_ReverseVowelsofaString {
    public static String reverseVowels(String s) {
        char[] toChars = new char[s.length()];
        toChars = s.toCharArray();
        HashMap<Integer,Character> hm = new HashMap();
        ArrayList al = new ArrayList();
        for (int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'a' | s.charAt(i) ==  'e' | s.charAt(i) ==  'i' | s.charAt(i) ==  'o' | s.charAt(i) ==  'u'
            || s.charAt(i) == 'A' | s.charAt(i) ==  'E' | s.charAt(i) ==  'I' | s.charAt(i) ==  'O' | s.charAt(i) ==  'U') {
                hm.put(i,s.charAt(i));
                al.add(i);
            }
        }
        if(al.size() == 0) return s;
        for (int i=0;i<s.length();i++) {
            toChars[i] = s.charAt(i);
        }
        while (hm.size() > 1) {
            int beg = (int) al.get(0);
            int end = (int) al.get(al.size() - 1);
            toChars[beg] = (char) hm.get(end);
            toChars[end] = (char) hm.get(beg);
            hm.remove(beg);
            hm.remove(end);
            al.remove(0);
            al.remove(al.size()-1);
        }
        String ret = "";
        for (int i=0;i<toChars.length;i++) {
            ret += toChars[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
