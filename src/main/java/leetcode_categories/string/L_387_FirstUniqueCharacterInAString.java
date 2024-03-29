package leetcode_categories.string;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class L_387_FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        int idx = -1;
        Queue q = new LinkedList();
        HashSet hs = new HashSet();
        for (int i=0;i<s.length();i++) {
            if(hs.contains(s.charAt(i))) {
                q.remove(s.charAt(i));
            } else {
                hs.add(s.charAt(i));
                q.add(s.charAt(i));
            }
        }
        if(q.size() == 0) return -1;
        for (int i=0;i<s.length();i++) {
            if((Character) q.peek() == s.charAt(i)) {
                idx = i;
                break;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
}
